package com.gogo.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LinkedListTest {

    LinkedList<Integer> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<>();
    }

    @Test
    void add() {
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        assertEquals(3, linkedList.size);
        assertEquals(3, linkedList.peek());

        linkedList.prepend(5);
        assertEquals(4, linkedList.size);
    }

    @Test
    void insert() {
        assertThrows(Error.class, () -> linkedList.insert(20, 1));

        linkedList.insert(1, 0);
        assertEquals(1, linkedList.size);

        linkedList.append(2);
        linkedList.append(3);
        assertEquals(3, linkedList.size);

        assertThrows(Error.class, () -> linkedList.insert(4, 4));
        assertEquals(3, linkedList.size);

        linkedList.insert(4, 2);
        assertEquals(4, linkedList.size);
        linkedList.insert(5, 2);
        assertEquals(5, linkedList.size);
    }

    @Test
    void delete() {
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        assertEquals(4, linkedList.size);
        assertThrows(Error.class, () -> linkedList.delete(5));
        linkedList.delete(1);
        assertEquals(3, linkedList.size);
        linkedList.delete(4);
        assertEquals(2, linkedList.size);
        linkedList.delete(2);
        assertEquals(1, linkedList.size);
        linkedList.delete(3);
        assertEquals(0, linkedList.size);
    }

    @Test
    void testLookup() {
        assertEquals(null, linkedList.lookup(5));
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        assertEquals(null, linkedList.lookup(5));
        assertEquals(1, linkedList.lookup(2));
    }

    @Test
    void testReverse() {
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.reverse();
        assertEquals(3, linkedList.size);
        linkedList.print();
    }
}