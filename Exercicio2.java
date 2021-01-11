import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final double pi = 3.14159;
		double raio, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Raio da circunferência: ");
		
		raio = sc.nextDouble();
		
		sc.close();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n", area);

	}

}
