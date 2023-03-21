/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Avaliacao a[] = new Avaliacao[3];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe os dados das avaliações:");
        for (int i = 0; i < a.length; i++) {
            a[i] = new Avaliacao();
            System.out.println("\nAvaliação " + (i+1));
            System.out.print("Disciplina: ");
            a[i].setNome(sc.nextLine());
            System.out.print("Data: ");
            a[i].setData(sc.nextLine());
            System.out.print("Nota: ");
            a[i].setNota(sc.nextFloat());
            sc.nextLine();
        }
        
        System.out.println();
        for (Avaliacao i : a) {
            System.out.println(i.toString());
        }

        float media = (a[0].getNota() + a[1].getNota() + a[2].getNota()) / a.length;
        System.out.println("A média das notas é de: " + media);
    }

}
