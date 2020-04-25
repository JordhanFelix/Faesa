package curso;

public class ProgreAritmetica {

	public static void main(String[] args) {
		/**
		 * Progress�o Aritm�tica (P.A) � uma sequ�ncia num�rica em que cada termo, a
		 * partir do segundo, � igual a soma do termo anterior com uma constante. A
		 * sequ�ncia (1, 4, 7, 10, 13, 16) � uma P.A. Crie um algoritmo capaz de gerar
		 * um progress�o aritm�tica de 1 at� 100 com contante 6.
		 */

		int pa = 6;
		int resultado =1 ;
	
		while (resultado <=100) {
		
			System.out.println(resultado + ", ");
			
			resultado += pa;
		}

	}

}
