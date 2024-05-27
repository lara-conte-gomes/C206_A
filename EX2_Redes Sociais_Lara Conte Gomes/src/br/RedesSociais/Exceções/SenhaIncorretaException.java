package br.RedesSociais.Exceções;

public class SenhaIncorretaException extends NumberFormatException{
    public SenhaIncorretaException(String message){
        super(message);
    }
}
