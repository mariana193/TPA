package prjMediaAritmetica;
import java.util.Scanner;
public class mediaAritmetica {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double nota1, nota2, nota3, nota4, mediaAritmetica;
		
		System.out.println("Digite o valor da primeira nota :");
		nota1= ler.nextDouble();
		
		System.out.println("Digite o valor da segunda nota :");
		nota2= ler.nextDouble();
		
		System.out.println("Digite o valor da terceira nota :");
		nota3= ler.nextDouble();
		
		System.out.println("Digite o valor da quarta nota :");
		nota4= ler.nextDouble();
		
		mediaAritmetica = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A sua média aritmética é : "+mediaAritmetica);
		
		ler.close();
				
	}

}
