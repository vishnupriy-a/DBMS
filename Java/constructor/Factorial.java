import java.util.Scanner;

public class Factorial {
    private int num;
    private long factorial;

    public Factorial(int num) {
        this.num = num;
        factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
    }

    public void displayFactorial() {
        System.out.println("Factorial of " + num + " is " + factorial);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = input.nextInt();

        Factorial fact = new Factorial(num);
        fact.displayFactorial();
    }
}
