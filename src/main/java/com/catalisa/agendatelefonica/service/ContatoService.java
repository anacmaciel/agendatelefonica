package com.catalisa.agendatelefonica.service;

import com.catalisa.agendatelefonica.model.ContatoModel;
import com.catalisa.agendatelefonica.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public List<ContatoModel> buscarTodos() {
        return contatoRepository.findAll();
    }

    public Optional<ContatoModel> buscarEspecifico(Long indice) {

        return contatoRepository.findById(indice);
    }

    public ContatoModel cadastrar(ContatoModel contatoModel) {
        contatoModel.getIndice();
        contatoModel.getNome();
        contatoModel.getNumeroDeTelefone();
        return contatoRepository.save(contatoModel);
    }


    public ContatoModel alterar(ContatoModel contatoModel) {

        contatoModel.getIndice();
        contatoModel.getNome();
        contatoModel.getNumeroDeTelefone();
        return contatoRepository.save(contatoModel);
    }

    public void deletar(Long indice) {
        contatoRepository.deleteById(indice);
    }
}

