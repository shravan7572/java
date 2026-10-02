// Write a program to accept a number from user and generate multiplication table of a
// number. Accept the number using command line argument.

public class slip1Q1{
    public static void main(String[] args){
        int num=Integer.parseInt(args[0]);
 System.out.println("table of number: "+num);
        for(int i=1;i<=10;i++){
           
            System.out.println(num+"X"+i+"="+(num*i));
        }
    }
}