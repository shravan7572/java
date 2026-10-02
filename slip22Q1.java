// Write a proram to accept two string using Scanner class. Check whether two strings are
// equal or not.
import java.util.Scanner;
public class slip22Q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string one: ");
        String str1=sc.nextLine();

         System.out.println("enter string two: ");
        String str2=sc.nextLine();

        if(str1.equals(str2)){
             System.out.println("both string "+str1+" and"+str2+" are equal");
        }
        else{
             System.out.println("both string "+str1 +" and "+str2+" are  not equal");

        }
        sc.close();
    }
}
