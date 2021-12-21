package com.lead.catalagofilmes.services;

import com.lead.catalagofilmes.models.Idioma;
import com.lead.catalagofilmes.repository.IdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdiomaService {

    @Autowired
    private IdiomaRepository idiomaRepository;

    public List<Idioma> findAll(){
        return idiomaRepository.findAll();
    }

    public Optional<Idioma> findById(Long id){
        return idiomaRepository.findById(id);
    }

    public Idioma save(Idioma idioma){
        return idiomaRepository.save(idioma);
    }

    public void deleteById(Long id){
        idiomaRepository.deleteById(id);
    }

    public Idioma update(Idioma obj){
        Idioma newObj = idiomaRepository.getById(obj.getId());
        newObj.setNome(obj.getNome());
        newObj.setTag(obj.getTag());
        return idiomaRepository.save(newObj);
    }

    public boolean verificaServiceIdioma(Long id){
        return idiomaRepository.existsById(id);
    }




}
