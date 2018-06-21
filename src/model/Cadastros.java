package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Cadastros {

    ArrayList<Aluno> alunosCadastradas = new ArrayList<>();
    ArrayList<Professor> professoresCadastrados = new ArrayList<>();
    ArrayList<Disciplinas> disciplinasCadastradas = new ArrayList<>();
    ArrayList<Turma> turmasCadastradas = new ArrayList<>();
    ArrayList<Historico> historicos = new ArrayList<>();
    private Scanner ler;
    private int id = 0;
    int b = 1;
    double kkk = 0, kkk1 = 0, kkk2 = 0;
    int xd = 0, xd1 = 0, xd2 = 0;// para pegar a media sem usar laços

    public void idd() {
        id++;
    }

    public void cadastrarAlunos() { //fun��o para cadastro de pessoas

        ler = new Scanner(System.in);

        System.out.println("digite o nome: \n");
        String nome = ler.next();
        System.out.println("digite o cpf: \n");
        int cpf = verifica();
        System.out.println("digite o telefone: \n");
        int telefone = verifica();

        int a = 0; // int para interromper a verifica��o do cadastro

        while (a == 0) { // compara�ao de strings
            idd();
            Aluno alunosCadastrados = new Aluno(nome, cpf, telefone, id);
            System.out.println("Matricula: " + alunosCadastrados.getMatricula());
            alunosCadastradas.add(alunosCadastrados);
            System.out.println("CADASTRO CONCLU�DO! \n");
            a++;
        }

    }

    public void excluirAluno() { //funn��o para excluir pessoas cadastradas de acordo com o nome
        ler = new Scanner(System.in);
        System.out.println("Digite a matricula do aluno que deseja excluir");
        long nome;
        nome = ler.nextLong();
        if (alunosCadastradas.size() > 0) {
            for (int i = 0; i < alunosCadastradas.size(); i++) {
                if (alunosCadastradas.get(i).getMatricula() == nome) {//pega o indice i do objeo pessoa, pega o id da pessoa e compara com o id da pessoa digitada
                    alunosCadastradas.remove(i); //Remove a pessoa do tipo nome com o indice i
                    System.err.println("Aluno desmatriculado");
                }
            }
        } else {
            System.err.println("Não existem alunos cadastrados");
        }
//remove all remove todas as pessoas com tal nome	
    }

    public void cadastrarProfessores() {
        ler = new Scanner(System.in);
        System.out.println("digite o nome: \n");
        String nome = ler.next();
        System.out.println("digite o cpf: \n");
        int cpf = verifica();
        System.out.println("digite o telefone: \n");
        int telefone = verifica();

        int a = 0; // int para interromper a verifica��o do cadastro

        while (a == 0) { // compara�ao de strings
            idd();
            Professor professorCadastrado = new Professor(nome, cpf, telefone, id);
            System.out.println("Matrícula: " + professorCadastrado.getMatricula());
            professoresCadastrados.add(professorCadastrado);
            System.out.println("CADASTRO CONCLU�DO! \n");
            a++;
        }

    }

    public void excluirProfessor() { //funn��o para excluir pessoas cadastradas de acordo com o nome
        ler = new Scanner(System.in);
        System.out.println("digite a matricula do professor que deseja excluir");
        long nome;
        nome = ler.nextLong();
        if (professoresCadastrados.size() > 0) {
            for (int i = 0; i < professoresCadastrados.size(); i++) {
                if (professoresCadastrados.get(i).getMatricula() == nome) {//pega o indice i do objeo pessoa, pega o id da pessoa e compara com o id da pessoa digitada
                    professoresCadastrados.remove(i); //Remove a pessoa do tipo nome com o indice i
                    System.out.println("Professor desmatriculado \n");
                }
            }
        } else {
            System.err.println("Não existem professores matriculados");
        }

    }

    public void listarAlunos() { //fun��o para imprimir os alunos cadastrados
        System.out.println("Alunos: \n");
        if (alunosCadastradas.size() > 0) {
            System.out.println(Arrays.toString(alunosCadastradas.toArray()));
        } else {
            System.err.println("Não existem alunos cadastrados");
        }

    }

    public void listarProfesores() {
        System.out.println("Professores \n");
        if (professoresCadastrados.size() > 0) {
            System.out.println(Arrays.toString(professoresCadastrados.toArray()));
        } else {
            System.err.println("Não existem professores cadastrados");
        }
    }

    public void listarMembros() {
        System.out.println("Professores \n");
        if (professoresCadastrados.size() > 0) {
            System.out.println(Arrays.toString(professoresCadastrados.toArray()));
        } else {
            System.err.println("Não existem professores cadastrados");
        }

        System.out.println("Alunos: \n");
        if (alunosCadastradas.size() > 0) {
            System.out.println(Arrays.toString(alunosCadastradas.toArray()));
        } else {
            System.err.println("Não existem alunos cadastrados");
        }
    }

    public void cadastrarDisciplinas() {

        ler = new Scanner(System.in);
        System.out.println("digite o nome: \n");
        String nome = ler.next();
        System.out.println("digite a carga horária: \n");
        int cargaH = verifica();
        boolean verificar = false;
        int b = 0; // int para interromper a verifica��o do cadastro
        for (Disciplinas a : disciplinasCadastradas) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Disciplina já existe!");
                verificar = true;
                break;
            }
        }
        if (verificar == false) {
            Disciplinas disciplina = new Disciplinas(nome, cargaH);
            disciplinasCadastradas.add(disciplina);

            System.out.println("Disciplina criada!");
        }

    }

    public void excluirDisciplina() { //funncaoo para excluir disciplinas cadastradas de acordo com o nome
        ler = new Scanner(System.in);
        System.out.println("digite o nome da disciplina que deseja excluir");
        String nome = ler.next();

        for (int i = 0; i < disciplinasCadastradas.size(); i++) {
            if (disciplinasCadastradas.get(i).getNome().equals(nome)) {//pega o indice i do objeo pessoa, pega o id da pessoa e compara com o id da pessoa digitada
                disciplinasCadastradas.remove(i); //Remove a pessoa do tipo nome com o indice i
                System.err.println("Disciplina removida");
            }
        }
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas: \n");
        if (disciplinasCadastradas.size() > 0) {//caso não existam disciplinas cadastrados
            Iterator<Disciplinas> it = disciplinasCadastradas.iterator();
            while (it.hasNext()) { //Enquanto it "tem proximo", continue
                System.out.println(it.next().getNome() + "\n");
            }
        } else {
            System.err.println("Não existem disciplinas cadastradas");
        }

    }

    public void criarTurma() {
        int matricula;
        String nomeDis;
        System.out.println("Para criar uma turma, informe a matrícula do professor responsável:\n");
        listarProfesores();
        do {
            matricula = verifica();
            break;

        } while (true);
        if (profEx(matricula)) {  //se o professor responsável existir
            if (getProfMat(matricula).getSlotTurma1() == null) { // verifica se o primeiro 'slot' de disciplina do professor está vazio
                System.out.println("Informe a disciplina: ");
                listarDisciplinas();
                nomeDis = ler.next();
                if (existeDisci(nomeDis)) { //se a disciplina existir
                    System.out.println("digite o nome da turma: \n");
                    String nome = ler.next();
                    Turma turma;
                    turma = new Turma(getDisci(nomeDis), getProfMat(matricula), nome);
                    turmasCadastradas.add(turma); // adiciona turma
                    getProfMat(matricula).setSlotTurma1(turma);
                    System.out.println("Lista de alunos:"); // lista todos os alunos matriculados
                    listarAlunos();//fim do foreach
                    do {
                        System.out.println("Matricule ao menos 2 alunos. Digite a matricula: \n");
                        do {
                            matricula = verifica();
                            break;

                        } while (verificaAluno(matricula) == false);
                        turma.setAlunodaTurma(getPelaMat(matricula));
                    } while (turma.getAlunosDaTurma().size() < 2);
                    System.err.println("\n Turma criada \n");
                } else {    // se a disciplina não existir
                    System.out.println("Disciplina não existente.");
                }
            } else if (getProfMat(matricula).getSlotTurma2() == null) {    // verifica se o SEGUNDO 'slot' de disciplina do professor está vazio
                System.out.println("Digite a disciplina: ");
                listarDisciplinas();
                nomeDis = ler.nextLine();
                if (existeDisci(nomeDis)) { //se existir disciplina
                    System.out.println("digite o nome da turma: \n");
                    String nome = ler.next();
                    Turma turma = new Turma(getDisci(nomeDis), getProfMat(matricula), nome);
                    turmasCadastradas.add(turma);
                    getProfMat(matricula).setSlotTurma2(turma);
                    System.out.println("Lista de alunos:"); //para adicionar minimamente 2 alunos á turma de slot 2 do professor // lista todos os alunos matriculados
                    listarAlunos();
                    do {
                        System.out.println("\n Matricule ao menos 2 alunos. Digite a matricula:");
                        do {
                            do {
                                matricula = verifica();
                                break;

                            } while (true);
                        } while (verificaAluno(matricula) == false);
                        turma.setAlunodaTurma(getPelaMat(matricula));
                    } while (turma.getAlunosDaTurma().size() < 2);
                    System.err.println("\n Turma criada \n");
                } else {
                    System.out.println("Disciplina não existe.");
                }
            } else {
                System.out.println("Professor ja tem 2 disciplinas cadastradas");
            }
        } else {
            System.out.println("Professor não existe.");
        }
    }

    public boolean profEx(long mat) {
        // verifica se o professor existe
        return professoresCadastrados.stream().anyMatch((a) -> (a.getMatricula() == mat));
    }

    public Professor getProfMat(long mat) {//pegar matricula do professor
        for (Professor a : professoresCadastrados) {
            if (a.getMatricula() == mat) {
                return a;
            }
        }
        return null;
    }

    public boolean existeTurma(int id) {
        //verifica se a turma existe
        return turmasCadastradas.stream().anyMatch((a) -> (a.getId() == id));
    }

    public boolean existeDisci(String nome) {
        //Verificase a disciplina existe
        return disciplinasCadastradas.stream().anyMatch((a) -> (a.getNome().equalsIgnoreCase(nome)));
    }

    public Disciplinas getDisci(String nome) {  //pega a disciplina pelo nome
        for (Disciplinas a : disciplinasCadastradas) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    public boolean verificaAluno(long mat) {       //verifica se a matricula digitada está cadastrada no array de aalunos
        if (alunosCadastradas.stream().anyMatch((a) -> (a.getMatricula() == mat))) {
            return true;
        }
        System.out.println("Aluno não matrículado.");
        return false;
    }

    public Aluno getPelaMat(long mat) {     //verifica se a matricula digitada está cadastrada no array de aalunos
        for (Aluno a : alunosCadastradas) {
            if (a.getMatricula() == mat) {
                return a;
            }
        }
        return null;
    }

    public void excluirTurma() { //funncaoo para excluir turmas cadastradas de acordo com o nome
        ler = new Scanner(System.in);
        System.out.println("digite o nome da turma que deseja excluir");
        String nome = ler.next();
        if (turmasCadastradas.size() > 0) {//caso não existam turmas cadastrados
            for (int i = 0; i < turmasCadastradas.size(); i++) {
                if (turmasCadastradas.get(i).getNome().equals(nome)) {//pega o indice i do objeo pessoa, pega o id da pessoa e compara com o id da pessoa digitada
                    turmasCadastradas.remove(i); //Remove a pessoa do tipo nome com o indice i
                }
            }
        } else {
            System.err.println("Não existem turmas cadastrados");
        }
    }

    public void listarTurmas() {
        System.out.println("Turmas: \n");
        if (turmasCadastradas.size() > 0) {//caso não existam turmas cadastrados
            System.out.println(Arrays.toString(turmasCadastradas.toArray()));
        } else {
            System.err.println("Não existem turmas cadastrados");
        }

    }

    public void condicoes() {

        try {
            ler = new Scanner(System.in);
            String nome = ler.next();
        } catch (NumberFormatException e) {// ocorre se usuario digitar um valor que não seja numero
            System.err.println("Digite somente numeros.");
        }

    }

    public static int verifica() {
        boolean naoEInt = true;
        int valor = 0;
        while (naoEInt) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("=====================");
            try {
                valor = leitor.nextInt();
                naoEInt = false;
            } catch (Exception e) {
                System.out.println("Os dados digitados não são válidos!");
            }
        }
        return valor;
    }

    public void adicionaAlunoaTurma() { // adiciona aluno á turma

        ler = new Scanner(System.in);
        System.err.println("\n Digite o nome da turma \n ");
        listarTurmas();
        String nome = ler.next();
        System.err.println("\n Digite a matricula do aluno \n ");
        listarAlunos();
        long matricula;

        for (int i = 0; i < turmasCadastradas.size(); i++) {
            if (turmasCadastradas.get(i).getNome().equals(nome)) {
                do {
                    matricula = verifica();
                    break;

                } while (verificaAluno(matricula) == false);
                turmasCadastradas.get(i).setAlunodaTurma(getPelaMat(matricula));
            }
        }
    }

    public void adicionaNotaAluno() { //adiciona nota as disciplinas do aluno
        double[] notas = new double[2];
        double matAlu;
        String nomeDis;
        int j, a = 0, b = 0, c = 0, k;
        boolean testeAlu = true, testeDis = true, testeDis3 = false;
        System.err.println("\n Digite a matricula do aluno:\n");
        listarAlunos();
        matAlu = verifica();
        for (int i = 0; i < alunosCadastradas.size(); i++) {
            if (alunosCadastradas.get(i).getMatricula() == matAlu) {
                testeAlu = false;
                a = i;
            }
            System.err.println("\n Digite o nome da disciplina\n");
            listarDisciplinas();
            nomeDis = ler.next();
            for (j = 0; j < disciplinasCadastradas.size(); j++) {// le a disciplina do aluno
                if (disciplinasCadastradas.get(j).getNome().equals(nomeDis)) {//verifica se o aluno já está com nota nessa disciplina
                    testeDis = false;
                    b = j;
                }
            }

            if (alunosCadastradas.isEmpty()) {
                break;
            } else if (testeAlu) {
                System.err.println("\nNão existe aluno com essa matricula\n");
                break;
            } else if (disciplinasCadastradas.isEmpty()) {
                break;
            } else if (testeDis) {
                System.err.println("\nNão existe disciplina com esse id\n");
                break;
            } else if (alunosCadastradas.get(a).getHistorico().size() >= 3) { // verifica se o aluno j´está cadastrado em mais de 3 turmas
                System.err.println("\nO aluno já está cadastrado em 3 disciplinas\n");
                break;
            } else if (testeDis3) {
                System.out.println("\nO aluno já está cadastrado nessa disciplina\n");
                break;
            } else {
                idd();

                Historico historico = new Historico(disciplinasCadastradas.get(b), id);// cria o array de historico com as disciplinas cadastradas

                historicos.add(historico);

                if (alunosCadastradas.get(a).getHistorico1() == null) { //verifica se o slot 1 das disciplinas do aluno está vazia

                    alunosCadastradas.get(a).setHistorico1(historicos.get(0)); //pega o historico 0 do array de historicos e atribui a disciplina a ele

                    for (int d = 0; d < 2; d++) { //adicionar notas

                        System.err.println("\nDigite a " + d + "° nota\n");
                        notas[d] = ler.nextDouble();

                    }
                    historicos.get(0).setNotas(notas);

                    System.err.println("\nNotas cadastradas\n");

                    break;

                } else if (alunosCadastradas.get(a).getHistorico2() == null) { //verifica se o slot 2 das disciplinas do aluno está vazia

                    alunosCadastradas.get(a).setHistorico2(historicos.get(1));//pega o historico 1 do array de historicos e atribui a disciplina a ele

                    for (int d = 0; d < 2; d++) {//atribui notas

                        System.err.println("\nDigite a " + d + "° nota\n");
                        notas[d] = ler.nextDouble();

                    }
                    historicos.get(1).setNotas(notas);

                    System.err.println("\nNotas cadastradas\n");

                    break;
                } else if (alunosCadastradas.get(a).getHistorico3() == null) {//verifica se o slot 3 das disciplinas do aluno está vazia

                    alunosCadastradas.get(a).setHistorico3(historicos.get(2));//pega o historico 2 do array de historicos e atribui a disciplina a ele
                    for (int d = 0; d < 2; d++) {
                        int l = d + 1;
                        System.err.println("\nDigite a " + l + "° nota\n");
                        notas[d] = ler.nextDouble();

                    }
                    historicos.get(2).setNotas(notas); //atribuir notas
                    System.err.println("\n Notas cadastradas\n");

                    break;
                } else {
                    System.err.println("O aluno já tem notas em 3 disciplinas");
                }

            }

        }

    }

    public void mostrarNota() { //mostra nota do aluno
        int matAlu, a;
        String nome;
        System.err.println("\n Digite a matricula do aluno:\n");
        listarAlunos();
        matAlu = verifica();
        if (alunosCadastradas.isEmpty()) { // verifica se exietem alunos cadastrados
            System.err.println("\nNão existem alunos cadastrados\n");

        } else {

            for (int i = 0; i < alunosCadastradas.size(); i++) {
                if (alunosCadastradas.get(i).getMatricula() == matAlu) { // pega o aluno pela matricula pre digitada
                    a = i;
                    if (disciplinasCadastradas.isEmpty()) {//verifica se exietem disciplinas cadastradas
                        System.err.println("\n Não existem disciplinas cadastradas.\n");
                        break;
                    } else {
                        System.err.println("\n Digite a disciplina:\n");
                        listarDisciplinas();
                        nome = ler.next();
                        if (historicos.isEmpty()) { //verifica se existem disciplinas com notas cadastradas no historico
                            System.err.println("Não existem notas cadastradas");
                        } else {

                            for (Disciplinas disciplinasCadastrada : disciplinasCadastradas) {//roda todo os historicos
                                if (alunosCadastradas.get(a).GetHistoorico1(historicos.get(0).getDisciplina()).getNome().equals(nome)) { //verifica se o historico de slot 0 tem nota e pega as notas dele
                                    System.out.println("Nota 1: " + alunosCadastradas.get(a).getHistorico1().getNota1());
                                    System.out.println("Nota 2: " + alunosCadastradas.get(a).getHistorico1().getNota2());
                                    break;
                                } else if (alunosCadastradas.get(a).GetHistoorico2(historicos.get(1).getDisciplina()).getNome().equals(nome)) { //verifica se o historico de slot 1 tem nota e pega as notas dele
                                    System.out.println("Nota 1: " + alunosCadastradas.get(a).getHistorico2().getNota1());
                                    System.out.println("Nota 2: " + alunosCadastradas.get(a).getHistorico2().getNota2());
                                    break;
                                } else if (alunosCadastradas.get(a).GetHistoorico3(historicos.get(2).getDisciplina()).getNome().equals(nome)) { //verifica se o historico de slot 3 tem nota e pega as notas dele
                                    System.out.println("Nota 1: " + alunosCadastradas.get(a).getHistorico3().getNota1());
                                    System.out.println("Nota 2: " + alunosCadastradas.get(a).getHistorico3().getNota2());
                                    break;
                                } else {
                                    System.err.println("Disciplina não encontrada");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void mediaGeral() {//pega a media geral do aluno
        int matAlu, a;
        double media = 0;

        System.err.println("\n Digite a matricula do aluno:\n");
        listarAlunos();
        matAlu = verifica();
        if (!alunosCadastradas.isEmpty()) {//verifica se existem alunos cadastrados
            if (!historicos.isEmpty()) {//verifica se existem notas cadastradas
                for (int i = 0; i < alunosCadastradas.size(); i++) {
                    if (alunosCadastradas.get(i).getMatricula() == matAlu) {//pega o aluno com a matricula digitada
                        a = i;

                        if (alunosCadastradas.get(a).getHistorico1() != null) {// verifica se o slot 1 do histirico está vazio, se não estiver, pega as duas notas dele, soma, divide por 2 e atribui á variavel kkk
                            kkk = (alunosCadastradas.get(a).getHistorico1().getNota1() + alunosCadastradas.get(a).getHistorico1().getNota2()) / 2;
                            xd = 1; //contador para ver quantas disciplinas com notas estão cadastradas
                        }
                        if (alunosCadastradas.get(a).getHistorico2() != null) {// verifica se o slot 2 do histirico está vazio, se não estiver, pega as duas notas dele, soma, divide por 2 e atribui á variavel kkk1
                            kkk1 = (alunosCadastradas.get(a).getHistorico2().getNota1() + alunosCadastradas.get(a).getHistorico2().getNota2()) / 2;
                            xd1 = 1; // contador para ver quantas disciplinas com notas estao cadastradas

                        }
                        if (alunosCadastradas.get(a).getHistorico3() != null) {// verifica se o slot 3 do histirico está vazio, se não estiver, pega as duas notas dele, soma, divide por 2 e atribui á variavel kkk2
                            kkk2 = (alunosCadastradas.get(a).getHistorico3().getNota1() + alunosCadastradas.get(a).getHistorico3().getNota2()) / 2;
                            xd2 = 1; // contador para ver quantas disciplinas estao com notas cadastradas

                        }
                        System.err.println("\n Media geral: \n");
                        System.err.println((kkk + kkk1 + kkk2) / (xd + xd1 + xd2));// soma todas as medias de cada disciplina e divide pelo contados da quantidade de disciplinas com notas cadastradas
                    }
                }

            } else {
                System.err.println("não existem notas cadastradas");
            }

        }
        kkk = kkk1 = kkk2 = xd = xd1 = xd2 = 0;//zera os contadores

    }
}
