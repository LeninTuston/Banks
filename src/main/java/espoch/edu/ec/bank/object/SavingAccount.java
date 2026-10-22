package espoch.edu.ec.bank.object;

public class SavingAccount extends Account {

    //atributos
    protected boolean state;
//constructor

    public SavingAccount(boolean state, float balance, float anualInteres) {
        super(balance, anualInteres);
        this.state = state;
    }

    //set y get
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

}
