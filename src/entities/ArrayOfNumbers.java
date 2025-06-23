package entities;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfNumbers {
    private int[] array;

    // Constructor
    public ArrayOfNumbers() {
        this.array = new int[5];
        Random random = new Random();
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = random.nextInt(10) + 1;
        }
    }

    // Methods
    public void printArray() {
        System.out.println("this.array value: " + Arrays.toString(this.array));
    }

    //to continue - exs1 with class
}
