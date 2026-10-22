package espoch.edu.ec.bank.interfaces;

import espoch.edu.ec.bank.object.SavingAccount;

public interface InterfazSavingAccount {

    public boolean deposit(SavingAccount account, float value);

    public boolean withdraw(SavingAccount account, float value);

    public boolean montthlyStatement(SavingAccount account);

    public String show(SavingAccount account);
}
