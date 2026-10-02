// Create a package named “Series” having a class to print series of Square of numbers. Write a
// program to generate “n” terms series.
import java.util.Scanner;
import series.square;
public class slip15Q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n : ");
        int num=sc.nextInt();

        square s=new square();

        s.printsq(num);
        sc.close();
    }
}
