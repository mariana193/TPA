package prjFibonacci;
import java.util.*;
public class prj3 {
	public static void main(String args []) {
		Scanner leia = new Scanner (System.in);
		int i=1;
		double n,pen,ordem;
		do {
			System.out.println("Digite o número de termos");
			n= leia.nextDouble();
			pen= n-1;
			ordem= pen+ n;
			i++;
		}while(i<n);
		
		System.out.println("A sua ordem é "+ordem);
	}

}
