package design_patterns.builder;

public class Student {
    private String name;
    private int age;
    private String description;
    private Double gradeAverageFirstYear;
    private Double gradeAverageSecondYear;
    private Double gradeAverageThirdYear;
    private Double gradeAverageFourthYear;

    public Student(String name, int age, String description, Double gradeAverageFirstYear, Double gradeAverageSecondYear, Double gradeAverageThirdYear, Double gradeAverageFourthYear) {
        this.name = name;
        this.age = age;
        this.description = description;
        this.gradeAverageFirstYear = gradeAverageFirstYear;
        this.gradeAverageSecondYear = gradeAverageSecondYear;
        this.gradeAverageThirdYear = gradeAverageThirdYear;
        this.gradeAverageFourthYear = gradeAverageFourthYear;
    }

    /**
     * The problem here is building a new Student is a complex process.
     * Also, null parameters are not a good practice.
     * Builder is a design pattern that solve our issue.
     */

    public static void main(String[] args) {
        Student student_1 = new Student("Andrei", 29, "This student graduated, has all grades not null.", 6.5, 6.5, 6.5, 6.5);
        Student student_2 = new Student("Andreea", 29, "This student only graduated first year.", 7.5, null, null, null);
    }
}
