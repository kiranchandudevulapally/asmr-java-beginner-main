import java.util.Scanner;

public class Student {
    private final String name;
    private final double[] marks;
    private double totalMarks;
    private double averageMarks;
    private String grade;

    Student(String name, int numSubjects) {
        this.name = name;
        this.marks = new double[numSubjects];
        this.totalMarks = 0;
        this.averageMarks = 0;
        this.grade = "";
    }

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }
        averageMarks = totalMarks / marks.length;

        scanner.close();
    }

    public void calculateGrade() {
        if (averageMarks >= 90) {
            grade = "A";
        } else if (averageMarks >= 80) {
            grade = "B";
        } else if (averageMarks >= 70) {
            grade = "C";
        } else if (averageMarks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    public void displayResults() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
    }
}
