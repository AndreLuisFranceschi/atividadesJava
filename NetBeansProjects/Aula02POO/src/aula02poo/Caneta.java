/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02poo;

/**
 *
 * @author Usuario
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Número da ponta: " + this.ponta);
        System.out.println("Quantidade de carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, a caneta está tampada");
        } else{
            System.out.println("Rabiscando...");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
