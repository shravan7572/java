// Write a java program to define a class Employee with data member as name and salary.
// Store the information of 5 Employees using array of object. Display the details of employee
// having maximum salary.

class employee {
    String name;
    int salary;

    public employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    };

    void display() {
        System.out.println("Name: " + name);
        System.out.println("salary: " + salary);
    }
}

public class slip1Q2 {
    public static void main(String[] args) {
        employee[] e = new employee[5];
         e[0] = new employee("shravan", 99999);
         e[1] = new employee("vishal", 2);
         e[2] = new employee("teja", 3);
         e[3] = new employee("vinet", 4);
         e[4] = new employee("kunal", 995445999);

        for(int i=0;i<5;i++){
            e[i].display();
        }

        

        employee max=e[0];

        for(int i=0;i<5;i++){
            if(e[i].salary>max.salary){
                max=e[i];
            }
        }
        System.out.println("the maximum salary of the employee: ");
        max.display();
    }

}
