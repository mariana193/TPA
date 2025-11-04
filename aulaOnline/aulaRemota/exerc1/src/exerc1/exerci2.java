package exerc1;
import java.util.*;
public class exerci2{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int TAM = 5;
        int[] A = new int[TAM];
        System.out.println("Digite " + TAM + " números:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = leia.nextInt();
        }
        System.out.println("Tabuada");
        for (int i = 0; i < TAM; i++) {
            System.out.println("Tabuada do " + A[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
            }
        }
        leia.close();
    }
}

