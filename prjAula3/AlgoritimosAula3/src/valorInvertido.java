import java.util.Scanner;
public class valorInvertido {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double A,B,C;
		
		System.out.println("Digite o valor A");
		A = leia.nextDouble();
		
		System.out.println("Digite o valor B");
		B = leia.nextDouble();
		
		C = A;
		A = B;
		B = C;
		
		System.out.println("O valor invertido de A e B é : " +A+ +B );
		
		leia.close();
		
		
	}

}
