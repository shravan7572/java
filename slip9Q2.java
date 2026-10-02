// Define a “Point” class having members – x,y(coordinates). Define default constructor and
// parameterized constructors. Define subclass “Point3D” with member as z (coordinate). Write
// display method to show the details of Point.

class Point{

    int x,y;

    public Point(){
        x=0;
        y=0;
    }

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    void display(){
        System.out.println("the X coordinate is :"+x);
         System.out.println("the Y coordinate is :"+y);
    }
}
class Dpoint extends Point{
    int z;
    public Dpoint(){
        z=0;
    }

    public Dpoint(int x,int y,int z){
        super(x,y);
        this.z=z;
    }

    void display(){
        super.display();

        System.out.println("the Z coordinate is : "+z);
    }
}

public class slip9Q2 {
    public static void main(String[] args){
        Dpoint d=new Dpoint(1,3,8);
        d.display();
    }
}
