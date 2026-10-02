
//  Write a program to accept a number from the user using BufferedReader class. Display
// factorial of a number.
import java.io.*;

public class slip5Q1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number : ");
        int num = Integer.parseInt(br.readLine());

        int fact=1;

        for(int i=1;i<=num;i++){
            fact=fact*i;
        }

        System.out.println("factorial of number "+num+"is "+fact);

    }

}
