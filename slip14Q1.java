// Write a program to accept a number from user. Check whether number is armstromg or not.
import java.util.Scanner;
public class slip14Q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is armstrong or not: ");
        int num=sc.nextInt();

        int temp=num;
        int sum=0;

        while(num!=0){
            int digit=num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
        if(sum==temp){
        System.out.println("the number"+temp +" is armstrong");
    }
    else{
        System.out.println("the number is not armstrong");
    }
    sc.close();
}
    
}
