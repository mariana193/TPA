import java.util.Scanner;
public class programaImc {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Double peso, altura, imc;
		
		System.out.println("Digite o seu peso em kg");
		peso = leia.nextDouble();
		
		System.out.println("Digite sua altura em metros");
		altura = leia.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.println( "Seu imc é" +imc);
		
		leia.close();
		
		
		
	}
	

}
