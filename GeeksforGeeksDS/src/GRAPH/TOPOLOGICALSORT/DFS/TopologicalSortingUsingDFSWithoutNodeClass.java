package GRAPH.TOPOLOGICALSORT.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TopologicalSortingUsingDFSWithoutNodeClass {

    public static void main(String[] args) {

        List<List<Integer>> adj = new ArrayList<>() ;
        int n= 6 ;
        for(int i=0;i<=n;i++){
            List<Integer> ls = new ArrayList<>();
            adj.add(ls);
        }

        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);
        TopologicalSortingUsingDFSWithoutNodeClass topo = new TopologicalSortingUsingDFSWithoutNodeClass();
        int[] res = topo.getTopoSort(adj,n);
        System.out.println(Arrays.toString(res));

    }

    public int[] getTopoSort(List<List<Integer>> adj,int n){
         Stack<Integer> stack = new Stack<>();
         boolean[] visited = new boolean[adj.size()];
         for(int i=0;i<n;i++){
             if(!visited[i]){
                 dfs(stack,adj,visited,i);
             }
         }
         int[] res = new int[n];
         int idx = 0;
         while(!stack.isEmpty()){
               res[idx++] = stack.pop();
         }
         return res ;
    }

    public void dfs(Stack<Integer> stack,List<List<Integer>> adj,boolean[] visited,int i){

        visited[i] = true ;

        for(Integer elem : adj.get(i)){
            if(!visited[elem]){
                dfs(stack,adj,visited,elem);
            }
        }
        stack.push(i);

    }


}
