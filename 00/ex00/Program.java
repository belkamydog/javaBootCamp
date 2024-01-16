public class Program {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(479598));
    }

    private static int sumOfDigits(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }

}


//Java is a strictly typed programming language. Fundamental data types (boolean, character, integer, floating point number) are represented in Java by eight primitive types: boolean, char, byte, short, int, long, float, double.
//Work with integer type.
//Calculate the sum of digits of a six-digit int number (the number value is set directly in the code by explicitly initializating the number variable).
//Example of the program operation for number 479598:
//$ java Program
//  42