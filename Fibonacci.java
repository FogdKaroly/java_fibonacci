import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many element do you want to see: ");
        int times = scanner.nextInt();
        scanner.nextLine();

        int prev = 0;
        int actual = 1;
        int sum;

        System.out.println("1. element -> " + prev);
        System.out.println("2. element -> " + actual);

        for (int i = 2; i < times; i++) {
            sum = actual + prev;
            System.out.println((i + 1) + ". element -> " + sum + " ");
            prev = actual;
            actual = sum;
        }
    }
}
