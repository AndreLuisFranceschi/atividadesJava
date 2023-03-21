/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f = new Funcionario();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----FUNCIONARIO-----");
        
        System.out.print("Nome: ");
        f.setNome(sc.nextLine());
        
        System.out.print("Sobrenome: ");
        f.setSobrenome(sc.nextLine());
        
        System.out.print("Idade: ");
        f.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.print("Departamento: ");
        f.setDepartamento(sc.nextLine());
        
        System.out.print("Salário: ");
        f.setSalario(sc.nextFloat());
        sc.nextLine();
        System.out.print("Situação previdenciária: ");
        f.setSitPrevidenciaria(sc.nextLine());
        
        System.out.print("Tempo de serviço: ");
        f.setTempoServico(sc.nextInt());
        sc.nextLine();
        f.acrescimoSalario();
        System.out.println("");
        
        
        System.out.println(f.toString());
    }
    
}
