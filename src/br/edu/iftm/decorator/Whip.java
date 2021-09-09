package br.edu.iftm.decorator;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescricao() {        
        return beverage.getDescricao() + ", Whip";
    }

    @Override
    public double cost() {        
        return 0.10 + beverage.cost();
    }

    
    
}
