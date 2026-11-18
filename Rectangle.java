import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double length, width, area, perimeter;

        System.out.print("Enter the length: ");
        length = input.nextDouble();

        System.out.print("Enter the width: ");
        width = input.nextDouble();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);

        input.close();
    }
}