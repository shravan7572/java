// Create a class Student (rollno, name ,class, per) to read student information using
// BufferedReader class and display details.
import java.io.*;
class Student{
    int rollno;
    String name;
    String classname;
    double per;

    public Student(int rollno,String name,String classname,double per){
        this.rollno=rollno;
        this.name=name;
        this.classname=classname;
        this.per=per;
    }

    void display(){
        System.out.println("rollno: "+rollno);
        System.out.println("name: "+name);
        System.out.println("classname: "+classname);
        System.out.println("per: "+per);
    }
}

public class slip16Q1{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter your rollno");
        int rollno=Integer.parseInt(br.readLine());


        System.out.println("enter your name");
        String name=br.readLine();
        

        System.out.println("enter your classname");
        String classname=br.readLine();
        

        System.out.println("enter your percentage");
        double percentage=Double.parseDouble(br.readLine());
        
        Student s=new Student(rollno,name,classname,percentage);
        s.display();
    }

}