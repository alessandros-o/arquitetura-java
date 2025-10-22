package br.com.alessandro.codechella.domain.evento.repository;

import br.com.alessandro.codechella.domain.autenticacao.entity.Usuario;
import br.com.alessandro.codechella.domain.evento.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {

    List<Compra> findAllByUsuario(Usuario usuario);

}
