public class Date {

    private int year;
    private int month;
    private int day;

    public Date() {
        this(1970, 01, 01);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return this.year + "," + this.month + "," + this.day;
    }
}
