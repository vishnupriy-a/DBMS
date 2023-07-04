import java.util.Scanner;

public class strmanipul {
    public static void main(String[] args) {
        String str = "hello world come to reality";
        Scanner sc = new Scanner(System.in);
        System.out.println("String:" + str);
        System.out.println("Length:" + str.length());
        System.out.println("Uppercase:" + str.toUpperCase());
        System.out.println("Lowercase:" + str.toLowerCase());
        System.out.print("Enter starting index:");
        int s = sc.nextInt();
        System.out.print("Enter ending index:");
        int e = sc.nextInt();
        System.out.println("Substring:" + str.substring(s, e));
        System.out.print("Enter the search element to be searched in string:");
        String search = sc.nextLine();
        Boolean b = str.contains(search);
        if (b) {
            System.out.println("\"" + search + "\" contain in " + str);
        } else {
            System.out.println("\"" + search + "\" not contain in " + str);
        }
        System.out.print("Enter the string to be replaced:");
        String rep = sc.nextLine();
        System.out.print("Enter the string to replace /'" + rep + "/':");
        String reps = sc.nextLine();
        System.out.println("Replaced string:" + str.replace(rep, reps));
        System.out.print("Enter the delimeter for splitting string:");
        String spl = sc.nextLine();
        String[] split = str.split(spl);
        System.out.print("Split strings:");
        for (String i : split) {
            System.out.print(i + ",");
        }

    }

}
