package com.ggmaes.tamagords.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Iniciais {
    private String nome;
    private int gviceId;
    private String url;
}
