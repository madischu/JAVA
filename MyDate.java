import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month; // 0-based (0 = January)
    private int day;

    // No-arg constructor: current date
    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // Constructor with elapsed time
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor with specific year, month, day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getters
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Set date with elapsed time
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // Test program (main method)
    public static void main(String[] args) {
        // First MyDate object: current date
        MyDate date1 = new MyDate();
        System.out.println("Date1: " + date1.getYear() + "-" +
                           (date1.getMonth() + 1) + "-" +
                           date1.getDay());

        // Second MyDate object: elapsed time
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("Date2: " + date2.getYear() + "-" +
                           (date2.getMonth() + 1) + "-" +
                           date2.getDay());
    }
}
