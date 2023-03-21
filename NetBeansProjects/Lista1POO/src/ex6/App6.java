package ex6;

import java.util.Arrays;
import java.util.Scanner;

public class App6 {

    public static int lerInteiro(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("Valor inválido!");
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        int m[] = new int[3];
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores inteiros:");
        for (int i = 0; i < m.length; i++) {
            System.out.print((i + 1) + ": ");
            m[i] = lerInteiro(sc);
        }

        System.out.println("\nDigite um valor de 1 a 3 para a operação:");
        do {
            n = lerInteiro(sc);
            if (n < 1 || n > 3) {
                System.out.println("Valor inválido, digite novamente.");
            }
        } while (n < 1 || n > 3);

        Arrays.sort(m);

        switch (n) {
            case 1 ->
                System.out.println("Menor valor: " + m[0]);
            case 2 ->
                System.out.println("Maior valor: " + m[2]);
            case 3 ->
                System.out.println("Do menor para o maior: " + Arrays.toString(m));
            default ->
                throw new AssertionError();
        }
    }

}
