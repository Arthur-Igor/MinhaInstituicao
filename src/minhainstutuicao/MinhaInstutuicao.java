/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhainstutuicao;

import java.util.Scanner;
import model.Aluno;
import model.Cadastros;

/**
 *
 * @author Artu
 */
public class MinhaInstutuicao {

    /**
     * @param args the command line arguments
     */
    private static Scanner ler;

    public static void main(String[] args) {

        int id;
        Cadastros cadastros = new Cadastros();
        boolean contador = true;
        ler = new Scanner(System.in);
        while (contador) {

            System.out.println(" 1- Membros da instituição \n 2- Disciplinas  \n 3- Turmas \n Digite '0' para sair\n");// menu 1
            int a = cadastros.verifica();
            switch (a) {
                case 1: //Caso ver membros da instituição
                    //menu 2
                    System.out.println("Membros da instituição ===================================="
                            + "\n 1- Vincular membros \n 2- Desvincular membros  \n 3- Listar membros \n 4 - Listar professores \n 5 - Listar alunos \n 6 - Adicionar nota a aluno \n 7 - Mostrar nota do aluno\n 8 - Mostrar media geral do aluno \n digite '0' para voltar.\n");
                    int b = ler.nextInt();
                    switch (b) {//menu 3
                        case 1:
                            System.out.println(" Vincular membros ===================================="
                                    + "\n 1- Vincular alunos \n 2- Vincular professores \n Digite '0' para voltar\n");
                            int c = Cadastros.verifica();
                            switch (c) {//menu 4, vincular membros
                                case 1:

                                    cadastros.cadastrarAlunos();
                                    break;

                                case 2:
                                    cadastros.cadastrarProfessores();

                                    break;
                            }//fim switch c

                            break;

                        case 2:
                            System.out.println(" Desincular membros===================================="
                                    + "\n 1- Desvincular alunos \n 2- Desvincular professores \n Digite '0' para voltar\n");
                            int d = cadastros.verifica();
                            switch (d) {//menu 5, vincular membros
                                case 1:
                                    System.err.println("Alunos: \n");
                                    cadastros.listarAlunos();
                                    cadastros.excluirAluno();
                                    break;

                                case 2:
                                    System.err.println("Professores: \n");
                                    cadastros.listarProfesores();
                                    cadastros.excluirProfessor();

                                    break;
                            }
                            //fim switch d

                            break;
                        case 3:
                            cadastros.listarMembros();

                            break;

                        case 4://ver datalhes dos professores

                            cadastros.listarProfesores();

                            break;
                        case 5://Ver tdetalhes dos alunos
                            cadastros.listarAlunos();

                            break;
                        case 6:
                            System.out.println("\n Adicionar aluno \n");
                            cadastros.adicionaNotaAluno();

                            break;
                        case 7:
                            System.err.println("\n Notas \n");
                            cadastros.mostrarNota();

                            break;
                        case 8:
                            System.err.println("\n Media geral \n");
                            cadastros.mediaGeral();

                            break;
                            
                    }//fim switch b
                    break;
                case 2: //2- ver disciplinas ofertadas
                    //menu 6
                    System.out.println(" Disciplinas===================================="
                            + "\n 1-Criar nova disciplina \n 2- Remover disciplina exitente \n 3- Listar disciplinas \n Digite '0' para voltar\n");
                    int e = cadastros.verifica();
                    switch (e) {
                        case 1:
                            cadastros.cadastrarDisciplinas();
                            break;

                        case 2:
                            System.err.println("Disciplinas: \n");
                            cadastros.listarDisciplinas();

                            cadastros.excluirDisciplina();
                            break;

                        case 3:
                            cadastros.listarDisciplinas();
                            break;

                    }
                    break;
                case 3: //3 ver turmas
                    System.out.println(" Turmas ===================================="
                            + "\n 1- Criar nova turma \n 2- Remover turma \n 3- Listar turmas  \n 4- Adicionar aluno à turma \n Digite '0' para voltar\n");
                    int f = cadastros.verifica();
                    switch (f) {
                        case 1:
                            cadastros.cadastrarTurma();
                            break;

                        case 2:
                            System.err.println("Turmas: \n");
                            cadastros.listarTurmas();
                            cadastros.excluirTurma();
                            break;

                        case 3:
                            cadastros.listarTurmas();
                            break;

                        case 4:
                            cadastros.adicionaAlunoaTurma();
                            break;
                    }

            }
            if (a == 000) {

                System.out.println("Bye");
                contador = false;
            }//fim switch a

        }
    }
}
