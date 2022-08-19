package Gfg.LinkedList.SinglyLinkedList;

import Gfg.LinkedList.SinglyLinkedList.Impl.Node;

public class TraversingSLL {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        traverse(head);
    }


    public static void traverse(Node head){

        while(head != null){

            System.out.println(head.data);
            head = head.next ;

        }
    }
}
