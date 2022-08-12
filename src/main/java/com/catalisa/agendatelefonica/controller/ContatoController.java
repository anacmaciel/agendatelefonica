package com.catalisa.agendatelefonica.controller;

import com.catalisa.agendatelefonica.model.ContatoModel;
import com.catalisa.agendatelefonica.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping(path = "/agendatelefonica")
    public List<ContatoModel> buscarTodosContatos() {
        return contatoService.buscarTodos();
    }

    @GetMapping(path = "/agendatelefonica/{indice}")
    public Optional<ContatoModel> buscarContatoPorIndice(@PathVariable Long indice) {
        return contatoService.buscarEspecifico(indice);
    }

    @PostMapping(path = "/agendatelefonica")
    @ResponseStatus(HttpStatus.CREATED)
    public ContatoModel cadastrarContato(@RequestBody ContatoModel contatoModel) {
        return contatoService.cadastrar(contatoModel);
    }

    @PutMapping(path = "/agendatelefonica/{indice}")
    public ContatoModel alterarContato(@RequestBody ContatoModel contatoModel) {
        return contatoService.alterar(contatoModel);
    }

    @DeleteMapping(path = "/agendatelefonica/{indice}")
    public void deletarContato(@PathVariable Long indice) {
        contatoService.deletar(indice);
    }
}

