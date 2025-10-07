import java.util.Scanner;
public class diasAnos {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int dias, ano, mes;
		
		System.out.println("Digite os dias");
		dias = leia.nextInt();
		
		mes = dias/30;
		ano = dias/365;
		
		System.out.println("A quantidade de meses é:" +mes+ " mes ou meses ");
		System.out.println("A quantidade de anos é:" +ano+ " ano ou anos ");
		leia.close();
				
				
	}
	

}
