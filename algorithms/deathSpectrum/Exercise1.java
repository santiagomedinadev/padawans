import java.util.Scanner;

public class Exercise1 {
    // Function to check if the number is a palindrome
    public static boolean isPalindrome(int number) {
        String x = Integer.toString(number);
        
        // Loop to compare digits from the beginning and end
        for (int i = 0, j = x.length() - 1; i < j; i++, j--) {
            if (x.charAt(i) != x.charAt(j)) {
                return false; // Return false if it's not a palindrome
            }
        }
        return true; // Return true if it's a palindrome
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");

        int h = input.nextInt();
        input.close(); // Close the Scanner

        // Call the function and display the result
        boolean isPalindrome = isPalindrome(h);
        System.out.println(isPalindrome);
    }
}