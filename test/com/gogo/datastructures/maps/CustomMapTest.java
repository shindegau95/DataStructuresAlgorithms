package com.gogo.datastructures.maps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomMapTest {

    CustomMap map;

    @BeforeEach
    void setUp() {
        map = new CustomMap<Integer, String>();
    }

    @Test
    void testMap() {
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(11, "z");

        assertEquals("b", map.get(2));
        assertEquals("a", map.get(1));
        assertEquals("c", map.get(3));
        assertEquals("z", map.get(11));
    }

    @Test
    void testStringKeys() {
        HashMap<Employee, String> citymap = new HashMap<Employee, String>();

        Employee trency = new Employee("Trency");
        Employee gogo = new Employee("Gaurav");
        Employee nevla = new Employee("Nevla");
        Employee crystal = new Employee("Crystal");

        citymap.put(trency, "Mumbai");
        citymap.put(gogo, "Bangalore");
        citymap.put(nevla, "Chennai");
        citymap.put(crystal, "Mumbai");

        System.out.println("citymap = " + citymap);
    }

    private class Employee {
        private final String name;

        public Employee(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    '}';
        }

        //toggle each & both to test difference in behavior or map

        @Override
        public boolean equals(Object o) {
            /*if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(name, employee.name);*/

            return true;
        }

        @Override
        public int hashCode() {
            return name.length();
        }
    }
}