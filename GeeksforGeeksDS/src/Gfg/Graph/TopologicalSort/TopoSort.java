package Gfg.Graph.TopologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopoSort {

    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        int[] res = new int[V+2];
        int count = 0 ;
        // create indegree of the vertices
        int[] indegree = createIndegree(adj,V);
        //create a queue
        Queue<Integer> queue = new LinkedList<>();
        // push into the queue which has zero indegree
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        // iterate over queue
        while(!queue.isEmpty()){
            // pop the element and reduce the indegree by one
            int element = queue.poll();
            res[count] = element ;
            count++ ;
            for(int v : adj.get(element)){
                if( --indegree[v]==0){
                    queue.add(v) ;
                }
            }
        }
        return res ;
    }

    static int[] createIndegree(ArrayList<ArrayList<Integer>> adj,int V){

        int[] indegree = new int[V];
        for(int i=0;i<V;i++){
            for(int vertex:adj.get(i)){
                indegree[vertex]++;
            }
        }
        return indegree ;
    }
}
