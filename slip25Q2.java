// Define a class SavingAccount (acno, name, balance). Define appropriate operations as,
// withdraw(), deposit(), and viewbalance(). The minimum balance must be 500. Create an object
// and perform operation. Raise user defined —InsufficientFundException when balance is not
// sufficient for withdraw operation.
class isb extends Exception{
    public isb(String msg){
        super(msg);
    }
}

class savingaccount{
    int acno;
    String name;
    double bal;

    public savingaccount(int acno,String name,double bal){
        this.acno=acno;
        this.name=name;
        this.bal=bal;
    }

    void deposite(double  amount){
        bal=bal+amount;
        System.out.println("amount deposite: "+amount);
    }

    void withdrae(double amount)throws isb{
        if(bal-amount<500){
            throw new isb("insufficent balance in ur acc");

        }
    }
    void viewbalance(){
        System.out.println("acno"+acno);
         System.out.println("name"+name);
          System.out.println("bal"+bal);
    }
}
public class slip25Q2 {
    public static void main(String[] args){
        savingaccount s=new savingaccount(102,"shravan", 200);
        try{
            s.deposite(500);
            s.withdrae(900);
           
        }catch(isb i){
            System.out.println(i.getMessage());
        }
         s.viewbalance();
    }
    
}
