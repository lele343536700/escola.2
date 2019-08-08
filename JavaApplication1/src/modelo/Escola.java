/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Escola {
    private int cogido;
    private String nome;
    private String endereco;
    private String sigla;

    public int getCogido() {
        return cogido;
    }

    public void setCogido(int cogido) {
        this.cogido = cogido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Escola{" + "nome=" + nome + ", endereco=" + endereco + ", sigla=" + sigla + '}';
    }

}
