
// Question 7
// Create a method to check if a number is an increasing number.

// Answer 7

public class NumberChecker {

  // Method to check if a number is an increasing number
  public boolean checkNumber(int number) {
     int previousDigit = 10; // Initialize with a digit greater than any possible digit (0-9)

     while (number > 0) {
        int currentDigit = number % 10; // Get the last digit of the number

        // If the current digit is greater than the previous digit, it's not an increasing number
        if (currentDigit > previousDigit) {
           return false;
        }

        // Update previousDigit to the current one and reduce the number
        previousDigit = currentDigit;
        number /= 10;
     }

     // If no digit is greater than the digit before it, it's an increasing number
     return true;
  }

  public static void main(String[] args) {

     NumberChecker checker = new NumberChecker();
     int number = 12345;
     boolean result = checker.checkNumber(number);
     System.out.println("Is " + number + " an increasing number? " + result);
  }
}
