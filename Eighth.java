
// Question 8
// Create a method to check if a number is a power of two or not.

// Answer 8

package com.company;
public class PowerOfTwoChecker {

  // Method to check if a number is a power of two
  public boolean isPowerOfTwo(int number) {
     if (number <= 0) {
        return false; // Power of two must be a positive integer
     }

     // A number is a power of two if it has exactly one bit set in its binary representation
     return (number & (number - 1)) == 0;
  }

  public static void main(String[] args) {

     PowerOfTwoChecker checker = new PowerOfTwoChecker();
     int number = 16;
     boolean result = checker.isPowerOfTwo(number);
     System.out.println("Is " + number + " a power of two? " + result);
  }
}
