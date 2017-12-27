/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Artu
 */
public class Turma {

    private final String nome;
    private boolean status = false;
    private ArrayList<Aluno> AlunosDaTurma = new ArrayList<>();
    private Professor professorDaTurma;
    private Disciplinas disciplinaDaTurma;
    private int id;
    
    public Turma(Disciplinas disciplinaDaTurma, Professor professorDaTurma, String nome) {
        this.nome = nome;
        this.status = true;
        this.disciplinaDaTurma = disciplinaDaTurma;
        this.professorDaTurma = professorDaTurma;
    }

    public boolean aberta() {
        return status;
    }

    public void setStatus(boolean a) {
        this.status = a;
    }

    public ArrayList<Aluno> getAlunosDaTurma() {
        return AlunosDaTurma;
    }

    public void setAlunosDaTurma(ArrayList<Aluno> AlunosDaTurma) {
        this.AlunosDaTurma = AlunosDaTurma;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessorDaTurma() {
        return professorDaTurma;
    }

    public void setProfessorDaTurma(Professor professorDaTurma) {
        this.professorDaTurma = professorDaTurma;
    }

    public Disciplinas getDisciplinaDaTurma() {
        return disciplinaDaTurma;
    }

    public void setDisciplinaDaTurma(Disciplinas disciplinaDaTurma) {
        this.disciplinaDaTurma = disciplinaDaTurma;
    }

    public void setAlunodaTurma(Aluno aluno) {
        this.AlunosDaTurma.add(aluno);
        System.out.println("Aluno matrículado.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        @Override
    public String toString() {
        return "Turma{" + "nome=" + nome + ", status=" + status + ", AlunosDaTurma=" + AlunosDaTurma + ", professorDaTurma=" + professorDaTurma + ", disciplinaDaTurma=" + disciplinaDaTurma + '}' + "\n";
    }

}
