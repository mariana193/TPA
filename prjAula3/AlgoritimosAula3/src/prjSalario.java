import java.util.Scanner;
public class prjSalario {
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double salarioBruto, salarioLiquido,valeTrans, salarioFinal;
		
		System.out.println("Digite o valor do seu sal�rio : ");
		salarioBruto = ler.nextDouble();
		
		salarioLiquido = salarioBruto*(8/100);
		
		valeTrans = salarioBruto*(6/100);
		
		salarioFinal = salarioLiquido+valeTrans;
		
		System.out.println("O sal�rio final � : " +salarioFinal+ "reais");
		
		ler.close();
		
		
	}
    	
    

}
