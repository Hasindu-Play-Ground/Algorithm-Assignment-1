import java.util.Scanner;

public class Algo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getPositiveNumber(scanner);
        scanner.close();

        int[] fibonacciSequence = generateFibonacciSequence(number);
        System.out.print("Fibonacci sequence up to " + number + ": ");
        for (int value : fibonacciSequence) {
            System.out.print(value + " ");
        }
    }

    public static int getPositiveNumber(Scanner scanner) {
        int number;
        do {
            System.out.print("Enter a positive number: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a valid positive number: ");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }

    public static int[] generateFibonacciSequence(int limit) {
        int[] sequence = { 0, 1 };
        int i = 1;
        while (sequence[i] + sequence[i - 1] <= limit) {
            int nextNumber = sequence[i] + sequence[i - 1];
            int[] newSequence = new int[sequence.length + 1];
            System.arraycopy(sequence, 0, newSequence, 0, sequence.length);
            newSequence[i + 1] = nextNumber;
            sequence = newSequence;
            i++;
        }
        return sequence;
    }
}
