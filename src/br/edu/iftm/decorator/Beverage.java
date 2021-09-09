package br.edu.iftm.decorator;

public abstract class Beverage {
    String descricao = "Bebidad Desconhecida";

    public String getDescricao(){
        return this.descricao;
    }

    public abstract double cost();
    
}
