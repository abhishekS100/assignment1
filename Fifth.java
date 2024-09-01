
// Question 5
// Create a class with a method which can calculate the sum of first n natural
// numbers which are divisible by 3 or 5

// Answer  5

package com.company;
public class SumDivisibleBy3Or5 {

  // Method to calculate the sum of the first n natural numbers divisible by 3 or 5
  public static int calculateSum(int n) {
     int sum = 0;
     int count = 0;
     int number = 1;

     // Loop until we have found n numbers divisible by 3 or 5
     while (count < n) {
        if (number % 3 == 0 || number % 5 == 0) {
           sum += number;
           count++;
        }
        number++;
     }

     return sum;
  }

  public static void main(String[] args) {
     int n = 10;
     int result = calculateSum(n);
     System.out.println("The sum of the first " + n + " natural numbers divisible by 3 or 5 is: " + result);
  }
}
