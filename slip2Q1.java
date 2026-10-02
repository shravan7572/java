
// Q1. Write a program to read the First Name and Last Name of a person, his weight and height
// using Scanner class. Calculate the BMI Index which is defined as the individual's body mass
// divided by the square of their height.
// (Hint : BMI = Wts. In kgs / (ht)2 )
import java.util.Scanner;

public class slip2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first name: ");
        String firstname = sc.nextLine();

        System.out.println("enter last name: ");
        String lastname = sc.nextLine();

        System.out.println(firstname +"enter your body weight in kg: ");
        double weight = sc.nextDouble();

        System.out.println(firstname +"enter hegiht in meters: ");
        double height = sc.nextDouble();


        double BMI=weight/(height*height);

        System.out.println("Name: "+firstname);
        System.out.println("lastname: "+lastname);
        System.out.println("weight: "+weight);
        System.out.println("height: "+height);
        System.out.println("BMI: "+BMI);


        sc.close();

    }

}
