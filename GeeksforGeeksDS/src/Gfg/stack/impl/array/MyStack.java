package Gfg.stack.impl.array;

public class MyStack {

    int[] arr ;
    int cap ;
    int top ;


    MyStack(int cap){
     top=-1;
     this.cap = cap ;
     arr = new int[cap];
    }

    public void push(int x){
        top++ ;
        arr[top] = x ;
    }

    public int pop(){
      if(top==-1){
          return -1;
      }
        int res = arr[top] ;
        top--;
        return res ;
    }

    public int size(){
        return top + 1 ;

    }


    public boolean isEmpty(){
        return top==-1 ;
    }


}
