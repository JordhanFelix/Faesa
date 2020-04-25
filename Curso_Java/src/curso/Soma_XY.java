package curso;

import java.util.Locale;
import java.util.Scanner;

public class Soma_XY {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		/*
		 * Fa�a um programa que receba dois n�meros X e Y, sendo X < Y. Calcule e
		 * mostre: � a soma dos n�meros pares desse intervalo de n�meros, incluindo os
		 * n�meros digitados � a multiplica��o dos n�meros �mpares desse intervalo,
		 * incluindo os digitados
		 **/
		double x = in.nextDouble();
		double y = in.nextDouble();
		double soma = 0;
		double mult = 1;

		if (x < y) {
			while (x <= y) {

				if (x % 2 == 0) {

					soma += x;

				}else {
					mult *= x;
				}
				
				x++;
			}
			
			System.out.printf("Soma : %.1f%n", soma);
			System.out.printf("Multiplica��o: %.1f%n", mult);
		}else{
			System.out.println("X n�o � menor que Y.");
		}	
		
		in.close();
	}

}
