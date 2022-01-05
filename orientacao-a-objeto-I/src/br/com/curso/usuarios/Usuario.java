package br.com.curso.usuarios;

import br.com.curso.alunos.ValidationException;

public class Usuario {

    private String login;
    private String cpf;
    private String nome;

    public Usuario(String login, String cpf, String nome) throws ValidationException {
        setNome(nome);
        setLogin(login);
        setCpf(cpf);
    }

    public String getLogin() {
        return login;
    }

    public void setCpf(String cpf) throws ValidationException {
        if(validateCpf(cpf)) {
            this.cpf = cpf;
        } else {
            throw new ValidationException("CPF inválido");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setLogin(String login) throws ValidationException {
        if(validateLogin(login)) {
            this.login = login;
        } else {
            throw new ValidationException("Login inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private boolean validateLogin(String login) {
        return login != null && !login.isEmpty() && login.length() < 20 && login.length() > 3;
    }

    private boolean validateCpf(String cpf) {
        return cpf != null && !cpf.isEmpty() && (cpf.length() == 11 || cpf.length() == 14);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
