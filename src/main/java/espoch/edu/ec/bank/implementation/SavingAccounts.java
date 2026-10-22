package espoch.edu.ec.bank.implementation;

import espoch.edu.ec.bank.interfaces.InterfazSavingAccount;
import espoch.edu.ec.bank.object.Account;
import espoch.edu.ec.bank.object.SavingAccount;

public class SavingAccounts extends Accounts implements InterfazSavingAccount {

    @Override
    public boolean deposit(SavingAccount account, float value) {
        boolean res = false;
        if (state(account) != true) {
            res = super.deposit(account, value);

        }
        return res;
    }

    @Override
    public boolean withdraw(SavingAccount account, float value) {
        boolean f = false;
        int cont = 0;
        if ((state(account)) != false) {
            f = super.withdraw(account, value);

            cont=account.getNumberWithdrawals()+1;
            account.setNumberDeposits(cont);
        }

        return f;
    }

    @Override
    public boolean montthlyStatement(SavingAccount account) {
       
            boolean re = false;
            if (account.getNumberWithdrawals() > 4) {
                float ax = account.getMonthlyFee() + 1000;
                account.setMonthlyFee(ax);
                re = true;
            }
        

        return re;
    }

    @Override
    public String show(SavingAccount account) {
        return "Account" + "balance=" + account.getBalance() +
                ",\n numberDeposits=" + account.getNumberDeposits() + 
                ", \n numberWithdrawals=" + account.getNumberWithdrawals() + 
                ", \n anualInteres=" + account.getAnualInteres() + 
                ",\n monthlyFee=" + account.getMonthlyFee();
    }

    public boolean state(SavingAccount account) {

        if (account.getBalance() <= 10000) {
            account.setState(false);

        } else {
            account.setState(true);

        }
        return account.isState();
    }
}
