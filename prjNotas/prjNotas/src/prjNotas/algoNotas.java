package prjNotas;
import java.util.Scanner;
public class algoNotas {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double n1,n2,n3,n4,mi,ex,nm;
		System.out.println("Insira a primeira nota");
		n1=leia.nextDouble();
		
		System.out.println("Insira a segunda nota");
		n2=leia.nextDouble();
		
		System.out.println("Insira a terceira nota");
		n3=leia.nextDouble();
		
		System.out.println("Insira a quarta nota");
		n4=leia.nextDouble();
		
		mi=(n1+n2+n3+n4)/4;
		System.out.println("A sua nota é : "+mi);
		if(mi>=7) {
			System.out.println("Você está aprovado");
		}else if (mi<5) {
			System.out.println("Você está reprovado");
		}else{
			System.out.println("Você está em exame");
			System.out.println("Insira a nota do exame");
			ex=leia.nextDouble();
			nm=(mi+ex)/2;
			System.out.println("A sua nota é : "+nm);
			if(nm>=7) {
				System.out.println("Você está aprovado");
			}else {
				System.out.println("Você está reprovado");
			}
		
		
	}
	}
}
