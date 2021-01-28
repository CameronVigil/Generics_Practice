 /**
*Description: This project generates a list of 10 random integers and sorts them in ascending order. This project is
*to better understand how generics are used in Java.
*Class: Fall - COSC 2436.82401
*Assignment1: Generics
*Date: 01/25/2021
*@author  Cameron Vigil
*@version 1.1.01
*/ 

import java.util.Random;
import java.util.*;


public class Test {
    public static void main(String[] args) {
        //generates a list of 10 random integers
        ArrayList<Integer> list = new ArrayList<Integer>(10); 
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            //generates random number in range of 0 to 10, this can be changed to any range
            int randNum = rand.nextInt(100);
            list.add(i,randNum);
        }
        
        //prints unsorted list
        System.out.println("Unsorted:");
        for(int counter: list){
			System.out.println(counter);
		}
        
        //sorts and prints list again but sorted
        Sort.sort(list);
        System.out.println("Sorted:");
        for(int counter: list){
			System.out.println(counter);
        }
    }
}