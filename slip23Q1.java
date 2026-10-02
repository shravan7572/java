//  Write a program to create class Person (pname, pmobno). Create two objects of Person class.
// Display hashcode of these two objects and check whether hashcode are equal or not.

class person{
    String name;
    int number;

    public person(String name,int number){
        this.name=name;
        this.number=number;
    }

    void display(){
        System.out.println("name : "+name);
        System.out.println("number : "+number);
    }
}

public class slip23Q1 {
    public static void main(String[] args){
        person p1=new person("shravan",90909090);
        person p2=new person("teja",123123);

        int hashp1=p1.hashCode();
        int hashp2=p2.hashCode();

        if(hashp1==hashp2){
            System.out.println("the hash are equal." +hashp1 +" "+hashp2);
        }
        else{
            System.out.println("the hash is not equal"+hashp1 +" "+hashp2);
        }

        p1.display();
        p2.display();
    }
    
}
