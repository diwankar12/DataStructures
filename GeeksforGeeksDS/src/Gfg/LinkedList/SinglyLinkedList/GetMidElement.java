package Gfg.LinkedList.SinglyLinkedList;

import Gfg.LinkedList.SinglyLinkedList.Impl.Node;

public class GetMidElement {


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(80);
        getMinElem(head);
    }


    // 2,3,4,5,6   0/p: 4
    // 2,3,4,5,6,7
    //o/p 5(right middle)
    public static void getMinElem(Node head){

     // two pointers (slow and fast)
     Node slowPointer = head ;
     Node fastPointer = head ;

     while(fastPointer != null && fastPointer.next!=null){

         slowPointer = slowPointer.next ;
         fastPointer = fastPointer.next.next ;
     }
        System.out.println(slowPointer.data);
    }


}
