package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class ComputerPart {
    private String name;
    private int stock;
    private int sales;

    public ComputerPart(String name, int stock) {
        this.name = name;
        this.stock = stock;
        this.sales = 0;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getSales() {
        return sales;
    }

    public void updateStock(int amount) {
        this.stock += amount;
    }

    public void recordSale(int amount) {
        if (amount <= stock) {
            this.sales += amount;
            this.stock -= amount;
        } else {
            System.out.println("Not enough stock to complete the sale.");
        }
    }

 public String toString() {
        return "Part: " + name + ", Stock: " + stock + ", Sales: " + sales;
    }
}

class Inventory {
    private ArrayList<ComputerPart> parts;

    public Inventory() {
        parts = new ArrayList<>();
    }

    public void addPart(ComputerPart part) {
        parts.add(part);
    }

    public void updateStock(String name, int amount) {
        for (ComputerPart part : parts) {
            if (part.getName().equalsIgnoreCase(name)) {
                part.updateStock(amount);
                return;
            }
        }
        System.out.println("Part not found.");
    }

    public void recordSale(String name, int amount) {
        for (ComputerPart part : parts) {
            if (part.getName().equalsIgnoreCase(name)) {
                part.recordSale(amount);
                return;
            }
        }
        System.out.println("Part not found.");
    }

    public void displayInventorySortedBySales() {
        Collections.sort(parts, Comparator.comparingInt(ComputerPart::getSales).reversed());
        for (ComputerPart part : parts) {
            System.out.println(part);
        }
    }
}
