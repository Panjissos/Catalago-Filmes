package com.lead.catalagofilmes.services;

import com.lead.catalagofilmes.models.Filme;
import com.lead.catalagofilmes.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> findAll(){
        return filmeRepository.findAll();
    }

    public Filme findById(Long id){
        Optional<Filme> obg = filmeRepository.findById(id);
        return obg.get();
    }

}
