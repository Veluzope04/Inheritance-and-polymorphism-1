public class SavingAccounts extends Account{

    private int interestRate;


    public SavingAccounts(int accountNumber, String accountHolder, double balance, int interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public int getInterestRate() {

        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void getaccInfo() {
//        super.getaccInfo();
        System.out.println(" Name of consumer : " +getAccountHolder()+ " consumer accnumber : " + getAccountNumber() + "consumer balance " + getBalance() + " Interest rate " + interestRate);
    }
}
