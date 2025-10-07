import java.util.Scanner;
public class prjSalario {
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double salarioBruto, salarioLiquido,valeTrans, salarioFinal;
		
		System.out.println("Digite o valor do seu salário : ");
		salarioBruto = ler.nextDouble();
		
		salarioLiquido = salarioBruto*(8/100);
		
		valeTrans = salarioBruto*(6/100);
		
		salarioFinal = salarioLiquido+valeTrans;
		
		System.out.println("O salário final é : " +salarioFinal+ "reais");
		
		ler.close();
		
		
	}
    	
    

}
