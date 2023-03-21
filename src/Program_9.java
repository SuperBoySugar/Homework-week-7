import java.util.Scanner;

/**9. Same as above program-8 using switch statement
 */

public class Program_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character from A to F:  ");
        char c = sc.next().charAt(0);
        sc.close();

        switch (c) {
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bhavnagar");
                break;
            case 'C':
                System.out.println("Chotila");
                break;
            case 'D':
                System.out.println("Dakor");
                break;
            case 'E':
                System.out.println("Edar");
                break;
            case 'F':
                System.out.println("France");
                break;















        }
    }
}
