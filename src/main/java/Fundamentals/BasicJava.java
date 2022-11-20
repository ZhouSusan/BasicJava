package Fundamentals;

public class BasicJava {
    public static void printOddSum() {
        for (int i = 1; i <= 255; i+= 2) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printOddSum();
    }
}