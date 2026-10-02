// Write a program to accept a number from user. Check whether number is perfect or not.
// Use Scanner class for accepting input from user.
import java.util.Scanner;
public class slip9Q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        int sum=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }

        if(sum==num){
            System.out.println("THe number is perfect number.");
        }
        else{
            System.out.println("the number is not perfect number.");
        }
        sc.close();
    }
    
}
