public class util {

    public static  void processAccount( Account[]accounts){

        for (Account account : accounts){

            if (account instanceof SavingAccounts){
                account.deposite(500);

            } else if (account instanceof CheckingAccount) {

                account.withdraw(100);

            }
        }


    }

}
