/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String frase = sc.nextLine();
        
        for(char i : frase.toCharArray()){
            System.out.println(i);
        }
        
    }
    
}
