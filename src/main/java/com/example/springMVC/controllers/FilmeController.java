package com.example.springMVC.controllers;

import com.example.springMVC.models.Filme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmeController {

    private List<Filme> filmes = List.of(
            new Filme("Capitã Marvel", "O filme conta a história...", "Ficção Científica", "2019", "2h 4min"),
            new Filme("Doutor Estranho", "O filme conta a história...", "Ficção Científica", "2016", "1h 55min"),
            new Filme("Guardiões da Galáxia Vol. 2", "O filme conta a história...", "Ficção Científica", "2017", "2h 17min")
    );

    @GetMapping("/filmes")
    public List<Filme> getFilmes(){
        return filmes;
    }
}