/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10;

/**
 *
 * @author Usuario
 */
public class Conta {

    private int numero;
    private float saldo;

    public Conta(int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void saque(float saque) {
        if (saque > 0 && saldo >= saque) {
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente, saque não realizado!");
        }
    }

    public void deposito(float deposito) {
        if (deposito > 0) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor deve ser maior que 0");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo + '}';
    }

}
