// Define a “Point” class having members – x,y (coordinates). Define default constructor and
// parameterized constructors. Define subclass “ColorPoint” with member as color. Write display
// method to display the details of Point.
class Point{
    int x;
    int y;

    public Point(){
         x=0;
         y=0;
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    void display(){
        System.out.println("X;" +x);
        System.out.println("Y;" +y);
    }

}

class colorpoint extends Point{
        String color;

        public colorpoint(){
            x=0;
            y=0;
            color="";
        }

        public colorpoint(int x,int y,String color){
            super(x,y);
            this.color=color;
        }

        void display(){
            super.display();
            System.out.println("color: "+color);
        }
}
public class slip5Q2 {
 public static void main(String[] args){
    colorpoint p=new colorpoint(3,4,"red");

    p.display();
 }   
}
