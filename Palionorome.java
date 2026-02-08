import java.util.Scanner;

public class Palionorome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reverno = 0;
        int temp = number;

        while (temp > 0) {
            int rem = temp % 10;
            reverno = reverno * 10 + rem;
            temp = temp / 10;
        }

        if (number == reverno) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}
