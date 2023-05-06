/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.lebaguette.ca2groupproject;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leoze
 */
public class hashmapTest {

    /**
     * Test of size method, of class hash map. empty map
     */
    @org.junit.Test
    public void testSizeEmptyMap() {
        hashmap instance = new hashmap();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class hash map. one value
     */
    @org.junit.Test
    public void testSizeNonEmptyMap() {
        hashmap instance = new hashmap();
        Patient a = new Patient("John", "Doe", LocalDate.of(2000, 1, 1), LocalDate.now());
        instance.put(2, a);
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);

        Patient c = instance.get(2);
        assertEquals(a, c);
    }

    /**
     * Test of size method, of class hash map. size after removing one
     */
    @org.junit.Test
    public void testSizeAfterRemoving() {
        hashmap instance = new hashmap();
        Patient a = new Patient("John", "Doe", LocalDate.of(2000, 1, 1), LocalDate.now());
        Patient b = new Patient("Liam", "john", LocalDate.of(2001, 1, 1), LocalDate.now());
        instance.put(2, a);
        instance.put(3, b);
        instance.remove(2);
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);

        Patient c = instance.get(2);
        assertEquals(null, c);
    }

    /**
     * Test of size method, of class hash map. updating value
     */
    @org.junit.Test
    public void testSizeAddingDuplicate() {
        hashmap instance = new hashmap();
        Patient a = new Patient("John", "Doe", LocalDate.of(2000, 1, 1), LocalDate.now());
        Patient b = new Patient("Liam", "john", LocalDate.of(2001, 1, 1), LocalDate.now());
        instance.put(2, a);
        instance.put(2, b);
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);

        Patient c = instance.get(2);
        assertEquals(b, c);
    }

    /**
     * Test of put method, of class hash map. putting value in
     */
    @org.junit.Test
    public void testPutValue() {
        hashmap instance = new hashmap();
        Patient a = new Patient("John", "Doe", LocalDate.of(2000, 1, 1), LocalDate.now());
        instance.put(2, a);
        Patient expResult = a;
        Patient result = instance.get(2);
        assertEquals(expResult, result);

        int sizeExp = 1;
        int sizeAct = instance.size();
        assertEquals(sizeExp, sizeAct);
    }

    /**
     * Test of put method, of class hash map. updating value
     */
    @org.junit.Test
    public void testPutUpdateValue() {
        hashmap instance = new hashmap();
        Patient a = new Patient("John", "Doe", LocalDate.of(2000, 1, 1), LocalDate.now());
        Patient b = new Patient("Liam", "john", LocalDate.of(2001, 1, 1), LocalDate.now());

        instance.put(2, a);
        instance.put(2, b);
        Patient expResult = b;
        Patient result = instance.get(2);
        assertEquals(expResult, result);

        int sizeExp = 1;
        int sizeAct = instance.size();
        assertEquals(sizeExp, sizeAct);
    }

    /**
     * Test of put method, of class hash map. putting value in beginning
     */
    @org.junit.Test
    public void testPutaddBegining() {
        hashmap instance = new hashmap();
        Patient a = new Patient("John", "Doe", LocalDate.of(2000, 1, 1), LocalDate.now());
        Patient b = new Patient("Liam", "john", LocalDate.of(2001, 1, 1), LocalDate.now());

        instance.put(1, a);
        instance.put(2, b);
        Patient expResult = a;
        Patient result = instance.get(1);
        assertEquals(expResult, result);

        int sizeExp = 2;
        int sizeAct = instance.size();
        assertEquals(sizeExp, sizeAct);
    }

    /**
     * Test of put method, of class hash map. putting value in the end
     */
    @org.junit.Test
    public void testPutaddEnd() {
        hashmap instance = new hashmap();
        Patient b = new Patient("Liam", "john", LocalDate.of(2001, 1, 1), LocalDate.now());

        instance.put(20, b);
        Patient expResult = b;
        Patient result = instance.get(20);
        assertEquals(expResult, result);

        int sizeExp = 1;
        int sizeAct = instance.size();
        assertEquals(sizeExp, sizeAct);
    }

    /**
     * Test of put method, of class hash map. putting empty value
     */
    @org.junit.Test
    public void testPutEmptyvalue() {
        hashmap instance = new hashmap();
        assertThrows(IllegalArgumentException.class, () -> {
            instance.put(0, null);
        });
    }

    /**
     * Test of put method, of class hash map. putting empty value
     */
    @org.junit.Test
    public void testPutEmptyKey() {
        hashmap instance = new hashmap();
        Patient a = new Patient("John", "Doe", LocalDate.of(2000, 1, 1), LocalDate.now());
        assertThrows(IllegalArgumentException.class, () -> {
            instance.put(2, a);
        });
    }

    
    
    /**
     * Test of get method, of class hashmap.
     */
    @org.junit.Test
    public void testGet() {
        System.out.println("get");
        String key = "";
        hashmap instance = new hashmap();
        Patient expResult = null;
        Patient result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class hashmap.
     */
    @org.junit.Test
    public void testRemove() {
        System.out.println("remove");
        String key = "";
        hashmap instance = new hashmap();
        Patient expResult = null;
        Patient result = instance.remove(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsKey method, of class hashmap.
     */
    @org.junit.Test
    public void testContainsKey() {
        System.out.println("containsKey");
        String key = "";
        hashmap instance = new hashmap();
        boolean expResult = false;
        boolean result = instance.containsKey(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeys method, of class hashmap.
     */
    @org.junit.Test
    public void testGetKeys() {
        System.out.println("getKeys");
        hashmap instance = new hashmap();
        String[] expResult = null;
        String[] result = instance.getKeys();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValues method, of class hashmap.
     */
    @org.junit.Test
    public void testGetValues() {
        System.out.println("getValues");
        hashmap instance = new hashmap();
        Patient[] expResult = null;
        Patient[] result = instance.getValues();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
