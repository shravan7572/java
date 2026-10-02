//  Write a program to display count the number of digits of a number. Accept number using
// BufferedReader class.

import java.io.*;

public class slip25Q1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number : ");
        int num=Integer.parseInt(br.readLine());

            int cnt=0;
        while(num!=0){
            num=num/10;
            cnt++;
        }

        System.out.println("the number of digit is : "+cnt);

    }
    
}
