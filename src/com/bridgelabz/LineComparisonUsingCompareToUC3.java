package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonUsingCompareToUC3 {
    public static int getLengthOfLine(Scanner scanner) {
        System.out.println("Please enter x1");
        int x1 = scanner.nextInt();

        System.out.println("Please enter y1");
        int y1 = scanner.nextInt();

        System.out.println("Please enter x2");
        int x2 = scanner.nextInt();

        System.out.println("Please enter y2");
        int y2 = scanner.nextInt();

        int val1 = (int) Math.pow((x2 - x1), 2);
        int val2 = (int) Math.pow((y2 - y1), 2);
        int result = (int) Math.sqrt(val1 + val2);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter values for line 1");
        int lenthOfline_1 = getLengthOfLine(scanner);
        System.out.println("Please enter values for line 2");
        int lenthOfline_2 = getLengthOfLine(scanner);
        System.out.println("Length of line 1 : " +lenthOfline_1);
        System.out.println("Length of line 2 : " +lenthOfline_2);

        Integer val1=Integer.valueOf(lenthOfline_1);
        Integer val2=Integer.valueOf(lenthOfline_2);
        int compareVal = val1.compareTo(val2);
        if(compareVal == 0){
            System.out.println("Length of both lines are equal");
        }
        else if(compareVal == 1){
            System.out.println("Length of line 1 is greater than line 2");
        }
        else{
            System.out.println("Length of line 1 is less than line 2");
        }
        scanner.close();
    }
}


