package br.com.curso.alunos;

import br.com.curso.usuarios.Usuario;

public class Aluno extends Usuario {

    public Aluno(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }

    private Integer numeroMatricula;

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }


}
