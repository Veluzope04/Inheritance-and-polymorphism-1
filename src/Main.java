// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       Account [] acc = new Account[4];
        acc[0] = new SavingAccounts(550,"AA", 7500.50,4);
        acc[1] = new CheckingAccount(770,"BB", 3500.50,300.45);
        acc[2] = new SavingAccounts(350,"VV",5500.50,4);
        acc[3] = new SavingAccounts(450,"SS",4500.50,500);


        util.processAccount(acc);

        acc[0].getaccInfo();
        acc[1].getaccInfo();
        acc[2].getaccInfo();
        acc[3].getaccInfo();


    }
}