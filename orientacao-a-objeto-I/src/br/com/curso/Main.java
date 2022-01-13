package br.com.curso;

import br.com.curso.alunos.Aluno;
import br.com.curso.alunos.ValidationException;
import br.com.curso.coordenador.Coordenador;
import br.com.curso.credito.AnalisadorCredito;
import br.com.curso.credito.externo.Pessoa;
import br.com.curso.disciplinas.Disciplina;
import br.com.curso.disciplinas.LimiteALunosAlcancadoException;
import br.com.curso.lancadorNotas.LancadorNotas;
import br.com.curso.professor.Professor;
import br.com.curso.usuarios.UsuarioAutorizavel;

import java.util.Arrays;

public class Main {

    public static  void main(String[] args) throws Exception {
        Arrays.stream(Pessoa.class.getDeclaredMethods()).forEach(method -> System.out.println(method.getReturnType()));

    }

    public  static Pessoa getPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pessoa Teste");
        pessoa.setCpf("422.759.378-62");
        pessoa.setQtdChequesDevolvidos(0);
        pessoa.setScoreSCPC(500);
        pessoa.setScoreSerasa(500);
        pessoa.setValorDivida(1000);
        return pessoa;
    }
}
