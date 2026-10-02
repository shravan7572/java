//  Write a program to create a super class Employee (members – name, salary). Derive a
// sub-class as Developer (member – projectname). Create object of Developer and display the
// details of it.
class emp{
    String name;
    int salary;

    public emp(String name,int salary){
        this.name=name;
        this.salary=salary;
    }

    void display(){
        System.out.println("Name: "+name);
         System.out.println("salary: "+salary);
    }
}

class dev extends emp{
    String prjname;

    public dev(String name,int salary,String p){
        super(name,salary);
        this.prjname=p;
    }

    void display(){
        super.display();;
 System.out.println("ProjectName: "+prjname);
    }
}

public class slip19Q2 {
public static void main(String[] args){
    dev d= new dev("Shravan" ,100000,"Prod");

    d.display();
}
    
}
