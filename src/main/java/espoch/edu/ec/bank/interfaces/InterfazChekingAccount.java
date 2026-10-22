package espoch.edu.ec.bank.interfaces;

import espoch.edu.ec.bank.object.ChekingAccount;

public interface InterfazChekingAccount {

    public boolean deposit(ChekingAccount account,float value);

    public boolean withdraw(ChekingAccount account,float value);

    public boolean montthlyStatement(ChekingAccount account);

    public String show(ChekingAccount account);
}
