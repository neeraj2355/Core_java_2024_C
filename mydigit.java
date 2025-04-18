import java.util.Scanner;

public class mydigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Array to store the frequency of digits (0-9)
        int[] frequency = new int[10];

        // Count frequency of each digit
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            frequency[digit]++;       // Increase the frequency of the digit
            number /= 10;             // Remove the last digit
        }

        // Find the most frequent digit
        int mostFrequentDigit = 0;
        for (int i = 1; i < 10; i++) {
            if (frequency[i] >= frequency[mostFrequentDigit]) {
                mostFrequentDigit = i;
            }
        }

        System.out.println("Most frequent digit is: " + mostFrequentDigit);
    }
}