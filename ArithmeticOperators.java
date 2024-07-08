public class ArithmeticOperators {
    public static void main(String[] args){
        int a= 10;
        int b = 5;

        int sum = a + b;   //addition
        int difference = a - b; // Subtraction
        int product = a * b; //Multiplication
        int quotient = a / b; //division
        int remainder = a % b ; //modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Increment and Decrement 

        int x = 5;
        System.out.println(" x: " + x);
        System.out.println("Pre-increment: " + (++x)); // 6
        System.out.println("Post-increment: " + (x++)); // 6
        System.out.println("After post-increment: " + x); // 7

        int y = 5;
        System.out.println(" y: " + y);
        System.out.println("Pre-decrement: " + (--y)); // 4
        System.out.println("Post-decrement: " + (y--)); // 4
        System.out.println("After post-decrement: " + y); // 3
    }
    
}