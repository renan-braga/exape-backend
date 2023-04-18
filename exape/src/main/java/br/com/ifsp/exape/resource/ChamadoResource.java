package br.com.ifsp.exape.resource;

import br.com.ifsp.exape.model.Chamado;
import br.com.ifsp.exape.service.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin("*")
@RestController
@RequestMapping("/chamado")
public class ChamadoResource {

    @Autowired
    private ChamadoService chamadoService;

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(chamadoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Chamado> create(@RequestBody Chamado chamado){
        chamadoService.create(chamado);
        return ResponseEntity.created(
                        ServletUriComponentsBuilder
                                .fromCurrentRequest()
                                .path("{/id}")
                                .buildAndExpand(chamado.getId())
                                .toUri())
                .build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Chamado> update(@PathVariable Long id, @RequestBody Chamado chamado){
        Chamado newChamado = chamadoService.update(id, chamado);
        return ResponseEntity.ok().body(newChamado);
    }
}
