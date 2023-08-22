public class CheckingAccount extends Account {

    private double Overdraftlimit;


    public CheckingAccount(int accountNumber, String accountHolder, double balance, double overdraftlimit) {
        super(accountNumber, accountHolder, balance);
        this.Overdraftlimit = overdraftlimit;
    }

    public double getOverdraftlimit() {
        return Overdraftlimit;
    }

    public void setOverdraftlimit(double overdraftlimit) {

        this.Overdraftlimit = overdraftlimit;
    }

    @Override
    public void getaccInfo() {
        super.getaccInfo();
        System.out.println(" Name of consumer : " + getAccountHolder() + " consumer Number : "
                + getAccountNumber() + " consumer Balance : " + getBalance()+ " Consumer OverdratLimit " + Overdraftlimit );
    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() == 0) {
            double temp = Overdraftlimit - amount;
            this.Overdraftlimit = temp;
            double temp1 = getBalance() - Overdraftlimit;

            System.out.println(" " + temp1);

            if (Overdraftlimit == 0) {

                System.out.println(" Overdraft amount is over ");
            }
        }

        return true;

    }
}




