package espoch.edu.ec.bank;

import espoch.edu.ec.bank.implementation.SavingAccounts;
import espoch.edu.ec.bank.interfaces.InterfazSavingAccount;
import espoch.edu.ec.bank.object.SavingAccount;

public class Bank {

    public static void main(String[] args) {
        SavingAccount account=new SavingAccount(true, 5000, 0);
        InterfazSavingAccount newAccount =new SavingAccounts();
        newAccount.deposit(account, 1000);
        newAccount.withdraw(account, 2000);
        System.out.println(newAccount.show(account));
    }
}
