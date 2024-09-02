
// Question 6
// Create a class with a method to find the difference between the sum of the sqaure and the square of the sum of the first
// n natural numbers.

// Answer 6
public class NumberDifference {

    // Method to calculate the difference
    public static int calculateDifference(int n) {
        // Calculate the sum of the squares of the first n natural numbers
        int sumOfSquares = n * (n + 1) * (2 * n + 1) / 6;

        // Calculate the sum of the first n natural numbers
        int sum = n * (n + 1) / 2;

        // Square the sum
        int squareOfSum = sum * sum;

        // Calculate the difference
        int difference = squareOfSum - sumOfSquares;

        return difference;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 10; // You can change this value to test other values of n
        int result = calculateDifference(n);
        System.out.println("The difference for n = " + n + " is: " + result);
    }
}

