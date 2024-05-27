package br.Funcionalidade;

import br.Funcionalidade.Compartilhamento;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo(){
        System.out.println("Postou um vídeo no GooglePlus");
    }

    @Override
    public void postarComentario(){
        System.out.println("Postou um comentário no GooglePlus!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no Google Plus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Algo no Google Plus está sendo compartilhado!");
    }
}
