package prjAulaNove;
import java.util.*;
public class prj3 {
	public static void main(String args []) {
		Scanner leia = new Scanner(System.in);
		int i=1;
		int f1=0,f2=0,f3=0,f4=0,f5=0,idade,qntd=0;
		do {
			System.out.println("Insira sua idade ");
			idade= leia.nextInt();
			if(idade<=15) {
				System.out.println("Sua faixa etária é a primeira");
				f1=f1+1;
			}else if(idade<=30) {
				System.out.println("Sua faixa etária é a segunda");	
				f2=f2+1;
			}else if (idade<=45) {
				System.out.println("Sua faixa etária é a terceira");
				f3=f3+1;
			}else if (idade<=60) {
				System.out.println("Sua faixa etária é a quarta");
				f4=f4+1;
			}else {
				System.out.println("Sua faixa etária é a quinta");	
				f5=f5+1;
			}
			System.out.println("Deseja continuar? 1=Sim 2=Não");
			i=leia.nextInt();
			}while(i==1);
		System.out.println("A quantidade de pessoas na primeira faixa é : " +f1+ " pessoas e a porcentagem é de " +(f1*100/f1)+ "%");
		System.out.println("A quantidade de pessoas na segunda faixa é : " +f2 + " pessoas e a porcentagem é de " +(f2*100/f2)+ "%");
		System.out.println("A quantidade de pessoas na terceira faixa é : " +f3 + " pessoas e a porcentagem é de " +(f3*100/f3)+ "%");
		System.out.println("A quantidade de pessoas na quarta faixa é : " +f4 + " pessoas e a porcentagem é de " +(f4*100/f4)+ "%");
		System.out.println("A quantidade de pessoas na quinta faixa é : " +f5 + " pessoas e a porcentagem é de " +(f5*100/f5 )+ "%");
		

	}

}


	


