package constructorpack;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();//"332211", 600.0,
            //    "Vincent Betta","pescaditofeliz@gmail.com"); // create the obj from the class

//        account.setAccountNumber("332211"); // with the constructor we don't need this lines.
//        account.setBalance(600.0);
//        account.setCustomerName("Vincent Betta");
//        account.setEmail("pescaditofeliz@gmail.com");

        System.out.println("Account Number = " + account.getAccountNumber());
        System.out.println("Balance = $" + account.getBalance());
        System.out.println("Customer Name = " + account.getCustomerName());
        System.out.println("E-mail = " + account.getEmail());
        account.toDepositFunds(200);
        account.toWithdrawFunds(800);
        System.out.println("Updated Balance = $" + account.getBalance());

        BankAccount tomAccount = new BankAccount("Tom", "tom@gmail.com");
        System.out.println(tomAccount.getAccountNumber() + " name " + tomAccount.getCustomerName());

    }
}
