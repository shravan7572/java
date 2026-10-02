// Create a class Sphere, to calculate the volume and surface area of sphere. Accept the input
// using command line argument.
// (Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))
class Sphere{
    int r;
    public Sphere(int r){
        this.r=r;
    }

    void volume(){
        double vol=((4.0/3.0)*3.14*(r*r*r));

        System.out.println("the volume of the sphere is : "+vol);
    }

    void surface(){
        double sur=4*3.14*(r*r);
          System.out.println("the surface of the sphere is : "+sur);
    }
}

public class slip7Q1 {
public static void main(String[] args){
    int radius=Integer.parseInt(args[0]);

    Sphere s= new Sphere(radius);

    s.volume();;
    s.surface();
}    
}
