import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        

        System.out.print("Enter the size of the array: ");

        int size = input.nextInt();

        

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {

            arr[i] = input.nextInt();

        }

        

        // Bubble Sort Algorithm

        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;

                }

            }

        }

        

        // Print the sorted array

        System.out.print("Sorted Array: ");

        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");

        }

    }

}