package br.edu.iftm.decorator;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescricao() {        
        return beverage.getDescricao() + ", Mocha";
    }

    @Override
    public double cost(){
        return 0.20 + beverage.cost();
    }
    
}
