//  Create a package named “Series” having a class to print series of Cube of numbers. Write a
// program to generate “n” terms series.
import java.util.Scanner;
import serie.cube;
public class slip17Q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n number: ");
        int n=sc.nextInt();

        cube c=new cube();
        c.cuben(n);
    }
}
