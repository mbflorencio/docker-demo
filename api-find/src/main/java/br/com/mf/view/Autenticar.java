package br.com.mf.view;

import lombok.Data;

@Data
public class Autenticar {
       private String usuario;
       private String Senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }
}
