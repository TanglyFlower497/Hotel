/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_hotel;
public class Gerente extends Funcionario {
    private String nivelAcesso;

   Gerente(String nome, String cpf, String nivelAcesso) {
        super(nome, cpf, "Gerente");
        this.nivelAcesso = nivelAcesso;
    }
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Nível de Acesso: " + nivelAcesso);
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }
}

