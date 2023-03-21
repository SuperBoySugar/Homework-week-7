/**12. Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;
public class Program_12 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter to check alphabet or number or symbol (special character): ");
        char ch = scan.next().charAt(0);
        checkValue(ch);

    }
    public static void checkValue(char ch){

        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            System.out.println("Entered value is Alphabet");
        else if (ch >= 44 && ch <=122)
            System.out.println("Entered value is number");
        else
            System.out.println("Entered value is special character");

        }
    }



