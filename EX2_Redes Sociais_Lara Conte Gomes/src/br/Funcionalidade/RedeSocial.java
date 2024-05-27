package br.Funcionalidade;

import br.RedesSociais.Exceções.SenhaIncorretaException;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    //Método para verificar se a senha possui apenas números
    public void verificaSenha(String senha) throws SenhaIncorretaException {
        if(!senha.matches("\\d+"))//verifica se a senha possui apenas números
        {
            throw new SenhaIncorretaException("A senha deve conter apenas números");
        }
    }

    //Métodos Abstratos
    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    //Método não Abstrato
    public void curtirPublicacao(){
        System.out.println("Uma publicação está sendo curtida!");
    }

    //SETTERS
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNumAmigos (int numAmigos) {
        this.numAmigos = numAmigos;
    }

    //GETTER
    public int getNumAmigos() {
        return numAmigos;
    }
}
