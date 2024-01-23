package org.example;

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
    public  LinkedList reverse(LinkedList llist){
        Node prev = null;
        Node current = llist.head;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        llist.head  = prev;
        return  llist;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(linkedList, 1);
        linkedList.insert(linkedList, 2);
        linkedList.insert(linkedList, 3);
        linkedList.insert(linkedList, 4);
        linkedList.insert(linkedList, 5);
        linkedList.displayList(linkedList);
        linkedList.reverse(linkedList);
        linkedList.displayList(linkedList);
    }

    private int size(LinkedList linkedList) {
        int count = 0;
        Node currentNode = linkedList.head;

        while(currentNode != null){
            count += 1;
            currentNode = currentNode.next;
        }
        System.out.println(count);
        return  count;

    }

}
