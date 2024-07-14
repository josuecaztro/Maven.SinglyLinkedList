package com.zipcodewilmington.singlylinkedlist;

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
    public class SinglyLinkedList implements Comparable{
    private Node head;
    private Node tail;
    private int listSize;


    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }



    public class Node implements Comparable<Node> {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public int compareTo(Node o) {
            if (this.data.compareTo(o.data) < 0){
                o = this;
            }
            return 0;
        }
    }

    public void add (String data){
        Node node = new Node(data);
        if (listSize == 0){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        listSize++;
    }

    public void remove (int exampleIndex){
        if (this.head.data.equals(this.get(exampleIndex))) {
            this.head = this.head.next;
            this.listSize--;
        }
        Node currentNode = this.head;
        while (currentNode.next != null){
            if (currentNode.next.data.equals(this.get(exampleIndex))) {
                currentNode.next = currentNode.next.next;
                this.listSize--;
            }
            currentNode = currentNode.next;
        }

    }

    public int size(){
        return this.listSize;
    }

    public boolean contains(String example) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).equals(example)) {
                return true;
            }
        }
        return false;
    }

    //    find -- returns the element's index if it is in the list, -1 otherwise
    public int find(String example){
         for (int i = 0; i < this.size(); i++){
             if (this.get(i).equals(example)){
                 return i;
             }
         }
              return -1;
    }

    public String get(int index){
        if (index == 0){
            return this.head.data;
        }

        int currentIndex = 0;
        Node currentNode = this.head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
            if (++currentIndex == index){
                return currentNode.data;
            }
        }
        return null;
    }

    //    copy -- returns a new linked list containing the same values(DEEP COPY)
    public SinglyLinkedList copy (SinglyLinkedList exampleList){
        SinglyLinkedList cloneList;
        cloneList = exampleList;
        return cloneList;
    }

    //    sort -- sorts the list using your algorithm of choice.
//    You must perform the sorting yourself (no fair using someone else's library)
    public void sortList(){
        for (int i = 0; i < this.size() - 1; i++){
            this.get(i).compareTo(this.get(i + 1));
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}



