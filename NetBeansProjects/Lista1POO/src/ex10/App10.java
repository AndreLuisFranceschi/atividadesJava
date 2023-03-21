/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("*** NOVA CONTA ***");

        System.out.print("Digite o número da sua nova conta:");
        int num = sc.nextInt();

        System.out.print("Digite o saldo: ");
        float saldo;
        do {
            saldo = sc.nextFloat();
            if (saldo < 0) {
                System.out.println("Saldo deve ser >= 0. Digite novamente.");
            }
        } while (saldo < 0);

        Conta c = new Conta(num, saldo);

        System.out.println(c.toString());

        while (true) {
            System.out.println("\t*** MENU ***");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Extrato");
            System.out.println("4. Sair");
            
            int opc;
            opc = sc.nextInt();
            
            if (opc == 4) {
                break;
            }
            
            switch (opc) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    c.deposito(sc.nextFloat());
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    c.saque(sc.nextFloat());
                    break;
                case 3:
                    System.out.println(c.toString());
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

}
