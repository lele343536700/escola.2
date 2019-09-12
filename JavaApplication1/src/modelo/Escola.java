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
    private int nr_de_alunos;
    private Double area;

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

    public int getNr_de_alunos() {
        return nr_de_alunos;
    }

    public void setNr_de_alunos(int nr_de_alunos) {
        this.nr_de_alunos = nr_de_alunos;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Escola{" + "nome=" + nome + '}';
    }
    
}