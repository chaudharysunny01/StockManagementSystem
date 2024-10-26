import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockManagementSystem {
    private List<StockItem> stockItems;
    private Scanner scanner;

    public StockManagementSystem() {
        stockItems = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Stock Management System");
            System.out.println("1. Add Stock Item");
            System.out.println("2. Remove Stock Item");
            System.out.println("3. Update Stock Quantity");
            System.out.println("4. View Stock Levels");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStockItem();
                    break;
                case 2:
                    removeStockItem();
                    break;
                case 3:
                    updateStockQuantity();
                    break;
                case 4:
                    viewStockLevels();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addStockItem() {
        System.out.print("Enter stock item name: ");
        String name = scanner.next();
        System.out.print("Enter initial quantity: ");
        int quantity = scanner.nextInt();
        StockItem stockItem = new StockItem(name, quantity);
        stockItems.add(stockItem);
        System.out.println("Stock item added successfully!");
    }

    private void removeStockItem() {
        System.out.print("Enter stock item name: ");
        String name = scanner.next();
        for (StockItem stockItem : stockItems) {
            if (stockItem.getName().equals(name)) {
                stockItems.remove(stockItem);
                System.out.println("Stock item removed successfully!");
                return;
            }
        }
        System.out.println("Stock item not found.");
    }

    private void updateStockQuantity() {
        System.out.print("Enter stock item name: ");
        String name = scanner.next();
        System.out.print("Enter new quantity: ");
        int quantity = scanner.nextInt();
        for (StockItem stockItem : stockItems) {
            if (stockItem.getName().equals(name)) {
                stockItem.setQuantity(quantity);
                System.out.println("Stock quantity updated successfully!");
                return;
            }
        }
        System.out.println("Stock item not found.");
    }

    private void viewStockLevels() {
        System.out.println("Stock Levels:");
        for (StockItem stockItem : stockItems) {
            System.out.println(stockItem.getName() + ": " + stockItem.getQuantity());
        }
    }

    public static void main(String[] args) {
        StockManagementSystem system = new StockManagementSystem();
        system.run();
    }
}

class StockItem {
    private String name;
    private int quantity;

    public StockItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
