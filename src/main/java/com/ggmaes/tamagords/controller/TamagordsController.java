package com.ggmaes.tamagords.controller;

import com.ggmaes.tamagords.model.Iniciais;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TamagordsController {

    @GetMapping("/init")
    public List<Iniciais> iniciais() {
        return List.of(
                new Iniciais().setNome("A").setGviceId(1).setUrl("https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png"),
                new Iniciais().setNome("B").setGviceId(4).setUrl("https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png"),
                new Iniciais().setNome("C").setGviceId(7).setUrl("https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png"));
    }
}
