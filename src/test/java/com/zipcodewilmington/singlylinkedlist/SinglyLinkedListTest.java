package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest() {
        SinglyLinkedList exampleList = new SinglyLinkedList();
        exampleList.add("Josue");
        exampleList.add("Joshua");
        exampleList.add("George");
        int actual = exampleList.size();
        int expected = 3;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void removeTest() {
        SinglyLinkedList exampleList = new SinglyLinkedList();
        exampleList.add("Josue");
        exampleList.add("Joshua");
        exampleList.add("George");
        exampleList.remove(1);
        String actual = exampleList.get(1);
        String expected = "George";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void contains() {
        SinglyLinkedList exampleList = new SinglyLinkedList();
        exampleList.add("Josue");
        exampleList.add("Joshua");
        exampleList.add("George");
        boolean actual = exampleList.contains("George");
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void find() {
    }

    @Test
    public void sizeTest() {
        SinglyLinkedList exampleList = new SinglyLinkedList();
        exampleList.add("Josue");
        exampleList.add("Joshua");
        int actual = exampleList.size();
        int expected = 2;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void getTest() {
        SinglyLinkedList exampleList = new SinglyLinkedList();
        exampleList.add("Josue");
        exampleList.add("Joshua");
        String actual = exampleList.get(1);
        String expected = "Joshua";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void copy() {
    }

    @Test
    public void sort() {
    }
}
