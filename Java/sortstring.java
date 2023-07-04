import java.util.Scanner;

public class sortstring {
    public static void main(String[] args) {
        String t;
        System.out.print("Enter the no of strings:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strarr = new String[n + 1];
        System.out.println("Enter strings:");
        for (int i = 0; i <= n; ++i) {
            strarr[i] = sc.nextLine();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (strarr[j].compareTo(strarr[j + 1]) > 0) {
                    t = strarr[j];
                    strarr[j] = strarr[j + 1];
                    strarr[j + 1] = t;
                }
            }
        }
        System.out.print("Strings after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(strarr[i] + "\t");
        }

    }
}
