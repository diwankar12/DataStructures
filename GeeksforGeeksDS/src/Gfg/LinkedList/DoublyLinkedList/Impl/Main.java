package Gfg.LinkedList.DoublyLinkedList.Impl;

public class Main {

    public static void main(String[] args) {

        NodeDll head = new NodeDll(10 );
        NodeDll tmp1 = new NodeDll(20 );
        NodeDll tmp2 = new NodeDll(30 );

        head.next = tmp1;
        tmp1.previous= head ;
        tmp1.next=tmp2;
        tmp2.previous= tmp1 ;



    }
}
