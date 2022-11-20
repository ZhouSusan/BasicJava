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

    
    public static void main(String[] args) {
        printOdd1To255();
        print1To255();
    }
}