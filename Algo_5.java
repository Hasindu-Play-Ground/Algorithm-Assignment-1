import java.util.Scanner;

public class Algo_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text (ASCII only): ");
        String inputText = scanner.nextLine();
        
        // Check if the input is empty or consists only of spaces
        if (inputText.trim().isEmpty()) {
            System.out.println("Input is empty. Please enter a valid text.");
        } else {
            String reversedText = reverseString(inputText);
            System.out.println("Reversed text: " + reversedText);
        }
        
        scanner.close();
    }
    
    // Function to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        
        return reversed.toString();
    }
}
