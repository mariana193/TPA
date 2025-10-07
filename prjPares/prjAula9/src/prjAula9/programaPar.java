package prjAula9;
import java.util.*;
public class programaPar {
	public static void main(String args[]) {
		int i=1;
		int resultado;
		resultado=2;
		do {
			resultado=resultado+2;
			System.out.println("Os números pares entre 1 e 200 são " +resultado);
			i++;
		}while(i<250);
	}

}
