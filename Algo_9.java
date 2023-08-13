import java.util.Scanner;

public class Algo_9 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter a single word: ");
            input = scanner.nextLine().trim();
        } while (!isValidWord(input));

        if (isPalindrome(input)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isValidWord(String input) {
        return input.matches("[a-zA-Z]+");
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
