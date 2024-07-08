public class NestedIfCondition {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You cannot drive without a license.");
            }
        } else {
            System.out.println("You are not old enough to drive.");
        }
    }
}
