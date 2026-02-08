
import  java.util.Scanner;
public class reverse_number {
    public static void main (String[] args){
        int no;
        System.out.println("enter no:");
        Scanner sc = new Scanner(System.in);
        no=sc.nextInt();
        int ans=0;
        while(no>0){
            int lastdig=no%10;
            ans=ans*10+lastdig;
            no= no/10;
        }
        System.out.println("the no:"  +ans );
    }
}
