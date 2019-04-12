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
import org.junit.rules.ExpectedException;

/**
 *
 * @author msi
 */
public class ArrayTest {
    

    @Test
    public void testCapacity() throws Exception {
        Array instance = new Array();
        instance.push(4);
        instance.push(5);
        instance.push(3);
        instance.push(8);
        assertEquals(instance.capacity(), 16);
        instance.random();
        instance.push(5);
        assertEquals(instance.capacity(), 32);
    }

    @Test
    public void testSize() throws Exception {
        Array instance = new Array();
        instance.push(3);
        instance.push(2);
        assertEquals(instance.size(), 2);
    }

    @Test
    public void testEmpty() {
        Array instance = new Array();
        instance.random();
        System.out.print("Test empty : ");
        System.out.println(instance.empty());
    }

    @Test
    public void testAt() {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(2);
        instance.push(3);
        try {
            System.out.print("Test at : ");
            System.out.println(instance.at(2));
        } catch (IllegalArgumentException e) {
            System.out.print("Test at : ");
            System.out.println(instance.at(20));
        }
    }

    @Test
    public void testPush(){
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
    public void testPrepend()  {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(2);
        instance.prepend(6);
        System.out.print("Test prepend : ");
        instance.print();
    }

    @Test
    public void testInsert()  {
        Array instance = new Array();
        instance.random();
        try {
            instance.insert(5, 2);
            System.out.println("Size : " + instance.size());
            System.out.print("Test insert : ");
            instance.print();
        } catch (IllegalArgumentException e) {
            instance.insert(50, 2);
            System.out.println("Size : " + instance.size());
            System.out.print("Test insert : ");
            instance.print();
        }
    }
    
    @Test
    public void testPop(){
        Array instance = new Array();
        try {
            instance.push(1);
            instance.push(5);
            instance.push(6);
            assertEquals(instance.pop(), 6);
        } catch (IllegalArgumentException e) {
            assertEquals(instance.pop(), 6);
        }
    }

    @Test
    public void testDelete() {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(2);
        instance.push(3);
        try {
            instance.delete(2);
            System.out.print("Test delete : ");
            instance.print();
        } catch (IllegalArgumentException e) {
            instance.delete(90);
            System.out.print("Test delete : ");
            instance.print();
        }
    }

    @Test
    public void testRemove() throws Exception {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(2);
        instance.push(3);
        instance.push(2);
        instance.remove(2);
        System.out.print("Test remove : ");
        instance.print();
    }

    @Test
    public void testFind() throws Exception {
        Array instance = new Array();
        instance.push(1);
        instance.push(5);
        instance.push(2);
        assertEquals(instance.find(2), 2);
    }
    
    
}
