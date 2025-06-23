package exs2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- try/catch int numbers ---");
        try {
            System.out.println("Insert km: ");
            int kmInt = scanner.nextInt();

            System.out.println("Insert liters consumed: ");
            int litersInt = scanner.nextInt();

            int kmByLiters = kmInt / litersInt;

            if (kmByLiters == 0) {
                throw new ArithmeticException();
            }

            // cast from kmInt to double
            double doubleKmByLiters = (double) kmInt / litersInt;

            System.out.println("You consumed: " + kmByLiters + " km/l.");

        } catch (ArithmeticException e) {
            System.out.println("Can't divide by 0, liters can't be 0.");
        } catch (InputMismatchException e) {
            System.out.println("Error: you must insert an int number.");
        } finally {
            scanner.close();
        }

// to continue with double
    }
}
