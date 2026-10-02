// Write a program to accept the user name and greets the user by name. Before displaying
// the user's name, convert it to upper case letters. For example, if the user's name is Raj, then
// display greet message as "Hello, RAJ, nice to meet you!"
import java.util.Scanner;
public  class slip4Q1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        String uppercase=name.toUpperCase();
        System.out.println("normal name: "+name);

        System.out.println("Hello,"+uppercase+",nice to meet you!");

        sc.close();

    }
}
