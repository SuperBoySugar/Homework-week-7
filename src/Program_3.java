/**3. Write a java program to input student Name, roll No, and three subjects Math,
 * Science and English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input,
 * Marks should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade
 if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 _______________________________ |
 | | Mark Sheet |
 |_______________________________|
 | Name : Jay | | Roll No : 08 |
 |_______________________________|
 | Subjects : Marks |
 |_______________________________|
 | Math : 98 |
 | Science : 90 |
 | English : 85 |
 |_______________________________|
 | Total : 273 |
 |_______________________________|
 | Percentage : 91.0 |
 | Result : Pass |
 | Grade : A+ |
 |_______________________________|
 *
 */

import java.util.Scanner;

public class Program_3 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student name:");
        String studentName = s.next();

        System.out.println("Enter Student roll no: ");
        int rollNo = s.nextInt();

        System.out.println("Enter subject marks for Maths:  ");
        int math = s.nextInt();
        if (math < 0 || math > 100)
            System.out.println("Invalid input Marks should between 0 to 100");

        System.out.println("Enter subject for Science: ");
        int science = s.nextInt();
        if (science < 0 || science > 100)
            System.out.println("Invalid input Marks should between 0 to 100");

        System.out.println("Enter subject for English: ");
        int English = s.nextInt();
        if (English < 0 || English > 100)
            System.out.println("Invalid input Marks should between 0 to 100");

        float total = math + science + English;
        float percent = total / 3f;

        if (percent >= 35 && percent <= 100)
            System.out.println("|Result: Pass |");
        else
            System.out.println("|Result: Fail |");
        if (percent >= 80 && percent <= 100)
            System.out.println("|Grade: A+|");
        if (percent >= 60 && percent < 80)
            System.out.println("|Grade: A|");
        if (percent >= 50 && percent < 60)
            System.out.println("|Grade: B|");
        if (percent >= 35 && percent < 50)
            System.out.println("|Grade: C|");
        System.out.println("|--------------------------------|");
        System.out.println("|      Marks Sheet               |");
        System.out.println("|--------------------------------|");
        System.out.println("Name:" +studentName+   "|");
        System.out.println("|Roll No:" +rollNo+   "|");
        System.out.println("|--------------------------------|");
        System.out.println("|Subjects: Marks    |");
        System.out.println("|--------------------------------|");
        System.out.println("|Maths: " +math+   "|");
        System.out.println("|Science: " +science+  "|");
        System.out.println("|English: " +English+  "|");
        System.out.println("|---------------------------------|");
        System.out.println("|Total: " +total+  "|");
        System.out.println("|---------------------------------|");
        System.out.println("|Percentage: " +percent+  "%|");
        System.out.println("|----------------------------------|");
    }
}


