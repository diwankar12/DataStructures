package Gfg.stack.impl.LinkedList;

public class MyStack {

    public Node head ;
    int size ;

    MyStack(){
        head = null ;
        size = 0 ;
    }

    public int size(){
        return size ;
    }

    public boolean isEmpty(){
        return size==0 || head == null ;
    }

    public void push(int x){
        Node newNode = new Node(x);

        newNode.next = head;
        if(head!=null) {
            head = newNode;
        }
        size++;
    }

    public int pop(){
          if(head==null){
              return -1 ;
          }
          int res = head.data ;
           head = head.next ;
           //head.next= null ;
           size--;
           return res ;

    }


    public int peek(){
        if(head==null){
            return -1 ;
        }

        return head.data ;
    }



}
