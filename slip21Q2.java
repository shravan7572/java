//  Write a class Student with attributes roll no, name, age and course. Initialize values through
// parameterized constructor. If student's roll no of is not in between 13001 to 13080 then generate
// user- defined exception —Rollno is Not Within The Range.
class rangeex extends Exception{
    public rangeex (String msg){
        super(msg);
    }
}

class student {
    int rollno;
    String name;
    int age;
    String course;

    public student(int rollno,String name,int age,String course)throws rangeex{
        if(rollno<=13001||rollno>=13080){
            throw new rangeex("the roll number is not in range.");
        }

        this.rollno=rollno;
        this.name=name;
        this.age=age;
        this.course=course;

    }
        void display(){
            System.out.println("rollno: "+rollno);
            System.out.println("name: "+name);
            System.out.println("age: "+age);
            System.out.println("course: "+course);
        } 
    
}

public class slip21Q2 {
    public static void main(String[] agrs){
        try{
        student s=new student(13010,"shravan",20,"cs");
        s.display();
    }catch(rangeex r){
        System.out.println(r.getMessage());
    }
}
    
}
