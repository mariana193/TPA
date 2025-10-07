package prjAula9;
import java.util.*;
public class programaAltura {
	  public static void main(String args[])  {
		int i=1;
		double joao=134,pedro=145,anoJoao=2.5,anoPedro=2.0;
	    do {
	    	anoJoao=joao+anoJoao;
	    	anoPedro=pedro+anoPedro;
	    	System.out.println("A altura de João vai ser "+anoJoao+ "e de Pedro vai ser " +anoPedro);
	    	i++;
	    }while(joao<pedro);
	    
	    
	}

}
