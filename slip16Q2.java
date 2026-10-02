// . Define an interface “Operation” which has methods calArea(), calCircumference(). Define a
// constant PI having value 3.142. Create a class circle (member – radius) which implements this
// interface. Calculate and display the area and circumference.
interface Operation{
    double pi=3.14;
    void calarea();
    void calcir();

}
class circle implements Operation{
    double radius;

    public circle(double r){
        this.radius=r;
    }
   public void calarea(){
    System.out.println("the area of circle is "+pi*radius*radius);
    
    }

    public void calcir(){
 System.out.println("the circumference of circle is "+2*pi*radius);
    }
}
public class slip16Q2 {
    public static void main(String[] args){
        circle c=new circle(5);
        c.calarea();
        c.calcir();
    }
    
}
