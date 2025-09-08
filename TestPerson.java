// MyDate reused from 10.14
import java.util.GregorianCalendar;

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return year + "-" + (month + 1) + "-" + day;
    }
}

// Base class
class Person {
    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

// Student class
class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    private int status;

    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

// Employee class
class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phone, String email,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

// Faculty class
class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email,
                   String office, double salary, MyDate dateHired,
                   String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

// Staff class
class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + name;
    }
}

// Test program
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Alice", "123 Street", "555-1234", "alice@email.com");
        Student student = new Student("Bob", "456 Avenue", "555-5678", "bob@email.com", Student.SOPHOMORE);
        Employee employee = new Employee("Carol", "789 Road", "555-8765", "carol@email.com",
                                         "Room 101", 50000, new MyDate());
        Faculty faculty = new Faculty("David", "321 Blvd", "555-4321", "david@email.com",
                                      "Room 202", 70000, new MyDate(),
                                      "MWF 10-12", "Professor");
        Staff staff = new Staff("Eve", "654 Lane", "555-1111", "eve@email.com",
                                "Room 303", 40000, new MyDate(), "Administrator");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
