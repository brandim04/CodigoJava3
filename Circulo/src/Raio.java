import java.util.Scanner;

public class Raio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio do círculo: ");
		double r = sc.nextDouble();
		
		double pi =  3.14159;
		double area = pi * r * r;
		
		System.out.printf("A área do círculo é: %.4f\n", area);
		
		sc.close();
		
				
 }
}