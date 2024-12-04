package hm3.mainn;

import java.util.Scanner;

public class villa extends property {
    private boolean sPool;
    private int aStreet;

    public villa(boolean sPool, int aStreet, double area, int rooms, String neighborhood, double price) {
        super(area, rooms, neighborhood, price);
        this.sPool = sPool;
        this.aStreet = aStreet;
    }

    public boolean isHasPool() {
        return sPool;
    }

    public int getAdjacentStreets() {
        return aStreet;
    }

    public static villa inputVilla(Scanner scanner) {
        property baseProperty = property.inputProperty(scanner);
        System.out.print("Has swimming pool (true/false): ");
        boolean hasPool = scanner.nextBoolean();
        System.out.print("Enter number of adjacent streets: ");
        int adjacentStreets = scanner.nextInt();
        return new villa(hasPool, adjacentStreets, baseProperty.getArea(), baseProperty.getRooms(), baseProperty.getNeighborhood(), baseProperty.getPrice());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Swimming Pool: " + (sPool ? "Yes" : "No"));
        System.out.println("Adjacent Streets: " + aStreet);
    }
}
