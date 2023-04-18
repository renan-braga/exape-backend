package br.com.ifsp.exape.service;

import br.com.ifsp.exape.model.*;
import br.com.ifsp.exape.repository.ChamadoRepository;
import br.com.ifsp.exape.repository.InteracaoRepository;
import br.com.ifsp.exape.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class DBService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private InteracaoRepository interacaoRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public void instanciarBaseDeDados() throws ParseException {
        Usuario usuario = new Usuario(1L,"renan", "renan123", "Renan Braga", "renan@ifsp.edu.br", Papel.ANALISTA);
        Chamado chamado = new Chamado(1L, "10/10/2022", "Pane geral", "Nada Funciona", usuario, Status.NOVO);
        Interacao interacao = new Interacao(1L, chamado.getStatus().getDescricao(), "16000000", "fazendo atribuicao", chamado, usuario);

        usuarioRepository.save(usuario);
        chamadoRepository.save(chamado);
        interacaoRepository.save(interacao);

    }

}
