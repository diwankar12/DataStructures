package Gfg.LinkedList.SinglyLinkedList;

import Gfg.LinkedList.SinglyLinkedList.Impl.Node;

public class RecursiveTraversalSLL {


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printRecursive(head);
    }



    public static void printRecursive(Node head){

        if(head==null){
            return;
        }
        System.out.print(head.data+" ");

        printRecursive(head.next);



    }
}
