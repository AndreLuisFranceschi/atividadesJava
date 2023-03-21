/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11poo;

/**
 *
 * @author Usuario
 */
public class Aula11POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(64);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Pedro");
        a1.setIdade(12);
        a1.setSexo("M");
        a1.setCurso("Informática");
        a1.setMatricula(1111);
        System.out.println(a1.toString());
    }
    
}
