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
public class Aluno extends Pessoa {

    private static final int MAX = 2;
    private ArrayList<Historico> historico = new ArrayList<>();
    private Historico historico1;
    private Historico historico2;
    private Historico historico3;
    

    public Aluno(String nome, int cpf, int telefone, int id) {
        super(nome, cpf, telefone, id);
    }

    @Override
    public String toString() {
        return ("Aluno: id: " + id + " Nome: " + this.nome + ", CPF: " + cpf + ", Telefone: " + telefone + " Matricula: " + getMatricula() + "; \n");
    }

//    public Disciplinas getDisciplinasCursando(int i) {
//        return DisciplinasCursando.get(i);
//    }
//
//    public void setDisciplinasCursando(ArrayList<Disciplinas> DisciplinasCursando) {
//        this.DisciplinasCursando = DisciplinasCursando;
//    }
//
//    public boolean cadastrarDisciplina(Disciplinas disciplinas) {
//
//// Condicao de existÃªncia
//        if (this.DisciplinasCursando.size() < this.MAX) {
//            this.DisciplinasCursando.add(disciplinas);
//            return true;
//        }
//        return false;
//    }
//    public void listarDisciplinas() {
//        for (int i = 0; i < this.DisciplinasCursando.size(); i++) {
//            System.out.println("Disciplina " + (i + 1) + ": " + this.DisciplinasCursando.get(i).getNome());
//        }
//
//    }
//
//    public void alterarNota(String nomeDisciplina, float novaNota) {
//        int a = 0;
//        for (int i = 0; i < this.DisciplinasCursando.size(); i++) // i vai aumentar até o nome da disciplina se o que se quer
//        {
//            if (this.DisciplinasCursando.get(i).getNome() == nomeDisciplina) {
//                a = i;
//                break;
//            }
//        }
//
//        this.DisciplinasCursando.get(a).setNotaAluno(novaNota); //retorna a disciplina
//    }
//    public ArrayList<Notas> getNotas() {
//        return notas;
//    }
//
//    public void setNotas(ArrayList<Notas> notas) {
//        this.notas = notas;
//    }


    public ArrayList<Historico> getHistorico() {
        return historico;
    }

    public Historico getHistorico1() {
        return historico1;
    }

    public void setHistorico1(Historico historico1) {
        this.historico1 = historico1;
    }

    public Historico getHistorico2() {
        return historico2;
    }

    public void setHistorico2(Historico historico2) {
        this.historico2 = historico2;
    }

    public Historico getHistorico3() {
        return historico3;
    }

    public void setHistorico3(Historico historico3) {
        this.historico3 = historico3;
    }

    public Disciplinas GetHistoorico1(Disciplinas disciplina) {
      return disciplina;
        
    
    }
    public Disciplinas GetHistoorico2(Disciplinas disciplina) {
      return disciplina;
        
    
    }
    public Disciplinas GetHistoorico3(Disciplinas disciplina) {
      return disciplina;
        
    
    }

    

}
