// Write a program to create a super class Employee (members – name, salary). Derive a sub-
// class Programmer (member – proglanguage). Create object of Programmer and display the
// details of it.
class emp{
    String name;
    int sal;

    public emp(String name,int sal){
        this.name=name;
        this.sal=sal;
    }

    void display(){
        System.out.println("name: "+name);
        System.out.println("sal: "+sal);
    }
}

class programmer extends emp{
    String prolang;

    public programmer(String name,int sal,String prolang)
    {super(name,sal);
        this.prolang=prolang;
    }

    void display(){
        super.display();
        System.out.println("prolang: "+prolang);
    }
}

public class slip24Q2 {
    public static void main(String[] args){
        programmer p= new programmer("shravan", 100000, "java");
        p.display();
    }
}
