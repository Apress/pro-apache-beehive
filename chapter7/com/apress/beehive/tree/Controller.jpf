package com.apress.beehive.tree;

import org.apache.beehive.netui.pageflow.Forward;
import org.apache.beehive.netui.pageflow.PageFlowController;
import org.apache.beehive.netui.pageflow.annotations.Jpf;
import org.apache.beehive.netui.tags.tree.TreeElement;


@Jpf.Controller
        public class Controller extends PageFlowController {

    TreeElement myTree;

    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "FrameSet.jsp")
            })
            protected Forward begin() {
        return new Forward("success");
    }

    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "FrameSet.jsp"),
            @Jpf.Forward(name = "0", path = "RootFolder.jsp"),
            @Jpf.Forward(name = "0.0", path = "I.jsp"),
            @Jpf.Forward(name = "0.0.0", path = "IA.jsp"),
            @Jpf.Forward(name = "0.0.0.0", path = "IA1.jsp"),
            @Jpf.Forward(name = "0.0.0.1", path = "IA2.jsp"),
            @Jpf.Forward(name = "0.0.1", path = "IB.jsp"),
            @Jpf.Forward(name = "0.0.1.0", path = "IB1.jsp"),
            @Jpf.Forward(name = "0.0.1.1", path = "IB2.jsp"),
            @Jpf.Forward(name = "0.0.2", path = "IC.jsp"),
            @Jpf.Forward(name = "0.0.2.0", path = "IC1.jsp"),
            @Jpf.Forward(name = "0.0.2.1", path = "IC2.jsp"),
            @Jpf.Forward(name = "0.1", path = "II.jsp"),
            @Jpf.Forward(name = "0.1.0", path = "IIA.jsp"),
            @Jpf.Forward(name = "0.1.0.0", path = "IIA1.jsp"),
            @Jpf.Forward(name = "0.1.0.1", path = "IIA2.jsp"),
            @Jpf.Forward(name = "0.1.1", path = "IIB.jsp"),
            @Jpf.Forward(name = "0.1.1.0", path = "IIB1.jsp"),
            @Jpf.Forward(name = "0.1.1.1", path = "IIB2.jsp"),
            @Jpf.Forward(name = "0.1.2", path = "IIC.jsp"),
            @Jpf.Forward(name = "0.1.2.0", path = "IIC1.jsp"),
            @Jpf.Forward(name = "0.1.2.1", path = "IIC2.jsp"),
            @Jpf.Forward(name = "tree", path = "tree.jsp")
            })
            public Forward treeState() {
        TreeElement rootNode = this.getMyTree();
        String selectedNode = null;
        String expandedNode = null;
        selectedNode = getRequest().getParameter(TreeElement.SELECTED_NODE);
        System.out.println("Selected Node is "+selectedNode);
        expandedNode = getRequest().getParameter(TreeElement.EXPAND_NODE);
        System.out.println("Expanded Node is "+expandedNode);
        if (expandedNode != null) {
            TreeElement node = rootNode.findNode(expandedNode);

            if (node != null) {
                System.out.println("expanded Node found is "+node.getLabel());
                System.out.println("node is expanded bfore"+ node.isExpanded());

                node.setExpanded(!node.isExpanded());
                 System.out.println("node is expanded after"+ node.isExpanded());


            }
           this.setMyTree(rootNode);
            return new Forward("tree");
        }
        return new Forward(selectedNode);
    }

    public TreeElement getMyTree() {
        return myTree;
    }

    public void setMyTree(TreeElement myTree) {
        this.myTree = myTree;
    }

}
