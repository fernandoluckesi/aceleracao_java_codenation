package br.com.curso.disciplinas;

import br.com.curso.alunos.Aluno;
import br.com.curso.professor.Professor;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    private static final byte LIMITE = 10;

    public void matricular(Aluno aluno) throws LimiteALunosAlcancadoException {
        if(this.alunos.size() < LIMITE) {
            this.alunos.add(aluno);
        } else {
            throw new LimiteALunosAlcancadoException("Limite de alunos alcançados. O limite é: " + LIMITE);
        }
    }

    public void mostrarAlunos() {
        this.alunos.stream().forEach(aluno -> System.out.println(aluno.getNome()));
    }
}
