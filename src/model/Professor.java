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
public class Professor extends Pessoa {

    private Turma slotTurma1 = null, slotTurma2 = null;

    public Professor(String nome, int cpf, int telefone, int id) {
        super(nome, cpf, telefone, id);

    }

    @Override
    public String toString() {
        return ("Professor: id: " + id + " Nome: " + this.nome + ", CPF: " + cpf + ", Telefone: " + telefone +" Matricula: "+ getMatricula()+ ";\n");
    }

    public Turma getSlotTurma1() {
        return slotTurma1;
    }

    public void setSlotTurma1(Turma slotTurma1) {
        this.slotTurma1 = slotTurma1;
    }

    public Turma getSlotTurma2() {
        return slotTurma2;
    }

    public void setSlotTurma2(Turma slotTurma2) {
        this.slotTurma2 = slotTurma2;
    }

    
}
