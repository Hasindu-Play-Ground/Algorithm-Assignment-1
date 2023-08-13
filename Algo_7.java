import java.util.Scanner;

public class Algo_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        
        // Check  input is empty.
        if (inputSentence.trim().isEmpty()) {
            System.out.println("Please enter a valid sentence.");
        } else {
            String[] words = inputSentence.split("\\s+");
            
            String shortestWord = words[0];
            String longestWord = words[0];
            
            for (String word : words) {
                if (word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            
            System.out.println("Shortest word: " + shortestWord + " (Length: " + shortestWord.length() + ")");
            System.out.println("Longest word: " + longestWord + " (Length: " + longestWord.length() + ")");
        }
        
        scanner.close();
    }
}
