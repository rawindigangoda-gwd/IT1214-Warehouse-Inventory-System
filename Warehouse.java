import java.util.Scanner;

public class Warehouse {
    private static Inventory inventory = new Inventory();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Warehouse Inventory System ---");
            System.out.println("1. Add Item\n2. Remove Item\n3. Update Stock\n4. Search Item\n5. View All\n6. Exit");
            System.out.print("Choice: ");
            
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> addItem();
                    case 2 -> removeItem();
                    case 3 -> updateStock();
                    case 4 -> searchItem();
                    case 5 -> inventory.displayAll();
                    case 6 -> System.exit(0);
                    default -> System.out.println("Invalid choice!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static void addItem() {
        System.out.print("Enter ID: "); String id = scanner.nextLine();
        System.out.print("Enter Name: "); String name = scanner.nextLine();
        System.out.print("Enter Qty: "); int qty = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Price: "); double price = Double.parseDouble(scanner.nextLine());
        inventory.addItem(new Item(id, name, qty, price));
    }

    private static void removeItem() {
        System.out.print("Enter ID to remove: ");
        String id = scanner.nextLine();
        if (inventory.removeItem(id)) System.out.println("Removed.");
        else System.out.println("Not found.");
    }

    private static void updateStock() {
        System.out.print("Enter ID: "); String id = scanner.nextLine();
        System.out.print("Enter New Qty: "); int qty = Integer.parseInt(scanner.nextLine());
        if (inventory.updateQuantity(id, qty)) System.out.println("Updated.");
        else System.out.println("Not found.");
    }

    private static void searchItem() {
        System.out.print("Search by (1) ID or (2) Name: ");
        int type = Integer.parseInt(scanner.nextLine());
        Item found = null;
        if (type == 1) {
            System.out.print("Enter ID: ");
            found = inventory.searchById(scanner.nextLine());
        } else {
            System.out.print("Enter Name: ");
            found = inventory.searchByName(scanner.nextLine());
        }
        System.out.println(found != null ? found : "Item not found.");
    }
}