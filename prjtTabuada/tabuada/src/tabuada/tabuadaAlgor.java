package tabuada;
import java.util.*;
public class tabuadaAlgor {
	public static void main(String args[]) {
		Scanner leia= new Scanner (System.in);
		int i=1;
		double n;
		while(i<=10) {
			System.out.println("Insira o número desejado");
			n=leia.nextDouble();
			n =(n*i)+i;
			i++;
		
		}
	
	}

}
