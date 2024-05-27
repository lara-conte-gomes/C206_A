package br.Funcionalidade;

import br.Funcionalidade.RedeSocial;
import br.RedesSociais.Exceções.ArquivoNaoEncontradoException;

import java.io.*;
import java.util.*;

public class Usuario {
    private String nome;
    private String email;
    Set<RedeSocial> redes = new HashSet<>();

    //Construtor
    public Usuario(RedeSocial[] redeSociais){
        for(RedeSocial redeSo : redeSociais){
            redes.add(redeSo);
        }
    }

    public void arquivo() throws ArquivoNaoEncontradoException{
        OutputStream fluxoSaida;
        OutputStreamWriter geradorFluxoSaida;
        BufferedWriter bufferSaida = null;
        String linha1_nome ;
        String linha_email;

        try {
            //Para testar a exceção, colocar o seguinte caminho no FileOutputStream -> "C://path/to/nonexistent/directory/Usuário.txt"
            //O que está abaixo, o caminho é verdadeiro e será guardada as informações no arquivo Usuário
            fluxoSaida = new FileOutputStream("C://Users//larac//IdeaProjects//EX2_Redes Sociais_Lara Conte Gomes//src//br//Funcionalidade//Usuário.txt");
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);
            linha1_nome = this.nome;
            linha_email = this.email;
            bufferSaida.write(linha1_nome);
            bufferSaida.write(" ");
            bufferSaida.write(linha_email);
            bufferSaida.write(" ");
            bufferSaida.newLine();

            System.out.println("Guardado com sucesso!");

        } catch (FileNotFoundException ex) {
            throw new ArquivoNaoEncontradoException("Arquivo não encontrado");
        } catch (IOException ex) {
            System.err.printf("IOExcpetion: %s.%n", ex);
        } finally {
            try {
                if (bufferSaida != null) {
                    bufferSaida.close();
                }
            } catch (IOException ex) {
                System.err.printf("IOException ao fechar recurso: %s.%n", ex);
            }
        }
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
