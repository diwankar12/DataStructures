package Gfg.Graph;

import java.util.ArrayList;

public class DetectCycleUndirectedGraph {


    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean[] isVisited = new boolean[V+1];
        for(int i=0;i<V;i++){
            if(!isVisited[i]){
                if(dfs(adj,isVisited,-1,i))
                    return true ;
            }
        }
        return false  ;
    }


    public boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] isVisited, int parentVertex, int currentVertex) {

        isVisited[currentVertex] = true;
        for (int nextVertex : adj.get(currentVertex)) {
            if (!(isVisited[nextVertex])) {
                dfs(adj, isVisited, currentVertex, nextVertex);
            } else if (isVisited[nextVertex] && (nextVertex == parentVertex)) {
                return true;
            }
        }
        return false;
    }


    public boolean DFSRec(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited, int parent)
    {
        visited[s]=true;

        for(int u:adj.get(s)){
            if(!visited[u]){
                if(DFSRec(adj, u, visited, s))
                {return true;}}
            else if(u!=parent)
            {return true;}
        }
        return false;
    }

    public boolean isCycleUn(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i])
                if(DFSRec(adj, i, visited, -1))
                    return true;
        }
        return false;
    }


}
