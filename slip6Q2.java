// Write a program which define class Product with data member as id, name and price. Store
// the information of 5 products and Display the name of product having minimum price (Use array
// of object).
class product {
    int id;
    String name;
    int price;

    public product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("price: " + price);

    }
}

public class slip6Q2 {
public static void main(String[] args){
    product[] p= new product[5];
    p[0]=new product(1, "mac", 1);
    p[1]=new product(2, "iphone", 2);
    p[2]=new product(3, "airpods", 0);
    p[3]=new product(4, "macmini", 91000);
    p[4]=new product(5, "earphone", 91000);

System.out.println("the product detail");

    for(int i=0;i<5;i++){
        p[i].display();
    }

    System.out.println("the product list after sorting: ");
    product mini=p[0];
    for(int i=0;i<5;i++){
        if(p[i].price<mini.price){
            mini=p[i];
        }
    }

    mini.display();
}
}
