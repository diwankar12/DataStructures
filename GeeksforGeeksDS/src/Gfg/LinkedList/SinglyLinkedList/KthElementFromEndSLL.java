package Gfg.LinkedList.SinglyLinkedList;

import Gfg.LinkedList.SinglyLinkedList.Impl.Node;

public class KthElementFromEndSLL {


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        getKthFromEnd(head,5);
    }

    public static void getKthFromEnd(Node head,int k){

      // traverse to kth position

        if(head==null){
            System.out.println("-1");
        }

        Node head2 = head ;
        int counter = 0 ;
        while(counter<k){
            if(head==null){
                System.out.println("k is greater than size of the list");
                return;
            }
            head = head.next ;
            counter++ ;
        }

        while(head !=null){
            head2=head2.next ;
            head = head.next ;
        }

        System.out.println(head2.data);


    }

}
