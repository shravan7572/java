// Write a program create class as MyDate with dd,mm,yy as data members. Write
// parameterized constructor. Display the date in dd-mm-yy format. (Use this keyword)
class Mydate{
    int dd,mm,yy;

    public Mydate(int d,int m,int y){
        this.dd=d;
        this.mm=m;
        this.yy=y;
    }

    void display(){
        System.out.println(dd+"-"+mm+'-'+yy);
    }
}

public class slip11Q1 {
    public static void main(String[] args){
        Mydate m=new Mydate(31,05,06);

        m.display();
    }
}
