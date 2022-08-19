package Gfg.LinkedList.SinglyLinkedList;

import Gfg.LinkedList.SinglyLinkedList.Impl.Node;

public class KThNodeFromBeginingLL {


    public static void main(String[] args) {



        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        getKthNode(head,5);
    }


     public static int getKthNode(Node head,int k){


        int counter = 0 ;

        while(counter<k && head!=null){
            head = head.next ;
            counter++;
        }
        if(k>counter){
            return -1 ;
        }
        return head.data ;
     }

}
