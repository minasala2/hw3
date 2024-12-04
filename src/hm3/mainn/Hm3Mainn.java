package hm3.mainn;

import java.util.Scanner;

public class Hm3Mainn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        realestate agency = new realestate();

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Add Villa");
            System.out.println("2. Add Apartment");
            System.out.println("3. Add Furnished Apartment");
            System.out.println("4. Display Properties");
            System.out.println("5. Remove Property");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    agency.addProperty(villa.inputVilla(scanner));
                    break;
                case 2:
                    agency.addProperty(apartement.inputApartment(scanner));
                    break;
                case 3:
                    agency.addProperty(furnishedApartment.inputFurnishedApartment(scanner));
                    break;
                case 4:
                    agency.displayProperties();
                    break;
                case 5:
                    System.out.println("Enter the index of the property to remove (starting from 0): ");
                    int index = scanner.nextInt();
                    agency.removeproperty(index);
                    break;
                case 6:
                    System.out.println("Exited ");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

