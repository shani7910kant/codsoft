import java.util.*;
public class ATMmachine {
    int ac_no;
    String name, type;
    float amount;
    void details( int n, String nm,String t, float a)
    {
        ac_no = n;
        name =nm;
        type =t;
        amount=a;
    }
    void show()
    {
        System.out.println(ac_no+" "+name+" "+type+" "+amount );

    }
    void deposit(float a )
    {
        amount +=a;
        System.out.println("Deposting amount:"+a);

    }
    void withdraw(float a)
    {
        if (amount<a)
            System.out.println("checking  balance:");
        else amount-=a;
        System.out.println("withdrawing amount:"+a );

    }
    void checkbalance()
    {
        System.out.println("Balance is:"+amount);
    }

}class ATM{
    public static void main (String args[])
    {
        ATMmachine b=new ATMmachine();
        b.details(1234,"Shani kant prasad","saving",1000);
        b.show();
        b.deposit(40000);
        b.checkbalance();
        b.withdraw (1000);
        b.checkbalance();
    }
}