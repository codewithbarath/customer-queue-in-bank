import java.util.*;

class BankQueue {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Quit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();  

            switch (ch) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String cname = sc.nextLine();
                    q.add(cname);
                    System.out.println("Customer added.");
                    break;

                case 2:
                    if (q.isEmpty()) {
                        System.out.println("No customers available.");
                    } else {
                        String s = q.poll();
                        System.out.println("Serving: " + s);
                    }
                    break;

                case 3:
                    if (q.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Customers in queue: " + q);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
