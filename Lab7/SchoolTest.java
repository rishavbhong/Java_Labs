class Teacher {
    protected String name;
    protected int age;
    protected String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}


class Student extends Teacher {
    private int rollNumber;
    private String grade;

    // Constructor for Student class
    public Student(String name, int age, String subject, int rollNumber, String grade) {
        super(name, age, subject); 
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("A", 45, "Mathematics");
        System.out.println("Teacher Details:");
        teacher.displayDetails();

        System.out.println();

        Student student = new Student("John Doe", 16, "Mathematics", 101, "10th Grade");
        System.out.println("Student Details:");
        student.displayDetails();
    }
}
