import java.util.Scanner;

public class Algo_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        
        // Check input is empty 
        if (inputSentence.trim().isEmpty()) {
            System.out.println("Input is empty. Please enter a valid sentence.");
        } else {
            String reversedSentence = reverseWords(inputSentence);
            System.out.println("Reversed sentence: " + reversedSentence);
        }
        
        scanner.close();
    }
    
    // Function to reverse the order 
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}
