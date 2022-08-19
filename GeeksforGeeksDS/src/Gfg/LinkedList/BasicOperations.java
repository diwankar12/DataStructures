package Gfg.LinkedList;

import javax.xml.crypto.Data;

public class BasicOperations {
    Node head ;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // insertion of new node at the beginning
    public void insertAtBeginning(int data){

        Node newNode = new Node(data);
        newNode.next = head ;
        head = newNode ;

    }

    //insert after a node
    public void insertAfter(Node prevNode ,int newData){

       if(prevNode==null){
           System.out.println();
           return;
       }

       Node newNode = new Node(newData);
       newNode.next = prevNode.next ;
       prevNode.next=newNode;

    }


    //insert at the end
    public void insertAtTheEnd(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=null;
        //traverse
        Node currNode = head ;
        while(currNode.next!=null){
            currNode=currNode.next ;
        }
        currNode.next=newNode;
        return;
    }

    //delete a node
    void deleteNode(int position){

        if(head==null){
            return;
        }





    }





}
