import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("--> ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            primeNumber(num);
        } else {
            System.err.println("Illegal Argument");
            System.exit(-1);
        }
//        primeNumber(169);
//        primeNumber(113);
//        primeNumber(42);
//        primeNumber(-100);
//        primeNumber(0);
//        primeNumber(1);
    }

    private static void primeNumber(int num) {
        if (num <= 0 || num == 1) {
            System.err.println("Illegal Argument");
            System.exit(-1);
        } else {
            int dividers = 0;
            int steps = 1;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) dividers++;
                if (dividers > 0) break;
                steps++;
            }
            if (dividers > 0) System.out.println(false + " " + steps);
            else System.out.println(true + " " + steps);
        }
    }
}


//According to Böhm-Jacopini theorem, any algorithm can be written using three statements: sequence, selection, and iteration.
//Using these statements in Java, you need to determine if the input number is a prime. A prime is a number which has no dividers other than the number itself and 1.
//The program accepts the number entered from the keyboard as input and displays the result of checking whether that number is a prime.  In addition, the program shall output the number of steps (iterations) required to perform the check. In this task, an iteration is a single comparison operation.
//For negative numbers, 0 and 1, display theIllegalArgument message and shut down the program with the -1 code.
//Example of program operation:
//$ java Program
//-> 169
//   false 12
//
//$ java Program
//-> 113
//   true 10
//
//$ java Program
//-> 42
//   false 1
//
//$ java Program
//-> -100
//   Illegal Argument
