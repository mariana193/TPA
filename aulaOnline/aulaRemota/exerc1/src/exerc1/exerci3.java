package exerc1;
import java.util.*;
public class exerci3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int TAM = 10;
        int[] A = new int[TAM];
        System.out.println("Digite " + TAM + " números :");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = leia.nextInt();
        }
        System.out.println(" Verificação de números primos");
        for (int i = 0; i < TAM; i++) {
            int num = A[i];
            int divisao = 0;
            if (num > 1) {
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        divisao++;
                    }
                }
                if (divisao == 2) {
                    System.out.println(num + " é um número primo.");
                } else {
                    System.out.println(num + " não é um número primo.");
                }
            } else {
                System.out.println(num + " não é um número primo.");
            }
        }
        leia.close();
    }
}
