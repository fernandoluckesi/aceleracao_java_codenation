package br.com.curso.professor;

import br.com.curso.usuarios.Usuario;
import br.com.curso.alunos.ValidationException;

public class Professor extends Usuario {


    public Professor(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }
}
