package GRAPH.TOPOLOGICALSORT.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSortDFSUsingNodeClass {

     Stack<Node> stack ;

    public TopologicalSortDFSUsingNodeClass(){
        stack = new Stack<>();
    }


    public static void main(String[] args) {

        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);


        TopologicalSortDFSUsingNodeClass sort = new TopologicalSortDFSUsingNodeClass();
        sort.getTopoSort(node40);
        Stack<Node> res = sort.stack;
        while(!res.isEmpty()){
            System.out.println(res.pop().data+" ");
        }



    }

    public void getTopoSort(Node node){
        List<Node> ls = node.getNeighbours();
        for(Node elem : ls){
            if(elem!=null && !elem.visited) {
                elem.visited=true ;
                getTopoSort(elem);

            }
        }

        stack.push(node) ;
    }


    static class Node {

        int data ;
        boolean visited ;
        List<Node> neighbours ;

        Node(int data){
            this.data = data ;
            neighbours = new ArrayList<>();
        }

        public void addneighbours(Node neighbour){
            this.neighbours.add(neighbour) ;
        }

        public List<Node> getNeighbours(){

            return neighbours ;
        }

    }

}
