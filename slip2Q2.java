// Define a class MyNumber having one private integer data member. Write a default
// constructor initialize it to 0 and another constructor to initialize it to a value. Write methods
// isNegative, isPositive, isOdd, isEven. Use command line argument to pass a value to the object
// and perform the above operations.

class Mynumber {
    private int num;

    public Mynumber() {
        num = 0;
    }

    public Mynumber(int num) {
        this.num = num;
    }

    void isnegative() {
        if (num < 0) {
            System.out.println(num + "is negative.");
        }
    }
    void isPositive(){
         if (num > 0) {
            System.out.println(num + "is positive.");
        }
    }

    void iseven(){
         if (num %2== 0) {
            System.out.println(num + "is even.");
        }
    }

    void isodd(){
         if (num %2!= 0) {
            System.out.println(num + "is odd.");
        }

    }
}

public class slip2Q2 {
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        
    Mynumber m=new Mynumber(n);

        m.isnegative();
        m.isPositive();
        m.iseven();
        m.isodd();
    }

}
