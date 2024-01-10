package com.ggmaes.tamagords.model;

import lombok.Data;

@Data
public class Tamagords {
    private Long id;
    private int str;
    private int agi;
    private int vit;
    private int ints;
    private int wis;
    private int cha;
    private String nome;
    private int gviceId;
    private boolean shiny;
    private Long exp;

    public int getLevel() {
        return exp.intValue(); //TODO criar funcao que diz o level baseado na xp
    }
}
