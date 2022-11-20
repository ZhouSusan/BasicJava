package Fundamentals;

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

    public static void main(String[] args) {
//        printOdd1To255();
//        print1To255();
//        printSum();
//
        int[] arrayTestCaseOne = {1, 3, 5, 7, 9, 13};
//        iterateOverArray(arrayTestCaseOne);

        int[] arrayTestCaseTwo = {-3, -1, -5, -7};
        int[] arrayTestCaseThree = {2, 6, 3, -2, -5, 0, 6, -2, 0};
        System.out.println(findMax(arrayTestCaseOne));
        System.out.println(findMax(arrayTestCaseTwo));
        System.out.println(findMax(arrayTestCaseThree));
    }
}