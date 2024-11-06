// Import the libraries
import java.util.Scanner;
import java.util.Stack;

public class Exercise2 {
    // Method to validate parentheses
    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Push the corresponding closing bracket for each opening bracket
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            }
            // If it's a closing bracket, check if it matches the top of the stack
            else if (stack.isEmpty() || stack.pop() != c) {
                return false; // Return false if it doesn't match
            }
        }
        // Return true if all brackets are matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of parentheses: ");
        String input = scanner.nextLine();

        // Check if input length is within limits
        if (input.length() < 1 || input.length() > 104) {
            System.out.println("Invalid input"); // Notify user of invalid input
        } else {
            // Validate parentheses and display result
            boolean result = validParentheses(input);
            System.out.println(result);
        }
        scanner.close(); // Close the scanner to free resources
    }
}