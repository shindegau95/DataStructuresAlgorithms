package com.gogo.datastructures.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DoublyLinkedListTest {

    DoublyLinkedList<Integer> doublyLinkedList;

    @BeforeEach
    void setUp() {
        doublyLinkedList = new DoublyLinkedList<>();
    }

    @Test
    void append() {
        assertEquals(0, doublyLinkedList.size());
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.print();
        assertEquals(3, doublyLinkedList.size());
    }

    @Test
    void prepend() {
        assertEquals(0, doublyLinkedList.size());
        doublyLinkedList.prepend(1);
        doublyLinkedList.prepend(2);
        doublyLinkedList.prepend(3);
        doublyLinkedList.print();
        assertEquals(3, doublyLinkedList.size());
    }

    @Test
    void testLookup() {
        assertEquals(null, doublyLinkedList.lookup(5));
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        assertEquals(null, doublyLinkedList.lookup(5));
        assertEquals(1, doublyLinkedList.lookup(2));
    }

    @Test
    void insert() {
        assertThrows(RuntimeException.class, () -> doublyLinkedList.insert(1, 5));
        doublyLinkedList.append(1);
        doublyLinkedList.print();
        assertThrows(RuntimeException.class, () -> doublyLinkedList.insert(2, 1));
        doublyLinkedList.insert(2, 0);
        doublyLinkedList.print();
        assertEquals(2, doublyLinkedList.size());
        doublyLinkedList.insert(3, 1);
        doublyLinkedList.print();
        assertEquals(3, doublyLinkedList.size());
    }

    @Test
    void delete() {
        assertThrows(RuntimeException.class, () -> doublyLinkedList.delete(0));
        doublyLinkedList.append(1);
        doublyLinkedList.delete(0);
        doublyLinkedList.print();
        assertEquals(0, doublyLinkedList.size());
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.delete(3);
        doublyLinkedList.print();
        assertEquals(3, doublyLinkedList.size());
    }
}