package hm3.mainn;

import java.util.Scanner;

public class furnishedApartment extends apartement {
    private final int furnitureQuality;

    public furnishedApartment(int furnitureQuality, int floor, int parking, double area, int rooms, String neighborhood, double price) {
        super(floor, parking, area, rooms, neighborhood, price);
        this.furnitureQuality = furnitureQuality;
    }

    public int getFurnitureQuality() {
        return furnitureQuality;
    }

    public static furnishedApartment inputFurnishedApartment(Scanner scanner) {
        apartement baseApartment = apartement.inputApartment(scanner);
        System.out.print("Enter furniture quality (1-5): ");
        int furnitureQuality = scanner.nextInt();
        return new furnishedApartment(furnitureQuality, baseApartment.getFloor(), baseApartment.getParking(), baseApartment.getArea(), baseApartment.getRooms(), baseApartment.getNeighborhood(), baseApartment.getPrice());
    }

    @Override
    public void display() {
        super.display();
        String qualityDescription;
        switch (furnitureQuality) {
            case 1:
                qualityDescription = "Very Bad";
                break;
            case 2:
                qualityDescription = "Bad";
                break;
            case 3:
                qualityDescription = "Good";
                break;
            case 4:
                qualityDescription = "Very Good";
                break;
            case 5:
                qualityDescription = "Excellent";
                break;
            default:
                qualityDescription = "Unknown";
        }
        System.out.println("Furniture Quality: " + furnitureQuality + " (" + qualityDescription + ")");
    }
}
