public class FactorialNumber {
    
    // Factorial calculation
    static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }

    public static void main(String[] args) {
        // keep changing the value if you need
        int number = 5;

        
        long result = calculateFactorial(number);

        
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

    
