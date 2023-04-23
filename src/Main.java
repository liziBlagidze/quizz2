import static java.lang.Long.sum;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            int[] integers = IntegersCalculator.readIntegersFromFile("src/input.txt");
            int sum = IntegersCalculator.sum(integers);
            System.out.println("The sum of the integers is: " + sum);
        } catch (InvalidNumberException e) {
            System.err.println("Error reading integer from file: " + e.getMessage());
        }


    }

}