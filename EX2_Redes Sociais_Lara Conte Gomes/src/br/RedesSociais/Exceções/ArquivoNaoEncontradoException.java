package br.RedesSociais.Exceções;

import java.io.FileNotFoundException;

public class ArquivoNaoEncontradoException extends FileNotFoundException {
    public ArquivoNaoEncontradoException(String message){
        super(message);
    }
}
