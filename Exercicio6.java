import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double a, b, c, aTriangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo;
		final double pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os três valores: ");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		
		sc.close();
		
		aTriangulo = a*c/2;
		aCirculo = pi * Math.pow(c, 2);
		aTrapezio = (a+b)*c/2;
		aQuadrado = Math.pow(b, 2);
		aRetangulo = a*b;
		
		System.out.printf("TRIANGULO : %.3f%n", aTriangulo);
		System.out.printf("CIRCULO : %.3f%n", aCirculo);
		System.out.printf("TRAPZEIO : %.3f%n", aTrapezio);
		System.out.printf("QUADRADO : %.3f%n", aQuadrado);
		System.out.printf("RETANGULO : %.3f%n", aRetangulo);
		
	}

}
