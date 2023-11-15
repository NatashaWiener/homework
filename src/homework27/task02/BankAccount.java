package homework27.task02;

public class BankAccount {
  private double balance;
  private final String accountNumber;
  public BankAccount(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    }
  }

  public void withdraw(double amount) {

    if (amount > 0 && amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Недостаточно средств");
    }
  }
}
