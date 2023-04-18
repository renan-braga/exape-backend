package br.com.ifsp.exape.service;

import br.com.ifsp.exape.model.Interacao;
import br.com.ifsp.exape.repository.InteracaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InteracaoService {

    @Autowired
    private InteracaoRepository interacaoRepository;

    public Optional<Interacao> findById(Long id) {
        return interacaoRepository.findById(id);
    }

    public void create(Interacao interacao) {
        interacaoRepository.save(interacao);
    }
}
