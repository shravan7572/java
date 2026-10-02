//  Write a program to display the Employee (Empid, Empname, Empdesignation, Empsal)
// information using toString().
class employee{
    int empid;
    String empname;
    String empdes;
    int empsal;

    public employee(int ei,String en,String ed,int es){
        this.empid=ei;
        this.empname=en;
        this.empdes=ed;
        this.empsal=es;
    }

    public String toString(){
        return "Emp name: "+empname+
        "\nemp id" +empid+
        "\n emp des "+empdes+
        "\n emp salary: "+empsal;
    }
}

public class slip6Q1 {
    public static void main(String[] args){
        employee e= new employee(1, "shravan", "paris", 100000);

        System.out.println(e.toString());
    }
    
}
