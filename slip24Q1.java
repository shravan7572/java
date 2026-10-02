//  Write a program to display sum of digits of a number. Accept number using command line
// argument.

public class slip24Q1 {
    public static void main(String[] args){
        int num=Integer.parseInt(args[0]);

        int temp=num;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }

        System.out.println("the sum of number "+temp+" is : "+sum);
    }
}
