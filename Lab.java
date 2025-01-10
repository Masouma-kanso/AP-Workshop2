public class Lab {
    private static Student[] students;
    private static String teacherName;
    private static String dayOfWeek;
    private static int maxSize;
    private static int currentSize;
    private static double avgGrade;

    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        this.students = new Student[maxSize];
        this.currentSize = 0;
        this.avgGrade = 0.0;
    }

    private void calAvg() {
        double total = 0;
        for (int i = 0; i < currentSize; i++) {
            total += students[i].getGrade();
        }
    }

    public void enrollStudent(Student student) {
        if (currentSize < maxSize) {
            students[currentSize] = student;
            currentSize++;
            calAvg();
        } else {
            System.out.println("Cannot add more students.");
        }
    }

    public static double getAvgGrade() {
        return avgGrade;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public static void printLabInfo() {
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Day of Week: " + dayOfWeek);
        System.out.println("maxSize: " + maxSize);
        for (int i = 0; i < currentSize; i++) {
            students[i].printStudentInfo();
        }
    }
}
