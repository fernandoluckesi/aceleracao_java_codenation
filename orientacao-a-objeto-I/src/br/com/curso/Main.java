package br.com.curso;

import br.com.curso.alunos.Aluno;
import br.com.curso.alunos.ValidationException;
import br.com.curso.disciplinas.Disciplina;
import br.com.curso.disciplinas.LimiteALunosAlcancadoException;
import br.com.curso.professor.Professor;

public class Main {

    public static  void main(String[] args) throws Exception {
        try {
            Professor professor = new Professor("professor", "42275937862", "fernando luck");
            Aluno aluno = new Aluno("aluno", "42275937895", "ferfa");
            Disciplina disciplina = new Disciplina("Matematica", professor);
            disciplina.matricular(aluno);
            disciplina.mostrarAlunos();
        } catch(ValidationException | LimiteALunosAlcancadoException e) {
            System.out.println(e.getMessage());
        }

    }
}
