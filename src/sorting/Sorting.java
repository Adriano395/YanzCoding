package sorting;

import java.util.Scanner;

public class Sorting {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Computer Part");
            System.out.println("2. Update Stock");
            System.out.println("3. Record Sale");
            System.out.println("4. Display Inventory Sorted by Sales");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter part name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial stock: ");
                    int stock = scanner.nextInt();
                    inventory.addPart(new ComputerPart(name, stock));
                    break;

                case 2:
                    System.out.print("Enter part name to update stock: ");
                    String partNameToUpdate = scanner.nextLine();
                    System.out.print("Enter amount to add (use negative for removal): ");
                    int amountToUpdate = scanner.nextInt();
                    inventory.updateStock(partNameToUpdate, amountToUpdate);
                    break;

                case 3:
                    System.out.print("Enter part name to record sale: ");
                    String partNameToSell = scanner.nextLine();
                    System.out.print("Enter amount sold: ");
                    int amountToSell = scanner.nextInt();
                    inventory.recordSale(partNameToSell, amountToSell);
                    break;

                case 4:
                    inventory.displayInventorySortedBySales();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
