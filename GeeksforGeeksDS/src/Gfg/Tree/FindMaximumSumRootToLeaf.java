package Gfg.Tree;

import Gfg.Tree.Impl.Node;

public class FindMaximumSumRootToLeaf {



// find path as well
    public static int getMax(Node root){

        if(root==null){
            return 0 ;
        }
     return Math.max(getMax(root.left),getMax(root.right)) + root.data;


    }

}
