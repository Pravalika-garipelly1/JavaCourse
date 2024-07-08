public class LogicalOperators {
    public static void main(String [] args){
        boolean a = true;
        boolean b = false;
        
        // Logical AND
        System.out.println("a && b: " + (a && b));  // false
        
        // Logical OR
        System.out.println("a || b: " + (a || b));  // true
        
        // Logical NOT
        System.out.println("!a: " + (!a));  // false
        System.out.println("!b: " + (!b));  // true
        
        // Logical XOR
        System.out.println("a ^ b: " + (a ^ b));  // true

        // Complex logical expressions
        boolean c = true;
        boolean d = false;
        boolean complexResult = (a && b) || (c && !d);
        System.out.println("(a && b) || (c && !d): " + complexResult); //true 
    }
    
}
