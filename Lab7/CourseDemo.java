class Course {
    private int id;
    private String description;
    private int duration; 
    private double fees;

    public Course(int id, String description, int duration, double fees) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    public void getData() {
        System.out.println("Course ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fees: $" + fees);
        System.out.println();
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        Course[] courses = new Course[5];

        // Initialize the Course objects
        courses[0] = new Course(101, "Java Programming", 40, 299.99);
        courses[1] = new Course(102, "Python Programming", 35, 249.99);
        courses[2] = new Course(103, "Web Development", 50, 399.99);
        courses[3] = new Course(104, "Data Science", 60, 499.99);
        courses[4] = new Course(105, "Machine Learning", 45, 349.99);

        System.out.println("Course Details:\n");
        for (Course course : courses) {
            course.getData();
        }
    }
}
