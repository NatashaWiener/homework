package homework27.task02;

public class BankAccount {
  private double balance;
  private String accountNumber;
  public BankAccount(String accountNumber) {

    this.accountNumber = accountNumber;
    this.balance = 0;
  }
  public String getAccountNumber() {
    return accountNumber;
  }

public  double getBalance() {
    return balance;
}
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    }
  }

  public void withdraw(double amount) {

    if (amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Недостаточно средств");
    }
  }
}
