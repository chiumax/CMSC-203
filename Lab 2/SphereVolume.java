import java.util.*;

public class SphereVolume {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program prints the volume of a sphere given the diameter");
		System.out.println("Diameter: ");
		double diameter = in.nextDouble();
		double radius = diameter / 2;
		double volume = Math.PI * Math.pow(radius, 3) * 4 / 3;

		System.out.println("The volume is " + volume + " units cubed");
		System.out.println("Goodbye");
	}
}
