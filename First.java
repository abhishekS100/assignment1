// Question 1
// Create a method to find the sum of the cubes of the digits of a n digit number

// Answer 1

package com.company;

public class Main{

   public static int sumOfCubesOfDigit(int number){
       int sum = 0;
       while(number > 0){
           int digit = number % 10;
           sum += Math.pow(digit,3);
           number /= 10;
       }
       return sum;
   }
  
   public static void main(String[] args){
       int number = 5589;
       System.out.println(sumOfCubesOfDigit(number));
   
   }
}
