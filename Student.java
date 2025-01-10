public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private double grade;

    public Student(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = 0;
    }

    // Method to print student information
    public void printStudentInfo() {
        System.out.println(firstName + " " + lastName + "\nID: " + id + "\nGRADE: " + grade);
    }

    // Setter for grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getFirstName(){
        return lastName;
    }

    public String getId(){
        return id;
    }
}
