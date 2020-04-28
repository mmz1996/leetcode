package question146_LRU缓存机制;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Hashtable;

/**
 * @Classname LRUCache
 * @Description TODO
 * @Date 2020/4/15 11:40
 * @Created by mmz
 */
public class LRUCache {


    class DlinkedNode{
        int key;
        int value;
        DlinkedNode pre = null;
        DlinkedNode next = null;
    }

    private Hashtable<Integer, DlinkedNode> cache =
            new Hashtable<Integer, DlinkedNode>();
    private int size;
    private int capacity;
    private DlinkedNode head, tail;

    private  void addNode(DlinkedNode node){
        node.next = head.next;
        node.pre = head;

        head.next.pre = node;
        head.next = node;
    }

    private void removeNode(DlinkedNode node){
        DlinkedNode preNode = node.pre;
        DlinkedNode nextNode = node.next;
        preNode.next = nextNode;
        nextNode.pre = preNode;
    }

    private void moveToHead(DlinkedNode node){
        removeNode(node);
        addNode(node);
    }

    private DlinkedNode popTail(){
        DlinkedNode res = tail.pre;
        removeNode(res);
        return res;
    }

    public LRUCache(int capacity){
        this.size = 0;
        this.capacity = capacity;

        head = new DlinkedNode();
        tail = new DlinkedNode();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key){
        DlinkedNode node = cache.get(key);
        if(node == null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key ,int value) {
        DlinkedNode node = cache.get(key);

        if (node == null) {
            DlinkedNode newNode = new DlinkedNode();
            newNode.key = key;
            newNode.value = value;

            cache.put(key, newNode);
            addNode(newNode);
            ++size;

            if (size > capacity) {
                DlinkedNode tail = popTail();
                cache.remove(tail.key);
                --size;
            }
        }else{
            node.value = value;
            moveToHead(node);
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);

    }
}
