// Java program to demonstrate Java Stack with LIFO

package com.stack;

import java.util.Stack;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating java Stack
        Stack<String> names = new Stack<>();

        // Adding names to Stack
        names.add("Sophia");
        names.add("Krista");
        names.add("Karen");
        names.add("Julia");
        names.add("Sebastian");
        names.add("IPhone");
        names.add("Siri");
        names.add("Cortana");
        names.add("Elizabeth");
        names.add("Gotthilf");
        names.add("Ralf");
        names.add("Arne");
        names.add("Christine");
        names.add("Stephan");

        // Printing names to console
        System.out.println(names);

        // Printing names from new lines
        for (int index = 0; index < names.size(); index++) {
            System.out.println(names.get(index));
        }

        // Adding element with push
        names.push("Manuel");

        // Printing names to console
        System.out.println(names);

        // Peek() method als getLast()
        System.out.println(names.peek());

        // Taking last element and deleting it
        System.out.println(names.pop());

        // Printing names to console
        System.out.println(names);

    }
}