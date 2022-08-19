package algoExpert.Algorithms;

import java.util.*;

public class TopologicalSorting {


    public static void main(String[] args) {

        List<Integer> jobs = Arrays.asList(1,2,3,4);
        Integer[] a1 = new Integer[]{1,2};
        Integer[] a2 = new Integer[]{1,3};
        Integer[] a3 = new Integer[]{3,2};
        Integer[] a4 = new Integer[]{4,2};
        Integer[] a5 = new Integer[]{4,3};

        List<Integer[]> deps = new ArrayList<>();
        deps.add(a1);
        deps.add(a2);
        deps.add(a3);
        deps.add(a4);
        deps.add(a5);

        System.out.println(topologicalSort(jobs,deps).toString());

    }


    public static List<Integer> topologicalSort(List<Integer> jobs, List<Integer[]> deps) {
        // Write your code here.

        // using dfs approach
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[jobs.size()+1];
        //  create adjacency list
        Map<Integer,ArrayList<Integer>> adjList = new HashMap<>();
        for(int i=0;i<deps.size();i++){
            Integer[] list = deps.get(i);
            if(adjList.containsKey(list[0])){
                adjList.get(list[0]).add(list[1]);
            } else {
               ArrayList<Integer> ls = new ArrayList<>();
               ls.add(list[1]);
                adjList.put(list[0],ls);
            }
        }
        // start dfs
        for(int i=0;i<jobs.size();i++){
            if(!visited[jobs.get(i)]){
                dfs(jobs.get(i),adjList,stack,visited);
            }
        }
       while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        return ans ;
    }

    public static void dfs(int jobs,Map<Integer,ArrayList<Integer>> adjList,Stack<Integer> stack
            ,boolean[] visited){

        visited[jobs] = true ;
        for(Integer elem : adjList.get(jobs)){
            if(!visited[elem]){
                dfs(elem,adjList,stack,visited);
            }
        }
        stack.push(jobs);
    }
}

