/**19. Write a Java program to calculate the average value of array elements
 */

import java.util.Scanner;

public class Program_19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = scan.nextInt();
        int[] array = new int[size];

        // Reading value from user
        System.out.println("Enter the value of Array");
        for (int i = 0; i < size; i++) {
            int value = scan.nextInt();

            array[i] = value;
        }

        // Getting array length
        int length = array.length;

        // default sum value
        int sum = 0;

        // sum of all values in array using for loop
        for (int i = 0; i <array.length; i++) {
            sum += array[i];

        }

        double average = sum / length;
        System.out.println("Average of array: " + average);

    }

    }
    /* Without Scanner Class

    public static void main(String[] args) {

    int array[] = {10, 20, 30, 40, 50};
    int sum = 0;

    for (int i : array) {
    sum += i;
    }
    double average = sum / array.length;
    System.out.println("Average value of the Array elements is: " + average);
         }

         */
