package apress.beehive.controls.javacontrol;

import com.amazon.xml.AWSECommerceServer.*;
import org.apache.beehive.controls.api.bean.ControlImplementation;

import java.io.Serializable;
import java.rmi.RemoteException;

@ControlImplementation
        public class AmazonControlImpl implements AmazonControl, Serializable {
    AWSECommerceServiceLocator locator = new AWSECommerceServiceLocator();

    public String searchBook(String isbn) throws RemoteException {
        String amazonUrl = "";
        try {
            System.out.println("book search is " + isbn);
            AWSECommerceServicePortType type = locator.getAWSECommerceServicePort();
            String itemId[] = {isbn.trim()};
            ItemLookup lookup = new ItemLookup();
            lookup.setAssociateTag("k_cnu01");
            lookup.setSubscriptionId("1KV619YGDHK5M0TMCAG2");
            ItemLookupRequest lookupReq = new ItemLookupRequest();
            lookupReq.setMerchantId("All");
            lookupReq.setItemId(itemId);
            lookupReq.setResponseGroup(new String[]{"Medium", "OfferFull", "Variations", "Images"});
            ItemLookupRequest[] requests = lookup.getRequest();
            requests = new ItemLookupRequest[1];
            requests[0] = lookupReq;
            lookup.setRequest(requests);
            ItemLookupResponse response = type.itemLookup(lookup);
            Items[] items = response.getItems();
            if (items != null && items.length > 0) {
                System.out.println("number of results " + items.length);
                for (int i = 0; i < items.length; i++) {
                    Item[] itemvalues = items[i].getItem();
                    if (itemvalues != null) {
                        for (int j = 0; j < itemvalues.length; j++) {
                            System.out.println("URL :" + itemvalues[j].getDetailPageURL());
                            amazonUrl = itemvalues[0].getDetailPageURL();
                        }
                    }
                }
            }
        } catch (javax.xml.rpc.ServiceException se) {
            throw new RemoteException(se.getMessage());

        }
        return amazonUrl;
    }

    public Items[] lookupISBN(String isbn) throws RemoteException {
        try {
            System.out.println("Given ISBN is " + isbn);
            AWSECommerceServicePortType type = locator.getAWSECommerceServicePort();
            String itemId[] = {isbn.trim()};
            ItemLookup lookup = new ItemLookup();
            lookup.setAssociateTag("k_cnu01");
            lookup.setSubscriptionId("1KV619YGDHK5M0TMCAG2");
            ItemLookupRequest lookupReq = new ItemLookupRequest();
            lookupReq.setMerchantId("All");
            lookupReq.setItemId(itemId);
            lookupReq.setResponseGroup(new String[]{"Medium", "OfferFull", "Variations", "Images"});
            ItemLookupRequest[] requests = lookup.getRequest();
            requests = new ItemLookupRequest[1];
            requests[0] = lookupReq;
            lookup.setRequest(requests);
            ItemLookupResponse response = type.itemLookup(lookup);
            Items[] items = response.getItems();
            if (items != null && items.length > 0) {
                System.out.println("Number of results "+ items.length);
                return items;
            }
        } catch (javax.xml.rpc.ServiceException se) {
            throw new RemoteException(se.getMessage());

        }
        return new Items[0];
    }

}

