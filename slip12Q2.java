// Create an abstract class Shape with methods area & volume. Derive a class Cylinder (radius,
// height). Calculate area and volume.
abstract class Shape {
    abstract void area();

    abstract void volume();
}

class cyl extends Shape {
    int height;
    int radius;

    public cyl(int h, int r) {
        this.height = h;
        this.radius = r;
    }

    void area() {
        double area = 2 * 3.14 * radius * (radius + height);
        System.out.println("Area of the cly: " + area);
    }

    void volume() {
        double volume = 3.14 * radius *radius * height;
        System.out.println("volume of the cly: " + volume);
    }
}

public class slip12Q2 {
public static void main(String[] args){
    cyl c= new cyl(4,5);

    c.area();
    c.volume();
}
}
