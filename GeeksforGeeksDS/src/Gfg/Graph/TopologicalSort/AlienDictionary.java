package Gfg.Graph.TopologicalSort;

import java.util.*;

public class AlienDictionary {

     /*  Alien dictionary
      Input: words = ["wrt","wrf","er","ett","rftt"]
      Output: "wertf"

      Input: words[] = {"baa", "abcd", "abca", "cab", "cad"}
      Output: Order of characters is 'b', 'd', 'a', 'c'
     */

   static Map<Character,Integer> indegree = new HashMap<>();
   static Queue<Character> characters = new LinkedList<>();

    public static void main(String[] args) {

        String[] words = new String[]{"wrt","wrf","er","ett","rftt"};

    }

     public static void topoSort(String[] words,ArrayList<ArrayList<Character>> adj){

         // compare the words and push it into the adjacency list
         for(int i=0;i<words.length-1;i++){
              String word1 = words[i] ;
              String word2 =  words[i+1];
          for(int j=0;j<Math.min(word1.length(),word2.length());j++){
               if(word1.charAt(j) != word2.charAt(j)){
                   adj.get(word1.charAt(j)).add(word2.charAt(j));
                   indegree.put(word2.charAt(j),indegree.get(word2.charAt(j))+1);
                   break ;
               }
             }
         }
         // push in the queue
         for(char c = 'a' ; c<='z';c++){
             if(indegree.get(c)==0){
                 characters.add(c);
             }
         }
         // then we will perform topo sort and get the order
          while(!characters.isEmpty()){
              int element = characters.poll();
              System.out.println(element+" ");
              for(char v:adj.get(element)){
                  int vertex = indegree.get(v)-1;
                  indegree.put(v,vertex);
                  if(indegree.get(v)==0){
                      characters.add(v);
                  }
              }
          }
     }

}
