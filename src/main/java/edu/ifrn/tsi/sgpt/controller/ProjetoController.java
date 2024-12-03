package edu.ifrn.tsi.sgpt.controller;

import java.net.URI;

import edu.ifrn.tsi.sgpt.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import edu.ifrn.tsi.sgpt.domain.projeto.Projeto;
import edu.ifrn.tsi.sgpt.repository.ProjetoRepository;

import jakarta.transaction.Transactional;


@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    
    @Autowired
    private ProjetoRepository projetoRepository;
    @Autowired
    private ProjetoService projetoService;


    @PostMapping
    @Transactional
    public ResponseEntity<URI> cadastrarProjeto(@RequestBody Projeto projeto, 
                    UriComponentsBuilder uriComponentsBuilder){
        projetoRepository.save(projeto);
        URI uri = uriComponentsBuilder.path("/projetos/{id}").buildAndExpand(
            projeto.getId()).toUri();
        projetoService.cadastrarProjeto(projeto);
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/{id}")   
    public ResponseEntity<Projeto> detalharProjeto(@PathVariable("id") Long id){
        var projeto = projetoRepository.getReferenceById(id);
        return ResponseEntity.ok(projeto);
    }

    @GetMapping
    public ResponseEntity<Page<Projeto>> listarProjetos(@PageableDefault(size=20, sort = {"nome"})Pageable paginacao){
        var projetos = projetoRepository.findAll(paginacao);
        return ResponseEntity.ok(projetos);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Object> deletarProjetos(@PathVariable("id") Long id){
        projetoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity<Projeto> atualizarProjeto(@PathVariable("id") Long id, @RequestBody Projeto projeto){
        var projetoAtualizado = projetoRepository.getReferenceById(projeto.getId());
        projetoAtualizado.setNome(projeto.getNome());
        return ResponseEntity.ok(projetoAtualizado);
    }
    
}
