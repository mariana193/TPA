package prjAula11;
import java.util.*;
public class exerc1 {
	public static void main (String args []) {
		Scanner leia = new Scanner (System.in);
		int i=1;
		int anoComec, anoFim,qntd;
		qntd=0;
		System.out.println("Insira o ano inicial");
		anoComec = leia.nextInt();
		System.out.println("Insira o ano final");
		anoFim = leia.nextInt();
		System.out.println("Anos bissextos : ");
		while(anoComec<=anoFim) {
			if(anoComec%4 ==0) {
				System.out.println(anoComec);
				qntd++;
			}
			anoComec++;
		}
		System.out.println ("Os anos bissextos foram : " +qntd);

	}

}
