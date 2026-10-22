package espoch.edu.ec.bank.implementation;

import espoch.edu.ec.bank.object.Account;

public class Accounts {

    public boolean deposit(Account account, float value) {
        float ax = account.getBalance() + value;
        account.setBalance(ax);
        return true;
    }

    public boolean withdraw(Account account, float value) {
        boolean rest = false;
        if (value <= account.getBalance()) {
            float aux = account.getBalance() - value;
            account.setBalance(aux);
            rest = true;
        }
        return rest;
    }

    private float calculateMontthlyInterest(Account account) {

        return account.getAnualInteres() / 12;
    }

    public boolean montthlyStatement(Account account) {
        float mti = calculateMontthlyInterest(account);
        float newbalance = ((account.getMonthlyFee()) * mti) - (account.getBalance() - account.getMonthlyFee());
        account.setBalance(newbalance);

        return true;
    }

    public String show(Account account) {
        return "Account" + "balance=" + account.getBalance() +
                ",\n numberDeposits=" + account.getNumberDeposits() + 
                ", \n numberWithdrawals=" + account.getNumberWithdrawals() + 
                ", \n anualInteres=" + account.getAnualInteres() + 
                ",\n monthlyFee=" + account.getMonthlyFee();
    }
}
