package com.example.model;

public record Carta(int numero, Naipe naipe) {

    public String imagePath(){
        return "classic-cards/" +numero+this.naipe+".png";
    }

}
