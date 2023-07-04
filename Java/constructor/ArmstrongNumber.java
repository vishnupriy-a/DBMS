import java.util.Scanner;

public class ArmstrongNumber {
    int num;

    public ArmstrongNumber(int num) {
        this.num = num;
    }

    public boolean isArmstrong() {
        int temp = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return num == sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        ArmstrongNumber armstrongNumber = new ArmstrongNumber(num);
        if (armstrongNumber.isArmstrong()) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
