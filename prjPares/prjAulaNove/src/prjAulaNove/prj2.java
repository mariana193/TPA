package prjAulaNove;
public class prj2 {
	public static void main(String args[])  {
		int i=1;
		double joao=134,pedro=145,anoJoao=2.5,anoPedro=2.0,anos=0;
	    do {
	    	joao=joao+anoJoao;
	    	pedro=pedro+anoPedro;
	    	anos++;
	        System.out.println("Ano " + anos + ": João = " + joao + " cm, Pedro = " + pedro + " cm");
	    	i++;
	    }while(joao<=pedro);
	    System.out.println("João ficara mais alto que pedro em "+anos+ "anos");

}
}
