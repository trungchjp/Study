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

    int defaultCapacity = 32;
    int wrongNumber = -1;
    private int size = 0;
    int[] items = new int[defaultCapacity]; 
       
    /*
    number of items array can hold
    Time complexity: O(1)    
    */
    public int capacity() {
        return items.length;
    }
    
    /*
    Return number of items stored in Array
    Time complexity: O(1)    
    */
    public int size(){
        return size;
    }
    
    /*
    Check DynamicArray is empty or not. Return True if empty, False if not
    Time complexity: O(1)    
    */
    public boolean empty(){
        return size() == 0;
    }
    
    /*
    returns item at given index, blows up if index out of bounds
    Time complexity: O(1)    
    */
    public int at(int index) throws IllegalArgumentException{
        if(index < 0 || index >= size()) {
            throw new IllegalArgumentException("ERROR: index out of range");  
        } else {
            return items[index];
        }   
    }
    
    /*
    Add given item to the end of Array
    Time complexity: O(1)    
    */
    public void push(int item)  {
        insert(size(), item);
    }
    
    /*
    Insert item at index 0
    Time complexity: O(n)    
    */
     public void prepend(int item) {
         insert(0, item);
    }
     
    /*
    Inserts item at index, shifts that index's value and trailing elements to the right
    Time complexity: O(n)    
    */
    public void insert(int index, int item) throws IllegalArgumentException{
        if(index < 0 || index > size()) {           
            throw new IllegalArgumentException("ERROR: index out of range");
        } else {
            resize();
            for(int i = size() ; i > index ; i--) {
                items[i] = items[i - 1];
            }
            items[index] = item;
            size ++;
        }
        
    }
     
    /*
    Remove from end, return value
    Time complexity: O(1)    
    */
    public int pop() throws IllegalArgumentException{
        if(size() == 0){
            throw new IllegalArgumentException("ERROR: index out of range");
        }
        int lastItem = items[size() -1];
        delete(size()-1);
        return lastItem;
    }
    
    /*
    Delete item at index, shifting all trailing elements left
    Time complexity: O(n)    
    */
    public void delete(int index) throws IllegalArgumentException{
        if(index < 0 || index >= size()) {
            throw new IllegalArgumentException("ERROR: index out of range");
        }
        for(int i = index; i < size(); i++) {
            items[i] = items[i + 1];
        }
        size--;
        resize();
    }
    
    /*
    Remove all items with given value
    Time complexity: O(n)    
    */
    public void remove(int item) {
        int count = 0;
        int[] newArray = new int[capacity()];
        for (int i = 0; i < size(); i ++) {            
            if(items[i] != item) {
                newArray[count] = items[i];
                count ++;
            }
        }
        items = newArray;
        size = count;
        resize();
    }
    
    /*
    Looks for value and returns first index with that value, -1 if not found
    Time complexity: O(n)    
    */
    public int find(int item) {
        for(int i = 0; i < size(); i++) {
            if(items[i] == item) {
                return i;
            }
        }
        return wrongNumber;
    } 
    
    /*
    When you reach capacity, resize to double the size
    When popping an item, if size is 1/4 of capacity, resize to half
    Time complexity: O(n)    
    */
    public void resize() {
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
            newArray[i] = items[i];
        }
        items = newArray;
    }
    
    public void print() {
        for(int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println("\n");
    }
    
    public void random() {
        for(int i = 0; i < items.length; i++){
            items[i] = (int) ((Math.random() * 10) + 1);
        }
        size = items.length;
    }


}
