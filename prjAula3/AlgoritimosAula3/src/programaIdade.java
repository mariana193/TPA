import java.util.Scanner;
public class programaIdade {
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		double anoNasc, anoAtual, idade;
		
		System.out.println ("Digite o ano atual");
		anoAtual = leia.nextDouble();
		
		System.out.println ("Digite o ano do seu nascimento");
		anoNasc = leia.nextDouble();
		
		idade = anoAtual-anoNasc;
		System.out.println("Sua idade é:" +idade+ "anos.");
		leia.close();
		
		
	}
	
	

}
