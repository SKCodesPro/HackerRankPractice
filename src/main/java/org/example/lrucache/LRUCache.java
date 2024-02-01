package org.example.lrucache;

public interface LRUCache {
    void put(int key, int value);
    int get(int key);
}
