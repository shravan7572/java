
// Write a program to print the factors of a number. Accept a number using BufferedReader
// class. 
import java.io.*;

public class slip15Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number and checks its factors: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("the factor are : ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {

                System.out.println(i + " ");
            }
        }

    }
}
