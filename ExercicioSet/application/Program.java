package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();
		
		int numberOfStudents, idStudent;
		
		System.out.print("How many students for course A? ");
		numberOfStudents = sc.nextInt();
		
		for(int i = 0; i < numberOfStudents; i++) {
			idStudent = sc.nextInt();
			set.add(new Student(idStudent));
		}
		
		System.out.print("How many students for course B? ");
		numberOfStudents = sc.nextInt();
		
		for(int i = 0; i < numberOfStudents; i++) {
			idStudent = sc.nextInt();
			set.add(new Student(idStudent));
		}
		
		System.out.print("How many students for course C? ");
		numberOfStudents = sc.nextInt();
		
		for(int i = 0; i < numberOfStudents; i++) {
			idStudent = sc.nextInt();
			set.add(new Student(idStudent));
		}
		
		sc.close();
		
		System.out.print("Total students: " + set.size());
		
		
	}

}
