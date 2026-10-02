// Write a program to accept the 'n' different numbers from user and store it in array. Display
// minimum number from an array.
import java.util.Scanner;
public class slip18Q1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n number: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        
         System.out.println("enter "+n +" number: ");
        for(int i =0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int min=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
         System.out.println("Minimum number is: "+min);
    }
}
