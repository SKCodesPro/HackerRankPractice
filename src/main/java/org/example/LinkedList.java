package org.example;

import com.sun.source.tree.BreakTree;

import javax.swing.*;

public class LinkedList {
    Node head;
    static class Node {
        Object data;
        Node next;
        Node(Object data){
            this.data = data;
            next = null;
        }
    }
    public LinkedList insert (LinkedList list, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            Node lastNode = list.head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return list;
    }
    public void displayList(LinkedList linkedList){
        Node currentNode = linkedList.head;
        while (currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
    public LinkedList deleteByKey(LinkedList linkedList, int keyToDelete){
        Node headNode = linkedList.head;
        if(headNode.data.equals(keyToDelete)){
            linkedList.head = linkedList.head.next;
        }
        else{
            Node currentNode = headNode.next;
            Node prev = currentNode;
            while(currentNode.next != null){

            }
        }
        return linkedList;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(linkedList, 1);
        linkedList.insert(linkedList, 2);
        linkedList.insert(linkedList, 3);
        linkedList.insert(linkedList, 4);
        linkedList.insert(linkedList, 5);
        linkedList.displayList(linkedList);
        linkedList.deleteByKey(linkedList, 2);
        linkedList.displayList(linkedList);

    }

}
