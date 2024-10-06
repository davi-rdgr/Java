package sec13.pkg1.pkg1;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Sec1311 {

    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.00);
        
        // Upcasting:
        
        Account acc1 = bacc;
        acc1.getBalance();
        
        Account acc2 = new BusinessAcount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
        
        
        // Downcasting:
        
        BusinessAcount acc4 = (BusinessAcount)acc2;
        acc4.Loan(100.0);
    }

}
