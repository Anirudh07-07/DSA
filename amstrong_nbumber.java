import java.util.Scanner;
public class amstrong_nbumber {
    public  static  void main(String[] args){
        int no;
        System.out.println("enter number");
        Scanner s= new Scanner(System.in);
        no = s.nextInt();
        int sum=0;
        int temp =no;
        while(temp>0){
            int a = temp%10;
            sum = sum +(a*a*a);
            temp = temp/10;



        }
        System.out.println(sum);

    }
}
