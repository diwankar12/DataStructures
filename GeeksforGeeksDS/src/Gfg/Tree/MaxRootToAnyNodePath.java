package Gfg.Tree;

import Gfg.Tree.Impl.Node;

public class MaxRootToAnyNodePath {




    public static int getMaxPath(Node root){


        if (root==null){
            return 0 ;
        }
        return Math.max(Math.max(getMaxPath(root.left),
                getMaxPath(root.right))+root.data ,
                root.data);


    }
}
