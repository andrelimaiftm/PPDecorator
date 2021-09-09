package br.edu.iftm.decorator;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        this.descricao = "Café House Blend";
    }

    @Override
    public double cost() {        
        return 0.89;
    }
    
}
