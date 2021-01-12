package application;

import java.util.Scanner;

import entities.Room;

public class Main {

	public static void main(String[] args) {
		
		String name, email;
		int room;
		Scanner sc = new Scanner(System.in);
		int numberOfRooms;
		Room[] vect = new Room[10];
		
		System.out.print("How many rooms will be rented: ");
		numberOfRooms = sc.nextInt();
		
		for(int i = 1; i <= numberOfRooms; i++) {
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			vect[room] = new Room(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for(int j = 0; j < 10; j++) {
			if (vect[j] != null) {
				System.out.println(j + ": " + vect[j]);
			}
		}
		sc.close();

	}

}
