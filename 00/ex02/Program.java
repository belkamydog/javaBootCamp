import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int countRequests = 0;
        while (input != 42){
            System.out.print("--> ");
            input = scanner.nextInt();
            if (isPrimeNumber(sumOfDigits(input))) countRequests++;
        }
        System.out.printf("Count of coffee-request – %d", countRequests);
        scanner.close();
    }

    private static int sumOfDigits(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }

    private static boolean isPrimeNumber(int num) {
        boolean result = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}

//Today, you are Google.
//        You need to count queries related to coffee preparation which our search system users make at a certain moment. It is clear that the sequence of search queries is infinite. It is impossible to store these queries and count them later.
//        But there is a solution—process the flow of queries. Why should we waste our resources for all queries if we are only interested in a specific feature of this query sequence?  Let's assume that each query is any natural number other than 0 and 1. A query is related to coffee preparation only if the sum of digits of the number (query) is a prime number.
//        So, we need to implement a program that will count the number of elements for a specified set of numbers whose sum of digits is a prime number.
//        To keep it simple, let's assume that this potentially infinite sequence of queries is still limited, and the last sequence element is number 42.
//        This task guarantees that input data is absolutely correct.
//        Example of program operation:
//        $ java Program
//        -> 198131
//        -> 12901212
//        -> 11122
//        -> 42
//        Count of coffee-request – 2
