import java.util.Scanner;

public class AboveAverage {
    public static void aboveAverage() {
        Scanner scanner = new Scanner(System.in);
        int inputNumbers[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("enter the " + (i + 1) + " number");
            inputNumbers[i] = scanner.nextInt();
        }
        double sum = 0;
        for (int a = 0; a < inputNumbers.length; a++) {
            sum = sum + inputNumbers[a];
        }
        double average = sum / inputNumbers.length;
        int currentValue = 0;
        for (int x = 0; x < inputNumbers.length; x++) {
            currentValue = inputNumbers[x];
            if (currentValue > average) {
                System.out.println(currentValue);
            }
        }
    }
    public static void main(String[] args) {
        aboveAverage();
    }
}
