package movingZeros;

import java.util.Scanner;
import java.util.Arrays;

public class MovingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int size = scanner.nextInt();
        System.out.println("Enter array Elements ");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(move(array, size));
    }

    public static String move(int array[], int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
        while (count < size) {
            array[count++] = 0;
        }
        return Arrays.toString(array);

    }

}
