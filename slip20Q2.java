// Create an employee class (id,name,deptname,salary). Define a default and parameterized
// constructor. Use ‘this’ keyword to initialize instance variables. Keep a count of objects created.
// Create objects using parameterized constructor and display the object count after each object is
// created. Also display the contents of each object.
class emp {
    int id;
    String name;
    String deptname;
    int salary;

    static int count;

    public emp() {
        id = 0;
        name = "";
        deptname = "";
        salary = 0;
        count++;
    }

    public emp(int id, String name, String deptname, int salary) {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        count++;
    }

    void diplay() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("deptname: " + deptname);
        System.out.println("salary: " + salary);
    }
}

public class slip20Q2 {
    public static void main(String[] args){
        emp e1= new emp(1,"shravan","cs",10000);
        System.out.println("object count: "+emp.count);
        e1.diplay();

         emp e2= new emp(1,"teja","ai",10001);
        System.out.println("object count: "+emp.count);
        e2.diplay();
    }

}
