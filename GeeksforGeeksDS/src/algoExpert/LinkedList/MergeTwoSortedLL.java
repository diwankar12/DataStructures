package algoExpert.LinkedList;



class Solution {

    class ListNode{
        int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }



    public ListNode MergeTwoSortedLL(ListNode l1, ListNode l2) {

        if(l1==null) return l2;
        if(l2==null) return l1;

        // point res to the lowest linked list
        if(l1.val>l2.val){
            ListNode temp = l1;
            l1=l2 ;
            l2=temp;
        }

        ListNode res =l1 ;

        while(l1!=null &&l2!=null){
            ListNode temp = null ;
            while(l1!=null && l2.val>= l1.val){
                temp=l1;
                l1=l1.next ;
            }
            // this means l2 is less than l1
            temp.next=l2 ;
            ListNode tmp = l1;
            l1=l2 ;
            l2=tmp;
        }

        return res ;

    }
}