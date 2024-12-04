package hm3.mainn;

import java.util.Scanner;

public class apartement extends property {
    private int floor;
    private int parking;

    public apartement(int floor, int parking, double area, int rooms, String neighborhood, double price) {
        super(area, rooms, neighborhood, price);
        this.floor = floor;
        this.parking = parking;
    }

    public int getFloor() {
        return floor;
    }

    public int getParking() {
        return parking;
    }

    public static apartement inputApartment(Scanner scanner) {
        property baseProperty = property.inputProperty(scanner);
        System.out.print("Enter floor: ");
        int floor = scanner.nextInt();
        System.out.print("Has parking (1 for yes, 0 for no): ");
        int parking = scanner.nextInt();
        return new apartement(floor, parking, baseProperty.getArea(), baseProperty.getRooms(), baseProperty.getNeighborhood(), baseProperty.getPrice());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Floor: " + floor);
        System.out.println("Parking: " + parking);
    }
}

