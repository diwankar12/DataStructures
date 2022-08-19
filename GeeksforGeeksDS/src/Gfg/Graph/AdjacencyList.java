package Gfg.Graph;


import java.util.ArrayList;

// undirected graph
public class AdjacencyList {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

        int V = 5 ;

        for(int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }

        createEdge(adjList,0,1);
        createEdge(adjList,0,2);
        createEdge(adjList,1,2);
        createEdge(adjList,1,3);
        printGraph(adjList);
    }


    public static void createEdge(ArrayList<ArrayList<Integer>> adj,int v,int u){

      adj.get(v).add(u);
      adj.get(u).add(v);
    }


    public static void printGraph(ArrayList<ArrayList<Integer>> adjList){
        int count = 0 ;
        for(ArrayList<Integer> adjInner:adjList){
            System.out.print(count);
            for(Integer adjFinal:adjInner){
                System.out.print("->"+adjFinal);
            }
            System.out.println();
            count++ ;
        }


    }


}
