package algoExpert.BinaryTree;

import java.util.*;

public class FindNodesDistanceK {


    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public ArrayList<Integer> findNodesDistanceK(BinaryTree tree, int target, int k) {
        // Write your code here.

        Map<BinaryTree,BinaryTree> childToParentMapping =  getparentMap(tree);
        Queue<BinaryTree> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Boolean> visited = new HashMap<>();
        BinaryTree targetedValue = null;
       for(Map.Entry<BinaryTree,BinaryTree> mp : childToParentMapping.entrySet()){

           if(mp.getKey().value==target){
               targetedValue=mp.getKey();
           }
       }
        queue.add(targetedValue);
        visited.put(target,true);
        int level = 0 ;
        while(!queue.isEmpty()){
            if(level==k) break ;
            level++;

            for(int i=0;i<queue.size();i++){
                BinaryTree node = queue.poll();
                if(node.left!=null && visited.get(node.left)==null){
                    BinaryTree tempNode = node.left;
                    queue.add(tempNode);
                    visited.put(tempNode.value,true);
                }
                if(node.right!=null && visited.get(node.right)==null){
                    BinaryTree tempNode1 = node.right;
                    queue.add(tempNode1);
                    visited.put(tempNode1.value,true);
                }
                if(childToParentMapping.get(node)!=null && visited.get(childToParentMapping.get(node))==null){
                    BinaryTree tempNode2 = childToParentMapping.get(node);
                    queue.add(tempNode2);
                    visited.put(tempNode2.value,true);
                }
            }
        }

        while(!queue.isEmpty()){
            ans.add(queue.poll().value);
        }
        return ans;
    }


    public Map<BinaryTree,BinaryTree> getparentMap(BinaryTree root){
        Queue<BinaryTree> queue = new LinkedList<>();
        Map<BinaryTree,BinaryTree> mp = new HashMap<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTree node = queue.poll();
            if(node.left!=null){
                queue.add(node.left);
                mp.put(node.left,node);
            }
            if(node.right!=null){
                queue.add(node.right);
                mp.put(node.right,node);
            }
        }
        return mp ;
    }
}
