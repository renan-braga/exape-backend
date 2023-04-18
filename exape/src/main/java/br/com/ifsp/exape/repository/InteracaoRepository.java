package br.com.ifsp.exape.repository;

import br.com.ifsp.exape.model.Interacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InteracaoRepository extends JpaRepository<Interacao, Long> {
}
