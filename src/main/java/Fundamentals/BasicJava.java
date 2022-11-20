package Fundamentals;

public class BasicJava {

    //Method that prints all the odd numbers from 1 to 255.
    public static void printOddSum() {
        for (int i = 1; i <= 255; i+= 2) {
            System.out.println(i);
        }
    }

    //Method that prints the numbers from 0 to 255
    static void print1To255() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.format("New number: %s Sum: %s\n", i, sum);
        }
    }
    public static void main(String[] args) {
        printOddSum();
        print1To255();
    }
}