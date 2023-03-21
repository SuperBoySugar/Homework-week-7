/**7. Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission
 *  Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
 */
import java.util.Scanner;
public class Program_7 {

    public static void main(String[] args) {

        int  salesid, salary;
        String sellername;
        double salesamount, commission;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales id: ");
        salesid = scanner.nextInt();

        System.out.println("Enter Seller name: ");
        sellername = scanner.next();

        System.out.println("Enter Sales amount: ");
        salesamount = scanner.nextDouble();

        System.out.println("Enter employee Salary: ");
        salary = scanner.nextInt();
        scanner.close();

        // If statement to find the commission
        if (salesamount >=50000){
            System.out.println("Sales commission is: " + (commission = salesamount*0.35));
        } else if (salesamount>30000 && salesamount<50000) {
            System.out.println("Sales commission is: " + (commission = salesamount * 0.20));
        }else if (salesamount>=20000 && salesamount<30000){
            System.out.println("Sales commission is " + (commission=salesamount*0.10));
        }else if (salesamount>=10000 && salesamount<20000){
            System.out.println("Sales commission is " +(commission=salesamount*0.05));
        }else if (salesamount<10000){
            System.out.println("sales commisson is: "+(commission=salesamount*0.02));
        }


    }

}
