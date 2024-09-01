
// Question 4
// Write a java program that prompts the user for an integer and then prints out
// all the prime numbers up to that integer

// Answer  4

package com.company;
import java.util.Scanner;

public class PrimeNumbers {

  // Method to check if a number is prime

  public static boolean isPrime(int number) {
     if (number <= 1) {
        return false;
     }
     for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
           return false;
        }
     }
     return true;
  }

  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Prompt the user for an integer
     System.out.print("Enter an integer: ");
     int limit = scanner.nextInt();

     System.out.println("Prime numbers up to " + limit + " are:");

     // Loop through numbers up to the limit and check for primes
     for (int i = 2; i <= limit; i++) {
        if (isPrime(i)) {
           System.out.print(i + " ");
        }
     }

     scanner.close();
  }
}
