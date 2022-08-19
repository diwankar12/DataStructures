package algoExpert.BinaryTree;

public class SumOfMaxToAnyNode {


    public static void main(String[] args) {


    }


    private static int getMaxSum(Tree root){
        if(root==null) return 0;
        if(root.left==null || root.right==null) return 0;

        int leftNode = getMaxSum(root.left);
        int rightNode = getMaxSum(root.right);

        return Math.max(Math.max(leftNode,rightNode)+root.value,root.value);
    }


    class Tree{

        public int value ;
        public Tree left ;
        public Tree right ;

        public Tree(int val){
            this.value=val;
        }
    }




}
