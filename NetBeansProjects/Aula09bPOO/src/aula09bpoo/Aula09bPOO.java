/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09bpoo;

/**
 *
 * @author Usuario
 */
public class Aula09bPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 20, "F");
        
        l[0] = new Livro("Aprendendo Java", "José", 300, p[0]);
        l[1] = new Livro("Java Avançado", "Maria Candido", 500, p[1]);
        l[2] = new Livro("PHP Básico", "João", 400, p[0]);
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
    
}
