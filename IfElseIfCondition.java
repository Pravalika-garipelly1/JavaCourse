public class IfElseIfCondition {
    public static void main(String[] args) {
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Merit");
        } else if (marks >= 80) {
            System.out.println("Outstanding");
        } else if (marks >= 70) {
            System.out.println("Above Average");
        } else {
            System.out.println("Average");
        }
    }
}
