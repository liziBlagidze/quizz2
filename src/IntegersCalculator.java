import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IntegersCalculator {
    public static int[] readIntegersFromFile(String fileName) throws InvalidNumberException {
        int[] integers = new int[10];
        int i = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt() && i < 10) {
                int number = scanner.nextInt();
                if (number < 0) {
                    throw new InvalidNumberException("Invalid number: " + number);
                }
                integers[i] = number;
                i++;
            }
        } catch (NumberFormatException e) {
            System.err.println("Error reading integer from file: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return integers;
    }

    public static int sum(int[] integers) {
        int sum = 0;
        try {
            for (int i : integers) {
                sum = Math.addExact(sum, i);
            }
        } catch (ArithmeticException e) {
            System.err.println("Error calculating sum: " + e.getMessage());
        }
        return sum;
    }



}
