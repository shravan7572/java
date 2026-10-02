// Write a program to accept the 'n' different numbers from user and store it in array. Print the
// sum of elements of the array.
import java.util.Scanner;
public class slip3Q1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            System.out.println("enter number : "+arr[i]);
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }

        System.out.println("the sum of N number is : "+sum);
        sc.close();
    }
    
}
