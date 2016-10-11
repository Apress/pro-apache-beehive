package shared;

import java.io.IOException;

import org.apache.beehive.netui.pageflow.Forward;
import org.apache.beehive.netui.pageflow.PageFlowException;
import org.apache.beehive.netui.pageflow.SharedFlowController;
import org.apache.beehive.netui.pageflow.annotations.Jpf;

/**
 * This shared flow can define actions, exception handlers, and state to be shared among page flows
 * that reference it.  A page flow references this shared flow inside a <code>Jpf.Controller</code>
 * annotation as:
 * <pre>
 *     sharedFlowRefs={
 *         &#064;Jpf.SharedFlowRef(name="shared", type=shared.SharedFlow.class)
 *     }
 * </pre>
 * 
 * Once referenced, the following features apply:
 *    <ul>
 *        <li>
 *            An instance of this shared flow will be created and stored the first time the page
 *            flow is accessed.
 *        </li>
 *        <li>
 *            The page flow (or its pages) can reference actions using the pattern
 *            <i>shared-flow-name.action-name</i>, e.g., "shared.someAction".
 *        </li>
 *        <li>
 *            Unhandled exceptions in the page flow will be handled by <code>Jpf.Catch</code>
 *            annotations in this shared flow.
 *        </li>
 *        <li>
 *            In pages and annotations that bind to data using the expression language, properties
 *            in this shared flow are accessed through the <code>sharedFlow</code> binding context.
 *        </li>
 *        <li>
 *            A page flow can have an automatically-initialized member reference to this shared
 *            flow using the <code>Jpf.SharedFlowField</code> annotation, like this:
 *            <pre>
 *                &#064;Jpf.SharedFlowField(name="shared")
 *                private shared.SharedFlow _mySharedFlowReference;
 *            </pre>
 *        </li>
 *    </ul>
 */
@Jpf.Controller(
    catches={
       @Jpf.Catch(type=PageFlowException.class, method="handlePageFlowException"),
       @Jpf.Catch(type=Exception.class, method="handleException")
    }
)
public class SharedFlow
    extends SharedFlowController
{
    @Jpf.ExceptionHandler(
        forwards={
            @Jpf.Forward(name="errorPage", path="/error.jsp")
        }
    )
    protected Forward handleException(Exception ex, String actionName, String message, Object form)
    {
        System.err.print("[" + getRequest().getContextPath() + "] ");
        System.err.println("Unhandled exception caught in shared flow " + getDisplayName() + ":");
        ex.printStackTrace();
        return new Forward("errorPage");
    }

    /** 
     * Handler for native page flow exceptions (e.g., ActionNotFoundException, which is thrown when
     * an unknown page flow action is requested).  This handler allows these exceptions to write
     * informative error pages to the response when the server is not in production mode, and it
     * allows them to send an appropriate error on the response when the server is in production
     * mode.  To use the standard exception handler for these exceptions, simply remove this method
     * and the Jpf.Catch annotation that references it.
     */
    @Jpf.ExceptionHandler
    public Forward handlePageFlowException(PageFlowException ex, String actionName, String message, Object form) 
        throws IOException
    { 
        ex.sendError(getRequest(), getResponse()); 
        return null; 
    } 
}
