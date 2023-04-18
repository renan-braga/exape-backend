package br.com.ifsp.exape.resource;

import br.com.ifsp.exape.model.Chamado;
import br.com.ifsp.exape.model.Interacao;
import br.com.ifsp.exape.service.InteracaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin("*")
@RestController
@RequestMapping("/interacao")
public class InteracaoResource {

    @Autowired
    private InteracaoService interacaoService;

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(interacaoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Interacao> create(@RequestBody Interacao interacao){
        interacaoService.create(interacao);
        return ResponseEntity.created(
                        ServletUriComponentsBuilder
                                .fromCurrentRequest()
                                .path("{/id}")
                                .buildAndExpand(interacao.getId())
                                .toUri())
                .build();
    }

}
