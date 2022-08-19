package algoExpert.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheImpl {


    Map<Integer,Node> mp ;
    Node head ;
    Node tail ;
    int capacity ;
    public LRUCacheImpl(int capacity) {
        this.capacity = capacity ;
        mp = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail ;
        tail.prev = head ;
    }

    public int get(int key) {

        if(mp.containsKey(key)){
            Node node = mp.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1 ;
        }

    }

    public void put(int key, int value) {

        if(mp.containsKey(key)) {   // remove
            remove(mp.get(key));
        }
        if(mp.size()==capacity){
            remove(tail.prev);
        }

        insert(new Node(key,value)) ;

    }

    private void remove(Node node){
        mp.remove(node.key) ;
        node.prev.next=node.next ;
        node.next.prev=node.prev ;

    }

    private void insert(Node node){
        mp.put(node.key,node);
        Node tempNode = head.next ;
        head.next = node ;
        node.prev=head ;
        node.next = tempNode ;
        tempNode.prev=node ;
    }




    class Node {

        Node prev ;
        Node next ;
        int key ;
        int value ;

        Node(int key,int value){
            this.value=value;
            this.key=key ;
        }
    }
}
