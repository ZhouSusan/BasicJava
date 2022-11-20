package Fundamentals;

import java.util.ArrayList;
import java.util.List;

public class BasicJava {

    //Method that prints all the odd numbers from 1 to 255.
    public static void printOdd1To255() {
        for (int i = 1; i <= 255; i+= 2) {
            System.out.println(i);
        }
    }

    //Method that prints the numbers from 0 to 255
    static void print1To255() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println(i);
        }
    }

    static void printSum() {
        int total = 0;
        for (int i = 0; i < 256; i++) {
            total += i;
            System.out.format("New number: %s Sum: %s\n", i, total);
        }
    }

    //Method that would iterate through each member of the array
    static void iterateOverArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //Method that takes any array and prints the maximum value in the array

    static double findMax(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }

        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    static void getAverage(int[] arr) {
        if (arr.length <= 1) {
             System.out.println("The average is 0");
        }

        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg = avg/ arr.length;
        System.out.format("The average is %s", avg);
    }

    static ArrayList<Integer> arrayOfOddNumbers() {
        ArrayList<Integer> resultArr = new ArrayList<Integer>();
        for (int i = 1; i < 256; i++) {
            resultArr.add(i);
        }

        return resultArr;
    }

    static int greaterThankY(int[] arr, int value) {

        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= value) {
                count++;
            }
        }
        return count;
    }

    static ArrayList<Integer> squareValues(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * list.get(i));
        }
        return list;
    }

    static ArrayList<Integer> eliminateNegativeNumbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.set(i, 0);
            }
        }

        return list;
    }

    public static void main(String[] args) {
//        printOdd1To255();
//        print1To255();
//        printSum();
//
        int[] arrayTestCaseOne = {1, 3, 5, 7, 9, 13};
//        iterateOverArray(arrayTestCaseOne);

        int[] arrayTestCaseTwo = {-3, -1, -5, -7};
        int[] arrayTestCaseThree = {2, 6, 3, -2, -5, 0, 6, -2, 0};
//        System.out.println(findMax(arrayTestCaseOne));
//        System.out.println(findMax(arrayTestCaseTwo));
//        System.out.println(findMax(arrayTestCaseThree));

        int[] arrayTestCaseFour = {2, 10, 3};
//        getAverage(arrayTestCaseFour);

//        System.out.format("Array with Odd Numbers: %s", arrayOfOddNumbers());

        int[] arrayTestCaseFive = {1, 3, 5, 7};
        System.out.format("Result of Greater Than Y is %s", greaterThankY(arrayTestCaseFive, 4));

        ArrayList<Integer> arrayListTC1 = new ArrayList<Integer>();
        arrayListTC1.add(1);
        arrayListTC1.add(5);
        arrayListTC1.add(10);
        arrayListTC1.add(-2);

        System.out.format("\nSquare the values : %s", squareValues(arrayListTC1));

        ArrayList<Integer> arrayListTC2 = new ArrayList<Integer>();
        arrayListTC2.add(6);
        arrayListTC2.add(-4);
        arrayListTC2.add(-8);
        arrayListTC2.add(1);
        arrayListTC2.add(-90);

        System.out.format("\nEliminate Negative Numbers: %s", eliminateNegativeNumbers(arrayListTC2));
    }
}