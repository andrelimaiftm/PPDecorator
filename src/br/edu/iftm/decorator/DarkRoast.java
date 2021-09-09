package br.edu.iftm.decorator;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        this.descricao = "Café Dark Roast";
    }

    @Override
    public double cost() {        
        return 0.99;
    }
}
