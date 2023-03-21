/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7;

/**
 *
 * @author Usuario
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private int idade;
    private String departamento;
    private float salario;
    private String sitPrevidenciaria;
    private int tempoServico;
    
    public void acrescimoSalario(){
        if (this.tempoServico >= 2 && this.tempoServico <= 5){
            this.salario += this.getSalario() * 0.05;
        } else if (this.tempoServico >= 6 && this.tempoServico <= 10){
            this.salario += this.getSalario() * 0.10;
        } else {
            this.salario += this.getSalario() * 0.15;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSitPrevidenciaria() {
        return sitPrevidenciaria;
    }

    public void setSitPrevidenciaria(String sitPrevidenciaria) {
        this.sitPrevidenciaria = sitPrevidenciaria;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + 
                ", sobrenome=" + sobrenome + 
                ", idade=" + idade + 
                ", departamento=" + departamento + 
                ", salario=" + salario + 
                ", sitPrevidenciaria=" + sitPrevidenciaria + 
                ", tempoServico=" + tempoServico + '}';
    }
    
    
}
