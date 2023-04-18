package br.com.ifsp.exape.service;

import br.com.ifsp.exape.model.Chamado;
import br.com.ifsp.exape.repository.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChamadoService {

    @Autowired
    private ChamadoRepository chamadoRepository;

    public Optional<Chamado> findById(Long id) {
        return chamadoRepository.findById(id);
    }

    public void create(Chamado chamado) {
        chamadoRepository.save(chamado);
    }

    public Chamado update(Long id, Chamado chamado) {
        Chamado chamadoById = findById(id).orElse(chamado);
        chamadoById.setDescricao(chamado.getDescricao());
        chamadoById.setDataCriacao(chamado.getDataCriacao());
        chamadoById.setStatus(chamado.getStatus());
        chamadoById.setTitulo(chamado.getTitulo());
        chamadoById.setUsuario(chamado.getUsuario());
        return chamadoRepository.save(chamadoById);
    }
}
