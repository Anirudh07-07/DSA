import java.util.Scanner;

public class count{
    public static void main(String[] args) {
       System.out.print("enter a number :");
       Scanner sc =new Scanner(System.in);
         int n = sc.nextInt();
      System.out.println("the given no." +n );   
      int count=0;

      while(n!=0){
        n=n/10;
        
        count++;
      }
      System.out.println("the digit are :"+count);
} 
}