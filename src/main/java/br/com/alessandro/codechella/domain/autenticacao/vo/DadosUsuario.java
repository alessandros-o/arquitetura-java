package br.com.alessandro.codechella.domain.autenticacao.vo;

import br.com.alessandro.codechella.domain.autenticacao.entity.Usuario;

import java.time.LocalDate;

public record DadosUsuario(Long id, String nome, String cpf, String email, LocalDate dataNascimento) {

    public DadosUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getCpf(), usuario.getEmail(), usuario.getDataNascimento());
    }

}
