// Write a program to Calculate the volume of the cylinder. (Hint : Volume: π × r2 × h)
// Accept the input using Command line argument.

public class slip17Q1 {
    public static void main(String[] args){
        double radius=Integer.parseInt(args[0]);
        double height=Integer.parseInt(args[1]);

        System.out.println("Volume of cylinder: "+3.14*radius*radius*height);
    }
}
