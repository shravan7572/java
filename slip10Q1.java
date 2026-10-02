// Write a program to accept a number from user. Check whether number is prime or not.
// Accept the number using command line argument.

public class slip10Q1 {
    public static void main(String[] args){
        int number =Integer.parseInt(args[0]);
        boolean prime=true;
        if(number<=1){
            prime=false;
        }

        for(int i =2;i<number;i++){
            if(number%i==0){
                prime=false;
                break;
            }
        }

        if(prime){
            System.out.println("the number "+number+ " is prime");
        }
        else{
           System.out.println("the number "+number+" is not prime");  
        }
    }
    
}
