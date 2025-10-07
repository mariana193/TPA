import java.util.Scanner;
public class prjVolumeCubo {
        public static void main (String[] args) {
        	
        	Scanner ler = new Scanner(System.in);
        	double L , resultado;
        	
        	System.out.println("Digite o valor de um dos lados do cubo : ");
        	L = ler.nextDouble();
        
        	
        	resultado =  L*L;
        	
        	System.out.println("O volume do cubo é :" +resultado);
        	ler.close();
        			
        	
        	
        	
        }
		
		
}
