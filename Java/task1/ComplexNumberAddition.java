import java.util.Scanner;

public class ComplexNumberAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double real1, real2, imaginary1, imaginary2;

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        real1 = input.nextDouble();
        imaginary1 = input.nextDouble();

        System.out.println("Enter the real and imaginary parts of the second complex number:");
        real2 = input.nextDouble();
        imaginary2 = input.nextDouble();

        double realResult = real1 + real2;
        double imaginaryResult = imaginary1 + imaginary2;

        System.out.println("The sum of the two complex numbers is " + realResult + " + " + imaginaryResult + "i");
    }
}