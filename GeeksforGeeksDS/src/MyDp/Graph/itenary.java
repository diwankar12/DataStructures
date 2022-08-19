package MyDp.Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class itenary {

        public List<String> findItinerary(List<List<String>> tickets) {

            List<Pair> adjList = createAdjList(tickets);
            Collections.sort(adjList,new Comparator<Pair>(){

                @Override
                public int compare(Pair o1, Pair o2) {
                    return o2.destination.compareTo(o1.destination);
                }
            }) ;
            System.out.println(adjList.toString());
            List<String> ans = new ArrayList<>();
            for(Pair pair : adjList){
                String src = pair.source ;
                if(src.equals("JFK") && pair.isVisited==false){
                    ans.add(src);
                    dfs(adjList,pair,ans);
                }
            }
            return ans ;
        }

        private void dfs(List<Pair> adjList,Pair pair ,List<String> ans ){
            pair.isVisited= true ;
            String destination = pair.destination ;
            ans.add(destination);
            for(Pair p : adjList){
                if(p.source.equals(destination) && !p.isVisited){
                    dfs(adjList,p,ans);
                }
            }

        }
        private List<Pair> createAdjList(List<List<String>> tickets){
            List<Pair> adjList = new ArrayList<>();
            for(List<String> ls : tickets){
                adjList.add(new Pair(ls.get(0),ls.get(1)));
            }
            return adjList ;
        }
        class Pair{

            String source ;
            String destination ;
            boolean isVisited = false ;
            Pair(String source,String destination){
                this.source = source ;
                this.destination = destination ;
            }

            @Override
            public String toString(){
                return "[" + this.source + " ," + this.destination  +"]" ;
            }
        }
    }





