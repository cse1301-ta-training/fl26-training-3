public class Assignment7Practice {
    public static void main(String[] args) {
        Student firstParent = new Student("Alex", "Chen", 101);
        Student otherParent = new Student("Sam", "Rivera", 102);
        firstParent.depositBearBucks(42.0);
        otherParent.depositBearBucks(24.0);
        Student child = firstParent.createLegacy("Jamie", otherParent, true, 103);

        check("child's name", "Jamie Chen-Rivera".equals(child.getFullName()));
        check("child's ID", child.getId() == 103);
        check("child's Bear Bucks", child.getBearBucksBalance() == 46.0);
        check("first parent's balance", firstParent.getBearBucksBalance() == 0.0);
        check("other parent's balance", otherParent.getBearBucksBalance() == 0.0);
    }

    private static void check(String description, boolean passed) {
        System.out.println((passed ? "PASS: " : "FAIL: ") + description);
    }
}
