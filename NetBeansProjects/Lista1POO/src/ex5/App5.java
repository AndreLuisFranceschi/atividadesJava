/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean controle = true;
        
        while(controle){
            String texto = sc.nextLine();
            if (texto.length() >= 5 && texto.endsWith(texto.substring(0, 5))){
                System.out.println("Os 5 primeiros caracteres são iguais aos 5 últimos do texto");
                controle = false;
            }
        }
        
    }
    
}
