// Write a class Student with attributes roll no, name, age and course. Initialize values through
// parameterized constructor. If age of student is not in between 15 and 21 then generate user-
// defined exception —Age Not Within The Range.
class exceptionage extends Exception {
    public exceptionage(String message) {
        super(message);
    }
}

class student {
    int rollno;
    String name;
    int age;
    String course;

    public student(int rollno, String name, int age, String course) throws exceptionage {
        if (age < 15 || age > 21) {
            throw new exceptionage(
                "age is not in range");

        }
        this.rollno=rollno;
        this.age=age;
        this.name=name;
        this.course=course;

    }

        void display(){
            System.out.println("Roll-no "+rollno);
            System.out.println("name "+name);
            System.out.println("age "+age);
            System.out.println("course "+course);
        }
}

public class slip13Q2 {
    public static void main(String[] args){
        try{
            student s=new student(31,"shravan",20,"cs");
            s.display();

        }catch(exceptionage e){
            System.out.println(e.getMessage());
        }
    }

}
