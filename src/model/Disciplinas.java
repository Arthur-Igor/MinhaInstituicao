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
//public class Disciplinas {
//    private String Nome;
//    private Double CargaHoraria;
//
//    public Disciplinas(String Nome, Double CargaHoraria) {
//        this.Nome = Nome;
//        this.CargaHoraria = CargaHoraria;
//    }
//
//    public String getNome() {
//        return Nome;
//    }
//
//    public void setNome(String Nome) {
//        this.Nome = Nome;
//    }
//
//    public Double getCargaHoraria() {
//        return CargaHoraria;
//    }
//
//    public void setCargaHoraria(Double CargaHoraria) {
//        this.CargaHoraria = CargaHoraria;
//    }
public class Disciplinas {


    private String nome;
    private int cargaHoraria;
    private int id;
    private  int num = 1 ;
    
    public Disciplinas (String nome,int cargaHoraria){
        this.nome = nome;
               this.cargaHoraria = cargaHoraria;
        this.id = num;
        num++;
    }

    public Disciplinas(Disciplinas disciplina) {//para quando for atribuída à um aluno
        this.nome = disciplina.getNome();
        this.cargaHoraria = disciplina.getCargaHoraria();
    }

//    public Disciplinas(String nome, int cargaHoraria) {
//        this.nome = nome;
//        this.cargaHoraria = cargaHoraria;
//    }

// Metodos get e set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
