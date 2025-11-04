package exerc1;
import java.util.*;
public class exerci4{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int TAM = 10;
        int[] A = new int[TAM];
        System.out.println("Digite " + TAM + " números ");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = leia.nextInt();
        }
        System.out.println("Números pares até o elemento");
        for (int i = 0; i < TAM; i++) {
            System.out.println("Número " + A[i] + ":");
            for (int j = 0; j <= A[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
           System.out.println();
        }
        leia.close();
    }
}
