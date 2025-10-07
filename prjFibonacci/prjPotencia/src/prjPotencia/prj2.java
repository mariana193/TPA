package prjPotencia;
import java.util.*;
public class prj2 {
	public static void main(String args[]) {
		Scanner leia = new Scanner (System.in);
		int i=1;
		double b,e,pot;
		System.out.println("Digite a base do número");
		b= leia.nextDouble();
		System.out.println("Digite o expoente do número");
		e= leia.nextDouble();
		pot=1;

		do {			
			pot=pot*b;
			i=i+1;
		}while(i<=e);
		System.out.println("A potência é "+pot);
		i++;
	}

}
