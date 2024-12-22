package basic;
import java.util.Scanner;
public class PerfectSq2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from the user
            System.out.print("Enter a positive number: ");
            int num = scanner.nextInt();

            // Check for valid input
            if (num < 1) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            // Finding the minimum count of perfect squares
            int result = minPerfectSquares(num);

            // Output the result
            System.out.println("Minimum number of perfect squares that sum to " + num + " is: " + result);
        }

        // Method to find the minimum number of perfect squares that sum up to n
        public static int minPerfectSquares(int n) {
            // dp[i] will be the minimum number of perfect squares that sum to i
            int[] dp = new int[n + 1];

            // Initialize dp array with a large number
            for (int i = 0; i <= n; i++) {
                dp[i] = i; // Maximum count of perfect squares is using 1 (i times)
            }

            // Loop over all numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j * j <= i; j++) {
                    dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
                }
            }

            // Return the minimum count for the given number
            return dp[n];
        }
    }


