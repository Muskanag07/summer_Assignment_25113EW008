import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = input.nextInt();
        calculateNaturalNumberSum(n);
        input.close();
    }

    static void calculateNaturalNumberSum(int limit) {
        int totalSum = 0;
        for (int i = 1; i <= limit; i++) {
            totalSum += i;
        }
        System.out.println("The sum of the first " + limit + " natural numbers is: " + totalSum);
    }
}
