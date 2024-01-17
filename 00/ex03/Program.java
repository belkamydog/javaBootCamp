import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekCounter = 1;
        StringBuilder minimalPoints = new StringBuilder();
        while (weekCounter <= 18) {
            System.out.print("--> ");
            if (scanner.hasNextInt() && scanner.nextInt() == 42) break;
            else {
                String week = scanner.nextLine();
                if (week.equals("Week " + weekCounter)) {
                    System.out.print("-> ");
                    String tmp = scanner.nextLine();
                    minimalPoints.append(getMinPoint(tmp));
                    weekCounter++;
                } else {
                    System.err.println("Illegal Argument");
                    System.exit(-1);
                }
            }
        }
        printStatistic(weekCounter, minimalPoints.toString());
        scanner.close();
    }

    private static void printStatistic(int countWeeks, String points){
        String level = "==========";
        for (int i = 0; i < countWeeks-1; i++){
            int index = points.charAt(i) - 48;
            System.out.printf("Week %d %s>\n", i+1, level.substring(0, index));
        }
    }

    private static String getMinPoint(String str) {
        str = str.replaceAll(" ", "");
        int result = 0;
        try{
            result = minPointInWeek(Integer.parseInt(str));
        } catch (Exception ex){
            System.err.println("Illegal Argument");
            System.exit(-1);
        }
        return String.valueOf(result);
    }

    private static int minPointInWeek(int value) {
        int min = value % 10;
        while (value > 0) {
            if (min > (value % 10)) min = value % 10;
            value /= 10;
        }
        return min;
    }

}


//When developing corporate systems, you often need to collect different kinds of statistics. And the customer always wants such analytics to be illustrative. Who needs cold, dry figures?
//Educational organizations and online schools often belong to this type of customers. Now, you need to implement functionality to visualize students' progress. Customer wants to see a chart showing student's progress changes over several weeks.
//Customer evaluates this progress as a minimal grade for five tests within each week. Each test can be graded between 1 and 9.
//The maximum number of weeks for the analysis is 18. Once the program has obtained information for each week, it displays the graph on the console to show minimum grades for a specific week.
//And we keep assuming that 42 is the input data limit.
//The exact guaranteed number of tests in a week is 5.
//However, the order of weekly data input is not guaranteed, so Week 1's data can be entered after Week 2's data. If data input order is wrong, IllegalArgument message shall be displayed, and the program shall be shut down with -1 code.
//Note:
//
//There are many options for storing information, and arrays are just one of them. Apply another method for storing data about student tests without the use of arrays.
//String concatenation often results in unexpected program behavior. If there are many iterations of a concatenation operation in a cycle for a single variable, an application may slow down significantly. That is why we should not use string concatenation inside a loop to generate a result.
//
//Example of program operation:
//$ java Program
//-> Week 1
//-> 4 5 2 4 2
//-> Week 2
//-> 7 7 7 7 6
//-> Week 3
//-> 4 3 4 9 8
//-> Week 4
//-> 9 9 4 6 7
//-> 42
//Week 1 ==>
//Week 2 ======>
//Week 3 ===>
//Week 4 ====>