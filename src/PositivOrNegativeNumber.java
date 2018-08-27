import java.util.Scanner;

public class PositivOrNegativeNumber {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number and press Enter");
        number = in.nextInt();
        in.close();
        if (number > 0) {
            System.out.println(number + " is positive number");
        } else if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println(number + " is neither positive nor negative");
        }
    }
}
