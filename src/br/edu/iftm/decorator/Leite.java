package br.edu.iftm.decorator;

public class Leite extends CondimentDecorator{
    Beverage beverage;

    public Leite(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescricao() {        
        return beverage.getDescricao() + ", Leite";
    }

    @Override
    public double cost(){
        return 0.10 + beverage.cost();
    }    
}
