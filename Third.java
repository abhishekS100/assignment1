
// Question 3
// The fibonacci sequence is defined by the following rule.The first 2 values in the sequence value
// is the sum of the 2 values preceding it.Write a java program that uses
// both recursive and non-recursive function to print the nth value of the fibonacci sequence


//   Answer 3

package com.company;
public class Main{

  //Recursive method
  public static int fibonacciRecursive(int n) {
     if (n <= 1) {
        return n;
     }
     return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
  }

  // Non-recursive (iterative) method
  public static int fibonacciIterative(int n) {
     if (n <= 1) {
        return n;
     }

     int previous = 0;
     int current = 1;

     for (int i = 2; i <= n; i++) {
        int next = previous + current;
        previous = current;
        current = next;
     }

     return current;
  }

  public static void main(String[] args) {
     int n = 10;

     // Using recursive method
     int resultRecursive = fibonacciRecursive(n);
     System.out.println("Fibonacci number (recursive) at position " + n + " is: " + resultRecursive);

     // Using iterative method
     int resultIterative = fibonacciIterative(n);
     System.out.println("Fibonacci number (iterative) at position " + n + " is: " + resultIterative);
  }
}
