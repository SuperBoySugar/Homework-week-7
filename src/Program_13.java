/**13. Write a Java program which input any number between 1 to 7 and it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;
public class Program_13 {

    public static void main(String[] args) {
        char alphabet = 'a';

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7 : " );
        int day = scan.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contain 1 to 7 Days");

        }

    }
}
