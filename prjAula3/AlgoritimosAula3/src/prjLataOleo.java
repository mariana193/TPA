import java.util.Scanner;
public class prjLataOleo {
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double R , H , resultado;
		
		System.out.println("Digite a altura da lata de oléo");
		H = ler.nextDouble();
		
		R= H/2;
		
		resultado = 3.14*R*R*H;
		
		System.out.println("O volume da lata de oléo é : " +resultado);
		ler.close();
				
				
				
		
		
		
		
		
	}

}
