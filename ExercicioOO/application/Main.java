package application;

import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();

		System.out.print("Enter the rectangle height and width: ");

		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();

		sc.close();

		System.out.println("AREA : " + rectangle.area());
		System.out.println("PERMIMETER : " + rectangle.perimeter());
		System.out.printf("DIAGONAL : %.1f%n", rectangle.diagonal());
	}

}
