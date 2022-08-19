package Gfg.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DetectCycleInDirectedGraph {

    static int  grey = 1;
    static int white = 0;
    static int black = 2 ;
    static Map<Integer,Integer> color = new HashMap<>();
    public static void main(String[] args) {


    }

    public static void dfs( ArrayList<ArrayList<Integer>> adj,int V,Map<Integer,Integer> color){
        boolean[] isVisited = new boolean[V+1];
        for(int i=0;i<V;i++){
            if(!isVisited[i]){
                dfsRec(color,adj,i,isVisited);
            }
        }
    }


    public static boolean dfsRec(Map<Integer,Integer> color,
                              ArrayList<ArrayList<Integer>> adj,
                              int source,boolean[] isVisited){
        isVisited[source] = true ;
        color.put(source,grey);
        for(int nextVertex:adj.get(source)){
        if(!isVisited[nextVertex]){
            dfsRec(color,adj,nextVertex,isVisited);
        } else if (color.get(nextVertex).equals(grey)){
            return true ;
           }
        }
        color.put(source,black);
       return false ;
    }





}
