package br.edu.iftm.decorator;

public class Expresso extends Beverage{
    public Expresso(){
        this.descricao = "Café Expresso";
    }


    @Override
    public double cost() {        
        return 1.99;
    }
    
}
