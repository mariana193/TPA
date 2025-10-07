package prjAula9;
import java.util.*;
public class programaEtaria {
	public static void main(String args []) {
		Scanner leia = new Scanner(System.in);
		int i=1;
		int f1=0,f2=0,f3=0,f4=0,f5=0,idade,qntd;
		do {
			System.out.println("Insira sua idade ");
			idade= leia.nextInt();
			if(idade<=15) {
				System.out.println("Sua faixa etária é a primeira");
			}else if(idade>16) {
				System.out.println("Sua faixa etária é a segunda");	
			}else if (idade>30) {
				System.out.println("Sua faixa etária é a terceira");	
			}else if (idade>45) {
				System.out.println("Sua faixa etária é a quarta");	
			}else {
				System.out.println("Sua faixa etária é a quinta");	
			}
			System.out.println("Deseja continuar? 1=Sim 2=Não");
			i=leia.nextInt();
			}while(i==1);
		do {
			if(idade<=15) {
				qntd=f1+1;
				System.out.println("A quantidade de pessoas na primeira faixa etária é " +qntd);
			
			}
			i++;
		}while(i<i);
	}

}
