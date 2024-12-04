package hm3.mainn;

import java.util.Scanner;

public class property {
    private double area;
    private int rooms;
    private String neighborhood;
    private double price;

    public property(double area, int rooms, String neighborhood, double price) {
        this.area = area;
        this.rooms = rooms;
        this.neighborhood = neighborhood;
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public int getRooms() {
        return rooms;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public double getPrice() {
        return price;
    }

    public static property inputProperty(Scanner scanner) {
        System.out.print("Enter area: ");
        double area = scanner.nextDouble();
        System.out.print("Enter number of rooms: ");
        int rooms = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter neighborhood: ");
        String neighborhood = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        return new property(area, rooms, neighborhood, price);
    }

    public void display() {
        System.out.println("Area: " + area + " m2");
        System.out.println("Rooms: " + rooms);
        System.out.println("Neighborhood: " + neighborhood);
        System.out.println("Price: " + price);
    }
}
