package curso;

import java.util.Locale;
import java.util.Scanner;

public class Divis�o {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			double x =in.nextDouble();
			double y = in.nextDouble();
						
			if(y !=0 ) {
				double result = x/y;
				
				System.out.println(result);
			}else {
				System.out.println("Divis�o impossivel");
			}
			
		}
		
		
		
		
		
		in.close();
	}

}
