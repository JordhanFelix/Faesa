package pesquisa;
import java.util.Scanner;
public class PesquisaSequencial {
	public static void main(String[] args) {
		int [] vet = {23, 4, 33, 45, 19, 12, 28, 40};
		   Scanner insere = new Scanner(System.in);
		 System.out.print("digite um n�mero");
		 int x  = insere.nextInt();   
		  int i = 0;
		 while((i < vet.length) && (x != vet[i])){
		 	  i++;
		 }       
		 if (i == vet.length){
		   System.out.println("n�o achou");
		 }else{
		   System.out.println("achou e est� na posi��o " +i);
		 }
	}
}
