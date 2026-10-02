// Write a Java program to display prime numbers in the range from 1 to 100.

public class slip13Q1 {
    public static void main(String[] args){
       
        for(int num=2;num<=100;num++){
             boolean prime=true;


             for(int i=2;i<num;i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
             }
             if(prime){
                System.out.println(num);
             }

    }

   
    }
    
}
