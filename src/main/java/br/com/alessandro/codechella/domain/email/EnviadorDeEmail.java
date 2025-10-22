package br.com.alessandro.codechella.domain.email;

public interface EnviadorDeEmail {

    void enviar(String destinatario, String assunto, String mensagem);

}
