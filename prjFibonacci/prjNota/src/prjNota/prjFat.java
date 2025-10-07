package prjNota;
import java.util.*;
public class prjFat {
	public static void main(String args []) {
		Scanner leia = new Scanner (System.in);
		double n,fat,f;
		System.out.println("Entre com o número desejado");
		n= leia.nextDouble();
		int i=1; 
		fat=1;
		
		do{
			fat = fat*i;
			i = i+1;
			System.out.println("O fatorial é " +fat);
			}
			while(i<=n);
					
		
		
		
	}

}
