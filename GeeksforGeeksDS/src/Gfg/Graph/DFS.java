package Gfg.Graph;
import java.util.ArrayList;

//undirected graph

/*
   0->1,4
   1-> 0,2
   2->1,3
   3->2
   4->0,5,6
   5->4,6
   6->4,5

 */

public class DFS {



    public static void getDfs(ArrayList<ArrayList<Integer>> adj,int V){

        boolean[] visited = new boolean[V+1];
        for(int i=0;i<V;i++){
            if(!visited[i]) {
                dfs(adj, visited, i);
            }
        }

    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int source){


        visited[source] = true ;
        System.out.print(source+" ");
        for(int u : adj.get(source)){
            if(!visited[u]){
                dfs(adj,visited,u);
            }
        }
    }
}
