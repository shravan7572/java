// Write a program to accept the 'n' different numbers from user and store it in array. Display
// maximum number from an array.
import java.util.Scanner;
public class slip19Q1 {
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter n number: ");
    int n=sc.nextInt();

    int[] arr=new int[n];

    for(int i=0;i<n;i++){
        System.out.println("enter "+(i+1)+" number");
        arr[i]=sc.nextInt();
    }

    int max=arr[0];

    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }

    System.out.println("the maximum in array is : "+max);
    sc.close();
}    
}
