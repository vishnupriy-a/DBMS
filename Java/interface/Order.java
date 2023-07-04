import java.util.*;

interface Bill {
    void printBil();

}

class Items implements Bill {
    String p_name;
    int qty, product_id;
    double price, total;
    static double net_amt;
    static String order_id, dt;

    Items() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Item Details:..");
        System.out.println("Enter the Item Name: ");
        p_name = sc.nextLine();
        System.out.println("Enter the Product ID: ");
        product_id = sc.nextInt();
        System.out.println("Enter the Quantity: ");
        qty = sc.nextInt();
        System.out.println("Enter the Item Price: ");
        price = sc.nextDouble();
        total = qty * price;
        net_amt += total;

    }

    public void printBil() {
        // System.out.print(" Item Details:..");
        System.out.print( product_id + "            ");
        System.out.print( p_name + "        ");
        System.out.print( qty + "        ");
        System.out.print( price + "            ");
        System.out.print( total + "         \n");
    }
}

class Order {
    public static void main(String a[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Order No: ");
        Items.order_id = sc.nextLine();
        System.out.println("Enter the Date: ");
        Items.dt = sc.nextLine();
        System.out.println("Enter the No of Items: ");
        n = sc.nextInt();
        
        Items[] product = new Items[n];
        for (int i = 0; i < n; i++) {
            product[i] = new Items();
        }
        System.out.println("---------------------------BILL--------------------------------");
        System.out.println("Order No : " + Items.order_id);
        System.out.println("Date     : " + Items.dt);
        System.out.println(" Product Id     Name    Quantity    Unit price      Total");
        for (int i = 0; i < n; i++) {
            product[i].printBil();
        }
        System.out.println("                                   Net Amount: " + Items.net_amt);
    }
}