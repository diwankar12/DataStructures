package Gfg.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FindShortestPath {

    //bfs algo

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,0,2);
        addEdge(adj,1,3);

        System.out.println(Arrays.toString(getShortestPath(adj,V,0)));


    }

    public static int[] getShortestPath(ArrayList<ArrayList<Integer>> adj,int V,int source){

        boolean[] visited = new boolean[V+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        int[] length = new int[V];
        length[source] = 0 ;
        visited[source] = true ;
        while(!queue.isEmpty()){
            int element = queue.poll();
            // visit adjacent of the queue
            for(int v : adj.get(element)){
                if(!visited[v]){
                    length[v] = length[element] + 1 ;
                    visited[v] = true ;
                    queue.add(v);
                }
            }
        }

   return length ;


    }


    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


}
