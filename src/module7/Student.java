package module7;

public class Student {
    private String firstName;
    private String lastName;
    private String fullName;
    private int Id;
    private double attemptedCredits;
    private double passingCredits;
    private double qualityPoints;
    private double bearBucksBalance;

    public Student(String firstName, String lastName, int Id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.Id = Id;
    }

    public Student(double attemptedCredits, double passingCredits) {
        this.attemptedCredits = attemptedCredits;
        this.passingCredits = passingCredits;
        this.qualityPoints = 0.0;
    }

    public double calculateGradePointAverage() {
        if (this.attemptedCredits == 0) {
            return Double.NaN;
        }
        return this.qualityPoints / attemptedCredits;
    }

    public void submitGrade(double grade, int credits) {
        this.attemptedCredits += credits;
        if (grade >= 1.7) {
            this.passingCredits += credits;
        }
        this.qualityPoints += grade * credits;
    }

    public String getClassStanding() {
        if (passingCredits < 30.0) {
            return "First Year";
        } else if (passingCredits < 60.0) {
            return "Sophomore";
        } else if (passingCredits < 90.0) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public boolean isEligibleForPhiBetaKappa() {
        double gpa = calculateGradePointAverage();
        return (passingCredits >= 98 && gpa >= 3.60) || (passingCredits >= 75 && gpa >= 3.80);
    }

    public double cashOutBearBucks() {
        if (bearBucksBalance >= 10) {
            double refund = bearBucksBalance - 10;
            bearBucksBalance = 0.0;
            return refund;
        }

        bearBucksBalance = 0.0;
        return 0.0;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return Id;
    }

    public double getAttemptedCredits() {
        return attemptedCredits;
    }

    public double getPassingCredits() {
        return passingCredits;
    }

    public void depositBearBucks(double amount) {
        bearBucksBalance += amount;
    }

    public void deductBearBucks(double amount) {
        bearBucksBalance -= amount;
    }

    public double getBearBucksBalance() {
        return bearBucksBalance;
    }

    /**
     * Creates a legacy student whose parents are this student and otherParent. 
     * The child's first name and ID come from the parameter. 
     * If isHyphenated is true, the child's last name is:
     * this parent's last name, a hyphen, and the other parent's last name. 
     * Otherwise, the child uses this parent's last name.
     *
     * Both parents cash out their Bear Bucks accounts. Each cash-out
     * deducts its own $10 administrative fee when the balance exceeds $10;
     * a balance of $10 or less yields no refund. The child receives the sum
     * of the two refunds, and both parents' balances become zero.
     *
     * @param firstName the child's first name
     * @param otherParent the child's other parent
     * @param isHyphenated whether to combine the parents' last names
     * @param id the child's student ID
     * @return the new child student
     */
    public Student createLegacy(String firstName, Student otherParent,
                                boolean isHyphenated, int id) {
        // TODO: complete this practice method.
        return null;
    }

    @Override
    public String toString() {
        return fullName + " " + Id;
    }
}