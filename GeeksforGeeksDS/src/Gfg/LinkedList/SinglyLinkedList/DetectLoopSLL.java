package Gfg.LinkedList.SinglyLinkedList;

import Gfg.LinkedList.SinglyLinkedList.Impl.Node;

public class DetectLoopSLL {

    // detect a loop
    // what's size of the loop
    //3. head of the loop

    public static void main(String[] args) {

    }


    public static boolean detectLoop(Node head){

        // fast pointer and slow pointer

        Node slowPointer = head;
        Node fastPointer = head ;
        boolean isCycle = false ;

        // this condition to test if the loop doesn't have cycle
        while(fastPointer!=null && fastPointer.next!=null) {

            slowPointer = head.next;
            fastPointer = head.next.next;

            if (fastPointer == slowPointer) {

                // length of the cycle
                isCycle= true ;
                break;
            }
        }
        if(isCycle==false){
            return false ;
        }
        int cycleLen = 1 ;
        slowPointer = slowPointer.next ;
        while(slowPointer!=fastPointer){
            cycleLen++ ;
            slowPointer = slowPointer.next ;
        }

        System.out.println(cycleLen);
        return isCycle;
    }


  public static void getHeadLoop(Node head){






  }




}
