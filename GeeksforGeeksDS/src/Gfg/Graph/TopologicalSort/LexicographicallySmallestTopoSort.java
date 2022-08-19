package Gfg.Graph.TopologicalSort;

import java.util.*;

public class LexicographicallySmallestTopoSort {


        static Map<Integer,Integer> indegree = new HashMap<>();

        public static void getTopoSort(ArrayList<ArrayList<Integer>> adj,int V){

            // populate indegree
            for(int i=0;i<V;i++){
                for(int v:adj.get(i)){
                   indegree.put(v,indegree.get(v)+1);
                }
            }
            // create a priority queue
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            // if the
            for(int i=0;i<V;i++){
                if(indegree.get(i)==0){
                    pq.add(i);
                }
            }

            while(!pq.isEmpty()){

                int element = pq.poll();
                System.out.println(element+" ");
                for(int u:adj.get(element)){
                    indegree.put(u,indegree.get(u)-1);
                    if(indegree.get(u)==0){
                        pq.add(u);
                    }
                }
            }
        }
}
