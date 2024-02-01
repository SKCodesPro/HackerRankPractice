package org.example.lrucache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheImpl implements LRUCache
{
    int capacity;
    public LRUCacheImpl(int capacity){
        this.capacity = capacity;
    }
    LinkedList<Integer> orderList = new LinkedList<>();
    Map<Integer, Integer> cache= new HashMap<>(capacity);

    @Override
    public void put(int key, int value) {
        // If the size of the Linked list is greater than the capacity
        // remove the last element from the linked list which maintains the order of access of keys
        // The frequency of access is decided in the get method
        // Once the
        if(orderList.size() >= capacity){
            int keyRemoved = orderList.removeLast();
            cache.remove(keyRemoved);

        }
        // Once the eviction is done add the key to first of linked list
        orderList.addFirst(key);
        cache.put(key, value);
    }

    @Override
    public int get(int key) {
        // If the cache contains the key get denotes its recently accessed
        // So this key has to go to the top of the recently used items
        // Reordering of the keys happens below
        if(cache.containsKey(key)){
            orderList.remove((Object) key);
            orderList.addFirst(key);
            return cache.get(key);
        }
        return  0;
   }

    public static void main(String[] args) {
        LRUCacheImpl lruCache = new LRUCacheImpl(3);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.get(2);
        lruCache.get(1);
        lruCache.put(3, 3);
        lruCache.get(1);
        lruCache.put(4, 4);

            for(int key: lruCache.orderList){
                System.out.println(lruCache.cache.get(key));
            }
    }
}
