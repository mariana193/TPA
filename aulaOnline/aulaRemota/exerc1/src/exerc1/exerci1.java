package exerc1;
import java.util.*;
public class exerci1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int TAM = 20;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        System.out.println("Digite os " + TAM + " números:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = leia.nextInt();
            if (A[i] % 2 == 0) {
                B[i] = A[i];
            } else {
                B[i] = 0;
            }
        }
        System.out.println("Números pares:");
        for (int i = 0; i < TAM; i++) {
            if (B[i] != 0) {
                System.out.print(B[i] + " ");
            }
        }
        System.out.println("Números ímpares:");
        for (int i = 0; i < TAM; i++) {
            if (A[i] % 2 != 0) {
                System.out.print(A[i] + " ");
            }
        }
        leia.close();
    }
}
