// Write a program to reverse a number. Accept number using BufferedReader class.



import java.io.*;
public class slip8Q1 {
    public static void main(String[] agrs) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number to reverse: ");
        int num=Integer.parseInt(br.readLine());
        int temp=num;

        int rev=0;

        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }

        System.out.println("Original number: "+temp);
         System.out.println("reverse number: "+rev);

    }
}
