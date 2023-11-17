package homework27.task02;

public class Main {

  public static void main(String[] args) {

    BankAccount account = new BankAccount(" 12345 - 6789");

    account.deposit(500);
    System.out.println("money in account" + account.getAccountNumber() +
        " is " + account.getBalance());
    account.withdraw(1000);
    System.out.println("money in account" + account.getAccountNumber() +
        " is " + account.getBalance());
  }
}
