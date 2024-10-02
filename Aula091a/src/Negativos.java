import java.util.Locale;
import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i<vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int j : vetor) {
            if (j < 0) {
                System.out.printf("%d\n", j);
            }
        }

        sc.close();
    }
}