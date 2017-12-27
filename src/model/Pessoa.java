/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Artu
 */
public class Pessoa {
    
    int cpf, telefone, id = 0;
    String nome;
    private final long matricula;

    public Pessoa(String nome, int cpf, int telefone, int id) {
        this.id = id++;
        this.telefone = telefone;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = id;
        id++; // incrementador do id
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "nome:" + getNome() + ", cpf" + getCpf() + ", telefone" + getTelefone() + " ,id " + getId();
    }

 
    public long getMatricula() {
        return matricula;
    }

    public void setId(int id) {
        this.id = id;
    }

}
