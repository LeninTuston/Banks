package espoch.edu.ec.bank.object;

public class Account {
    //atributos

    protected float balance;
    protected int numberDeposits=0;
    protected int numberWithdrawals=0;
    protected float anualInteres;
    protected float monthlyFee=0.0f;
//constructor 

    public Account(float balance, float anualInteres) {
        this.balance = balance;
        this.anualInteres = anualInteres;
    }
    //set y get

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumberDeposits() {
        return numberDeposits;
    }

    public void setNumberDeposits(int numberDeposits) {
        this.numberDeposits = numberDeposits;
    }

    public int getNumberWithdrawals() {
        return numberWithdrawals;
    }

    public void setNumberWithdrawals(int numberWithdrawals) {
        this.numberWithdrawals = numberWithdrawals;
    }

    public float getAnualInteres() {
        return anualInteres;
    }

    public void setAnualInteres(float anualInteres) {
        this.anualInteres = anualInteres;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + ", numberDeposits=" + numberDeposits + ", numberWithdrawals=" + numberWithdrawals + ", anualInteres=" + anualInteres + ", monthlyFee=" + monthlyFee + '}';
    }

}
