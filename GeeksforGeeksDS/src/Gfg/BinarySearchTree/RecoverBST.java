package Gfg.BinarySearchTree;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
    }
  }


class RecoverBST {

    public void recoverTree(TreeNode root) {

        TreeNode first = null;
        TreeNode second = null ;
        TreeNode prev =  new TreeNode(Integer.MIN_VALUE) ;
        TreeNode last = null ;
        recoverTreeRec(root,first,second,prev,last);

        if (first!=null && last !=null){
            int temp = first.val ;

            first.val = last.val ;
            last.val = temp ;
        } else if (first!=null && second !=null){
            int temp = first.val ;

            first.val = second.val ;
            second.val = temp ;
        }
    }

    public void recoverTreeRec(TreeNode root,TreeNode first,TreeNode second,TreeNode prev,TreeNode last){

        if(root==null) return ;


        recoverTreeRec(root.left,first,second,prev,last);

        //case 1. when the swapped nodes are adjacent to each other
        if(prev !=null && (root.val<prev.val)){
            if(first==null){
                first = prev;
                second = root ;
            }else {
                last = root ;
            }
        }
        prev = root ;
        recoverTreeRec(root.right,first,second,prev,last);
    }



}
