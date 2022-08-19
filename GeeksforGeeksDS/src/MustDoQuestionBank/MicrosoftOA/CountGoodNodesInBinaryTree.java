package MustDoQuestionBank.MicrosoftOA;

public class CountGoodNodesInBinaryTree {

    public int goodNodes(TreeNode root) {

        return getNodes(root,root.val);

    }


    private int getNodes(TreeNode root,int max){

        if(root==null) return 0;
        else {
            if(max<=root.val){
                return 1+getNodes(root.left,root.val)+getNodes(root.right,root.val) ;

            } else {
                return getNodes(root.left,max) + getNodes(root.right,max) ;

            }
        }



    }
    // ======== GOOD Solution =======

//    class Solution
//    {
//        int count = 0;
//        public int goodNodes(TreeNode root)
//        {
//            dfs(root , Integer.MIN_VALUE);
//            return count;
//        }
//        void dfs(TreeNode root , int max)
//        {
//            if(root==null)
//                return;
//
//            if(root.val>=max)
//                count++;
//
//            dfs(root.left , Math.max(max , root.val));
//            dfs(root.right , Math.max(max , root.val));
//        }
//    }


}
