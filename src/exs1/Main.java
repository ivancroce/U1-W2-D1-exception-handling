package exs1;

import java.util.Scanner;

// without class
/*
public class Main1 {
    public static void main(String[] args) {
        int[] randomArray = new int[5];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(10) + 1;
        }

        System.out.println("Initial array: " + Arrays.toString(randomArray));

        Scanner scanner = new Scanner(System.in);
        int position;
        int value;

        while (true) {
            try {
                System.out.println("Enter the position where to insert a number (1 to 5 or 0 to quit): ");
                position = Integer.parseInt(scanner.nextLine());

                if (position == 0) {
                    System.out.println("0 == quit");
                    break;
                }

                System.out.println("Enter the value to insert: ");
                value = Integer.parseInt(scanner.nextLine());

                int index = position - 1;
                randomArray[index] = value;

                System.out.println("New array: " + Arrays.toString(randomArray));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error, you need to enter a number from 1 to 5.");
            } catch (NumberFormatException e) {
                System.out.println("Error, you need to enter an int number.");
            }

        }
        scanner.close();
    }
}*/

public class Main {
    public static void main(String[] args) {
        ArrayOfNumbers array = new ArrayOfNumbers();

        // Initial state - method from the class
        array.printArray();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the position where to insert a number (1 to 5 or 0 to quit): ");

                int position = Integer.parseInt(scanner.nextLine());

                if (position == 0) {
                    System.out.println("0 == quit");
                    break;
                }
                System.out.println("Enter the value to insert: ");

                int value = Integer.parseInt(scanner.nextLine());

                // Calling the method from the class
                array.updateValue(position - 1, value);
                // print the current state of the Array
                array.printArray();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error, you need to enter a number from 1 to 5.");
            } catch (NumberFormatException e) {
                System.out.println("Error, you need to enter an int number.");
            }
        }
        scanner.close();
    }
}
