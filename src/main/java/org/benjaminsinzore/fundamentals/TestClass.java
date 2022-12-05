package org.benjaminsinzore.fundamentals;


import java.util.Set;
import java.util.HashSet;
public class TestClass {
}




class SetExample {
    public static void main(String[] args) {
        // Create a set of strings
        Set<String> mySet = new HashSet<>();

        // Add some elements to the set
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("orange");

        // Print the elements of the set
        System.out.println(mySet); // Output: [apple, banana, orange]

        // Check if the set contains a given element
        System.out.println(mySet.contains("apple")); // Output: true
        System.out.println(mySet.contains("cherry")); // Output: false

        // Remove an element from the set
        mySet.remove("orange");

        // Print the updated set
        System.out.println(mySet); // Output: [apple, banana]
    }
}


