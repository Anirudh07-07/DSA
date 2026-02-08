import java.util.Scanner;

class Countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 👈 error happens here (line 7)
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println(count);
    }
}
