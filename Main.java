// Base class Person
class Person {
    private String name;
    private String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Print person's details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

// Subclass Student that extends Person
class Student extends Person {
    private String program;
    private int year;

    // Constructor
    public Student(String name, String address, String program, int year) {
        super(name, address);  // Calling Person's constructor
        this.program = program;
        this.year = year;
    }

    // Setters
    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    // Print student's details (including inherited details)
    @Override
    public void printDetails() {
        super.printDetails();  // Call the base class printDetails()
        System.out.println("Program: " + program);
        System.out.println("Year: " + year);
    }
}

// Subclass Staff that extends Person
class Staff extends Person {
    private String school;
    private double salary;

    // Constructor
    public Staff(String name, String address, String school, double salary) {
        super(name, address);  // Calling Person's constructor
        this.school = school;
        this.salary = salary;
    }

    // Setters
    public void setSchool(String school) {
        this.school = school;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getters
    public String getSchool() {
        return school;
    }

    public double getSalary() {
        return salary;
    }

    // Print staff's details (including inherited details)
    @Override
    public void printDetails() {
        super.printDetails();  // Call the base class printDetails()
        System.out.println("School: " + school);
        System.out.println("Salary: " + salary);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Loyd Descallar", "Balayan Batangas", "BSIT", 2);
        System.out.println("Student Details:");
        student.printDetails();
        System.out.println();

        // Create a Staff object
        Staff staff = new Staff("Rich Lee", "Calaca Batangas", "Batangas State University", 60000);
        System.out.println("Staff Details:");
        staff.printDetails();
    }
}
