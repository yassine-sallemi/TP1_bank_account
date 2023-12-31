public class Main {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.deposit(50);
        System.out.println("Balance is: " + b.getBalance());
        b.withdraw(51);
        b.withdraw(12);
        System.out.println("Balance is: " + b.getBalance());
    }
}




