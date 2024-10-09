package sec13.pkg1.pkg1;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;
import java.util.ArrayList;
import java.util.List;

public class Sec1311 {

    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAcount(1002, "Zé", 1000.0, 0.01));
        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAcount(1002, "Zé", 1000.0, 0.01));
        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAcount(1002, "Zé", 1000.0, 0.01));

        double sum = 0.0;

        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.println(sum);
    }

}
