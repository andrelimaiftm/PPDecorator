package br.edu.iftm.decorator;

public class Decaf extends Beverage{
    public Decaf(){
        this.descricao = "Café Descafeinado (Decaf)";
    }

    @Override
    public double cost() {        
        return 1.05;
    }
    
}
