package curso;

import java.util.Scanner;

public class Fatoral1 {
	public static void main(String[] args) {

		/*
		 * Na matem�tica, o fatorial de um n�mero natural n, representado por n!, � o
		 * produto de todos os inteiros positivos menores ou iguais a n. A sequencia (4!
		 * = 4*3*2*1) � uma fatora��o do n�mero 4. Crie um algoritmo que receba um
		 * inteiro n e calcule o resultado da fatora��o de n.
		 */
		Scanner in = new Scanner(System.in);
		int fat = 1;
		int x = in.nextInt();

		if (x >= 0) {
			System.out.print(x + "! = ");

			for (int i = x; i > 0; i--) {

				fat *= i;
				System.out.print(i);

				if (i == 1) {
					System.out.print("=");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(fat);

			in.close();
		}

	}
}
