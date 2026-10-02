// 1. Write a program to accept 3 numbers using command line argument. Sort and display the
// numbers.

import java.util.Arrays;

public class slip20Q1 {
    public static void main(String[] args){
        int a=Integer.parseInt(args[0]);
         int b=Integer.parseInt(args[1]);
          int c=Integer.parseInt(args[2]);

          int[] number={a,b,c};

          Arrays.sort(number);

          System.out.println("number after sorting");
          for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
          }
    }
}
