package br.com.curso.coordenador;

import br.com.curso.alunos.ValidationException;
import br.com.curso.usuarios.Usuario;

public class Coordenador extends Usuario {

    private long matricula;

    public Coordenador(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }


    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
}
