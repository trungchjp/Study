/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;
import java.util.Random;

/**
 *
 * @author msi
 */
public class Array {

    int[] array = new int[32]; 
    
    
    
    public int capacity() {
        return array.length;
    }
    
    public int size(){
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                count ++;
            }
        }
        return count;
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    public int at(int index) {
        if(index < 0 || index >= size()) {
            System.out.println("ERROR: index out of reange");
        } else {
            return array[index];
        }
        return -1;
    }
    
    public void push(int item) {
        insert(size(), item);
    }
    
     public void prepend(int item) {
         insert(0, item);
    }
     
     public void insert(int index, int item) {
        if(0 > index && index >= size()) {           
            System.out.println("ERROR: index out of reange");
        }
        reSize();
        for(int i = size() ; i > index ; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
    }
     
    public int pop() {       
        return array[size()-1];
    }
    
    public void delete(int index) {
        if(index < 0 || index >= size()) {
            System.out.println("ERROR: index out of reange");
        }
        for(int i = index; i < size(); i++) {
            array[i] = array[i + 1];
        }
        reSize();
    }
    
    public void remove(int item) {
        int count = 0;
        int[] newArray = new int[capacity()];
        for (int i = 0; i < size(); i ++) {            
            if(array[i] != item) {
                newArray[count] = array[i];
                count ++;
            }
        }
        array = newArray;
        reSize();
    }
    
    public int find(int item) {
        for(int i = 0; i < size(); i++) {
            if(array[i] == item) {
                return i;
            }
        }
        return -1;
    }
    
    public void print() {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
    
    public void random() {
        for(int i = 0; i < array.length; i++){
            array[i] = (int) ((Math.random() * 10) + 1);
        }
    }
    
    public void reSize() {
        int newCapacity = 1;
        if(size() == capacity()) {
            newCapacity = capacity() * 2;
        } else if(size() > 0 && size() <= capacity() /4 && capacity() > 16) {
            newCapacity = capacity() / 2;
        } else {
            return;
        }
        int[] newArray = new int[newCapacity];
        for(int i =0; i < size(); i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    
    
}
