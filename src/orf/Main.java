package orf;

public class Main {
  public static void main(String[] args) {
    // Variables
    double area;
    double perimeter;
    double width = 8.9;
    double height = 3.2;

    // Computing the area and perimeter
    area = width * height;
    perimeter = 2 * (width + height);
    // Round the results to two decimals to avoid overly long values.
    area = area * 100;
    area = (int)area;
    area = area / 100.0;
    // Or using a compact form
    perimeter = (int)(perimeter * 100) / 100.0;

    // Printing the given data and results into the console
    System.out.println("Perimeter and area of a rectangle with the following attributes:");
    System.out.println("  Width:  " + width);
    System.out.println("  Height: " + height);

    System.out.println("\n====== Results ======");
    System.out.println("Perimeter: " + perimeter);
    System.out.println("Area:      " + area);
  }
}
