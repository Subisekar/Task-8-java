import java.util.Scanner;
public class Swapvalues {
    


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            float first = scanner.nextFloat();

            System.out.print("Enter the second number: ");
            float second = scanner.nextFloat();

            System.out.println("--Before swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);

            // Swap using a temporary variable
            float temporary = first;
            first = second;
            second = temporary;

            System.out.println("--After swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
        }
    }
}

    

