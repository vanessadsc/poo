package exercicio1;

import java.util.*;

public class Exercicio1 {

	public Exercicio1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		int a,b,c;
		double d;
		double e[];
		e = new double[10];

		Scanner sc = new Scanner(System.in);

		try {
		
		System.out.print("Valor de a: ");
		a = sc.nextInt();
		System.out.print("Valor de b: ");
		b = sc.nextInt();
		c = a / b;
		d = e[a];
		}
		catch(InputMismatchException e1) {
			System.out.println("Erro: tipo invalido!");
			System.out.println("Mensagem original: " + e1.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Erro: Indice invalido!");
			System.out.println("Mensagem original: " + e2.getMessage());
		}
		catch(ArithmeticException e3) {
			System.out.println("Erro: Divisao por zero!");
			System.out.println("Mensagem original: " + e3.getMessage());
		}
	}

}
