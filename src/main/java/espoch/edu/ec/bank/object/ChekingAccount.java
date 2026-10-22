package espoch.edu.ec.bank.object;

public class ChekingAccount extends Account {

    protected float overdraft;

    public ChekingAccount(float overdraft, float balance, float anualInteres) {
        super(balance, anualInteres);
        this.overdraft = overdraft;
    }
    //set y get

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

}
