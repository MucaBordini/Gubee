import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a, b, c, d, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os quatro valores: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		sc.close();
		
		resultado = (a*b)-(c*d);
		
		
		System.out.println("DIFERENÇA: " + resultado);
		

	}

}
