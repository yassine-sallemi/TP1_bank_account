public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance=0;
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        System.out.println("Depositing " + amount + "...");
        balance+=amount;
    }
    public void withdraw(int amount){
        System.out.println("Withdrawing " + amount + "...");

        if(amount<balance)
            balance-=amount;
        else
            System.out.println("Insufficient balance!");
    }
}