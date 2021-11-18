package com.lead.catalagofilmes;

import java.util.HashMap;
import java.util.List;


public class Categoria {

    private HashMap<String ,Filme> listaFilmes = new HashMap<>();
    private List<String> idiomas;
    private String nome;
    private String tag;


    public void AdicionaFilmesCategoria(String categoria, Filme filme){
        listaFilmes.put(categoria, filme);
    }

    public void Mostra(){
        for (String i : listaFilmes.keySet()) {
            System.out.println(listaFilmes.get(i).getNome());
            System.out.println(listaFilmes.get(i).getSinopse());
        }
    }
    /*
    public void PesquisaPorNome(String nome){
        for (Filme i : listaFilmes.keySet()) {
            if (i.getNome().equals(nome)){
                System.out.println(i.getNome());
            }
        }
    }*/

    public void Categorias(String categoria){
        System.out.println(listaFilmes.get(categoria).getSinopse());

    }

}
