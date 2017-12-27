/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static model.Cadastros.verifica;

/**
 *
 * @author Artu
 */
public class Historico {

    private Disciplinas disciplina;
    private double[] notas = new double[2];
    private double media;
    private int id;

    /**
     *
     * @param disciplina
     * @param id
     * 
     */
    public Historico(Disciplinas disciplina, int id) {
        this.id = id;
        this.disciplina = disciplina;
        this.notas[0] = 0;
        this.notas[1] = 0;
        
    }

    @Override
    public String toString() {
        return "Historico{ id= " + id+ " disciplina= " + disciplina + ", nota 1= " + notas[0]+ ", nota 2= " + notas[1]  + '}';
    }
    

    public void calcularMedia() {
        double x = 0;
        for (int i = 0; i < 2; i++) {
            x = x + this.notas[i];
        }
        this.media = x / 2;
    }

    public void adicionarNota() {
        for (int i = 0; i < 2; i++) {
            System.err.println("Digite a "+i+"° nota");
            this.notas[i] = verifica();
        }
    }
    
    public double[] getNotas() {
        return notas;
    }
    public double getNota1(){
        double nota1 = 0;
        nota1 = notas[0];
        return nota1;
    }
    public double getNota2(){
        double nota2 = 0;
        nota2 = notas[1];
        return nota2;
    }

    /**
     *
     * @param notas
     */
    public void setNotas(double notas[]) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Disciplinas getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
 