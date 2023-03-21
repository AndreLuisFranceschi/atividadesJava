/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App9 {

    /**
     * @param args the command line arguments
     */
    
    public static void cadastrar(){
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Livro l[] = new Livro[10];
        Scanner sc = new Scanner(System.in);
        
        while (true) {            
            System.out.println("\t***MENU***");
            System.out.println("Digite a operação:");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Buscar livro pelo ISBN");
            System.out.println("3. Sair");
            
            int opc = sc.nextInt();
            
        }
    }    
}
