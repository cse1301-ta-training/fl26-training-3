package module7;

public class Course {
    private String name;
    private int credits;
    private int capacity;
    private Student[] roster;
    private int currentEnrollment = 0;

    public Course(String name, int credit, int capacity) {
        this.name = name;
        this.credits = credit;
        this.capacity = capacity;
        this.roster = new Student[capacity];
    }

    public boolean addStudent(Student s) {
        for (int i = 0; i < currentEnrollment; i++) {
            if (roster[i].getId() == s.getId()) {
                return false;
            }
        }

        if (getSeatsRemaining() > 0) {
            roster[currentEnrollment] = s;
            currentEnrollment++;
            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public int getSeatsRemaining() {
        return capacity - currentEnrollment;
    }

    public int getCapacity() {
        return capacity;
    }

    public Student getStudentAt(int index) {
        return roster[index];
    }

    public String generateRoster() {
        String result = " ";
        for (int i = 0; i < currentEnrollment; i++) {
            result += " " + roster[i].getFullName();
        }
        return result;
    }

    public double calculateAverageGPA() {
        double gpaSum = 0;
        for (int i = 0; i < currentEnrollment; i++) {
            gpaSum += roster[i].calculateGradePointAverage();
        }
        return gpaSum / currentEnrollment;
    }

    @Override
    public String toString() {
        return name + " " + credits;
    }
}