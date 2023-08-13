import java.util.Scanner;

public class Algo_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter a phone number: ");
            input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Telephone number can't be empty.");
            } else if (isValidPhoneNumber(input)) {
                System.out.println("Number is validated.");
            } else {
                System.out.println("Invalid phone number.");
            }
        } while (!isValidPhoneNumber(input));

        scanner.close();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("\\+94 \\d{2} \\d{3} \\d{4}") || phoneNumber.matches("0\\d{2}-\\d{7}")) {
            for (char c : phoneNumber.toCharArray()) {
                if (!Character.isDigit(c) && c != ' ' && c != '-') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
