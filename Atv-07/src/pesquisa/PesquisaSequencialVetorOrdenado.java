package pesquisa;

import java.util.Scanner;

public class PesquisaSequencialVetorOrdenado {

	public static void main(String[] args) {
		int [] vet = {2,6,9,10,11,20,26,30};
		Scanner insere = new Scanner(System.in);
		System.out.print("digite um n�mero");
		int x  = insere.nextInt();   
		int i = 0;
		while((i < vet.length) && (x < vet[i])){
			i++;
		}       
		if (i == vet.length || x > vet[i]){
			System.out.println("n�o achou");
		}else{
			System.out.println("achou e est� na posi��o " +i);
		}

	}

}
