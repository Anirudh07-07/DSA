import java.util.Scanner;
public class palinorme_no{
    public static void main(String[] args){
        int number;
        System.out.println("enter no:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int reverse =0,temp = number ;
        while(temp>0){
            int rem = temp%10;
            reverse = reverse *10+rem;
            temp=temp/10;
        }
        if(number==temp){
            System.out.println("true" );
        }

    }
}
