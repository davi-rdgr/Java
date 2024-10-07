package sec13.pkg1.pkg1;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Sec1311 {

    public static void main(String[] args) {

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.whitDraw(50.0);
        y.whitDraw(50.0);
        
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
                
                
    }

}
