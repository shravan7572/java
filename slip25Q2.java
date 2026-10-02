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
}
public class slip25Q2 {
    
}
