package prjAula11;
import java.util.*;
public class exerc2 {
	public static void main (String args []) {
		Scanner leia = new Scanner (System.in);
		int i=0;
		double anoAtual,anoNasc,idade,escolha;
		do {
			System.out.println("Insira o ano atual");
			anoAtual= leia.nextDouble();
			System.out.println("Insira o ano de seu nascimento");
			anoNasc= leia.nextDouble();
			idade= anoAtual-anoNasc;
			System.out.println("A sua idade é : "+idade);
			System.out.println("Deseja continuar? 1-Continuar 0-Sair ");
			escolha =leia.nextDouble();
		}while(escolha ==1);
	}

}
