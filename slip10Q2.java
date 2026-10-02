// Create a package “utility”. Define a class CapitalString under “utility” package which will
// contain a method to return String with all capital letters. Create a Person class (members – name,
// city) outside the package. Display the person name with all letters capital by making use of
// CapitalString.
import utilty.convert;
class Person{
    String name,city;
    public Person(String p,String c){
        this.name=p;
        this.city=c;
    }

}


public class slip10Q2 {
public static void main(String[] args){
    Person p=new Person("Shravan","Pune");
convert c= new convert();

System.out.println("name in captial: "+c.con(p.name));
System.out.println("city in captial: "+c.con(p.city));
}
    
}
