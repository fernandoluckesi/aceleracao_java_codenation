package br.com.curso.lancadorNotas;

import br.com.curso.usuarios.Usuario;
import br.com.curso.usuarios.UsuarioAutorizavel;

public class LancadorNotas {

    public void login(UsuarioAutorizavel usuarioAutorizavel) {
        boolean temAuth = usuarioAutorizavel.temAutorizacao();
        if(temAuth) {
            System.out.println("Usuario tem autorização");
        } else {
            System.out.println("Não possui autorização");
        }
    }
}

