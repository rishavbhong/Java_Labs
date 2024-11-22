import java.util.Scanner;

class Student {
    private String name;

    public String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        name = scanner.nextLine();
        return name;
    }

    public String average(int mark1, int mark2, int mark3) {
        double avg = (mark1 + mark2 + mark3) / 3.0;
        System.out.println("Average Marks: " + avg);
        return avg >= 50 ? "Passed" : "Failed";
    }

    public void displayStudentDetails(int mark1, int mark2, int mark3) {
        System.out.println("Student Name: " + name);
        System.out.println("Result: " + average(mark1, mark2, mark3));
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        String name = student.inputName();

        System.out.print("Enter marks for Exam 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter marks for Exam 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter marks for Exam 3: ");
        int mark3 = scanner.nextInt();

        System.out.println("\nStudent Details:");
        student.displayStudentDetails(mark1, mark2, mark3);
    }
}
