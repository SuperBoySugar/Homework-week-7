/**10. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *) find addition, Subtraction, multiplication and division according to their symbol (using if else)
 *
 */
import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the operator you want (+, -, * , /); ");
        char ch = scanner.next().charAt(0);

        calculation(ch,num1,num2);


    }
    public static void calculation(char ch, int num1, int num2) {

        if (ch == '+') {
            System.out.println("\nAddition of "  + num1 + " + " + num2 + " = " + (num1+num2));
        }else if (ch == '-'){
            System.out.println("\nSubtraction of " + num1 + " - " + num2 + " = " + (num1+num1));
        } else if (ch == '*') {
            System.out.println("\nMultiplication of " + num1 + " * " + num2 + " = " + (num1 + num2));
        }else if (ch == '/') {
            System.out.println("\nDivision of " + num1 + " / " + num2 + " = " + (num1 + num2));
        }else {
            System.out.println("Operator is not available");
        }
    }
}
