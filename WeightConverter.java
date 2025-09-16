import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double kg = scanner.nextDouble();

        double pounds = kg * 2.20462;

        System.out.println(kg + " kilograms = " + pounds + " pounds");

        scanner.close();
    }
}
