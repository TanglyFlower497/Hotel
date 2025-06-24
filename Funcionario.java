/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_hotel;
public class Funcionario extends Pessoa {
    private String cargo;

    Funcionario(String nome, String cpf, String cargo) {
        super(nome, cpf);
        this.cargo = cargo;
    }
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
    }

    public String getCargo() {
        return cargo;
    }
}

