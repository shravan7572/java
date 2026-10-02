// Write a program to accept ‘n’ names of countries and display country names in capital
// letters.
import java.util.Scanner;
public class slip12Q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of countries: ");
        int n=sc.nextInt();
        sc.nextLine();
 String[] countryname=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("enter "+i+"country name: ");
             countryname[i]=sc.nextLine();
             
        }

        System.out.println("Country in capital");
        for(int i=0;i<n;i++){
            System.out.println(countryname[i].toUpperCase());

        }
        sc.close();
    }

}
