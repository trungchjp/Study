/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import array.Array;

/**
 *
 * @author msi
 */
public class ArrayTest {
    
    public ArrayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMain() {
        
        String[] args = null;
        
    }

    @Test
    public void testCapacity() {
        Array instance = new Array();
        assertEquals(instance.capacity(), 32);
    }

    @Test
    public void testSize() {
        Array instance = new Array();
        instance.push(3);
        instance.push(2);
        assertEquals(instance.size(), 2);
    }

    @Test
    public void testIsEmpty() {
        Array instance = new Array();
        instance.random();
        System.out.print("Test isEmpty : ");
        System.out.println(instance.isEmpty());
    }

    @Test
    public void testAt() {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(2);
        instance.push(3);
        System.out.print("Test at : ");
        System.out.println(instance.at(2));
    }

    @Test
    public void testPush() {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(2);
        instance.push(3);
        instance.push(9);
        System.out.print("Test push : ");
        instance.print();
    }

    @Test
    public void testPrepend() {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(2);
        instance.prepend(6);
        System.out.print("Test prepend : ");
        instance.print();
    }

    @Test
    public void testInsert() {
        Array instance = new Array();
        instance.random();
        instance.insert(5, 2);
        System.out.println("Size : " + instance.size());
        System.out.print("Test insert : ");
        instance.print();
    }

    @Test
    public void testPop() {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(6);
        assertEquals(instance.pop(), 6);
    }

    @Test
    public void testDelete() {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(2);
        instance.push(3);
        instance.delete(0);
        System.out.print("Test delete : ");
        instance.print();
    }

    @Test
    public void testRemove() {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(2);
        instance.push(3);
        instance.push(2);
        instance.remove(2);
        System.out.print("Test remove :");
        instance.print();
    }

    @Test
    public void testFind() {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(2);
        assertEquals(instance.find(2), 2);
    }

    @Test
    public void testPrint() {
        Array instance = new Array();
        System.out.print("Test print :");
        instance.print();
    }

    @Test
    public void testRandom() {
        Array instance = new Array();
        instance.random();
    }
    
    
    
}
