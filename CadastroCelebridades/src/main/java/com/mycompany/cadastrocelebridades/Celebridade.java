//Aluna: Gabriela Sena da Silva     2ºTI

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cadastrocelebridades;

/**
 *
 * @author Gabriela
 */
public class Celebridade {
    
    private String nome;
    private String conta;
    private int idade;
    private String areaDeAtuacao;
    private int numSeguidores;
    private String redeSocial;

    public Celebridade(String nome, String conta, int idade, String areaDeAtuacao, int numSeguidores, String redeSocial) {
        this.nome = nome;
        this.conta = conta;
        this.idade = idade;
        this.areaDeAtuacao = areaDeAtuacao;
        this.numSeguidores = numSeguidores;
        this.redeSocial = redeSocial;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao){
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumSeguidores() {
        return numSeguidores;
    }

    public void setNumSeguidores(int numSeguidores) {
        this.numSeguidores = numSeguidores;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }
       
}
