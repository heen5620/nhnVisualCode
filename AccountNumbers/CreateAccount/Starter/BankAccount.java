import java.math.*;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;

    private static long nextAccountNUmber;

    public static long nextNumber() {
        return nextAccountNUmber++;
    }

    //
    // add setData method here.
    //
    public void setData(String ownerName, BigDecimal balance) {
        this.accountNumber = nextNumber();
        this.ownerName = ownerName;
        this.balance = balance;

    }

    public long getNumber() {
        return this.accountNumber;
    }

    public String getName() {
        return this.ownerName;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }
    //
    // add getNumber method here.
    //
}

class CreateAccount {
    public static BankAccount createNewBankAccount(String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();

        newAccount.setData(ownerName, balance);

        return newAccount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = CreateAccount.createNewBankAccount("Vesper Lind", new BigDecimal("0.0"));
        printBankAccount(bankAccount);
        BankAccount bankAccount2 = CreateAccount.createNewBankAccount("Celine", new BigDecimal("0.0"));
        printBankAccount(bankAccount2);
        BankAccount bankAccount3 = CreateAccount.createNewBankAccount("Jaejun", new BigDecimal("0.0"));
        printBankAccount(bankAccount3);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Owner Name: " + account.getName());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("!");
    }

    
}