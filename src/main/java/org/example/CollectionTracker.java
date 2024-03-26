package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionTracker {
    private ArrayList<String> collection;

    public CollectionTracker() {
        collection = new ArrayList<>();
    }

    public void addItem(String item) {
        collection.add(item);
        System.out.println("Item added: " + item);
    }

    public void removeItem(String item) {
        if (collection.remove(item)) {
            System.out.println("Item removed: " + item);
        } else {
            System.out.println("Item not found: " + item);
        }
    }

    public void displayCollection() {
        System.out.println("Item list:");
        for (String item : collection) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        CollectionTracker tracker = new CollectionTracker();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Shop now");
            System.out.println("4. End");

            System.out.print("Select an action: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter an item to add: ");
                    String newItem = scanner.nextLine();
                    tracker.addItem(newItem);
                    break;
                case "2":
                    System.out.print("Specify the item to remove: ");
                    String removeItem = scanner.nextLine();
                    tracker.removeItem(removeItem);
                    break;
                case "3":
                    tracker.displayCollection();
                    break;
                case "4":
                    System.out.println("End of program.");
                    break;
                default:
                    System.out.println("Invalid choice. Select again.");
                    break;
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}