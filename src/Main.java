import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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

        while(true) {
            try {
                System.out.println("Enter the position where to insert a number (1 to 5 or 0 to quit): ");
                position = Integer.parseInt(scanner.nextLine());

                if(position == 0) {
                    System.out.println("0 == quit");
                    break;
                }

                System.out.println("Enter the value: ");
                value = Integer.parseInt(scanner.nextLine());

                // to continue try-catch
                
            } catch () {
        }
    }
}