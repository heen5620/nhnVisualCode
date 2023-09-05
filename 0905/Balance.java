import java.math.BigDecimal;

public class Balance implements Comparable<Balance> {

    private int balance;

    public Balance(int balance) {
        this.balance = balance;
    }

    public int getBalnce() {
        return this.balance;
    }

    public Balance add(Balance value) {
        this.balance = this.balance + value.getBalnce();
        return value;
    }

    public int compareTo(Balance value) {
        return this.balance - value.getBalnce();
    }

}