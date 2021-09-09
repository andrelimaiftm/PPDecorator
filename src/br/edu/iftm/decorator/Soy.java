package br.edu.iftm.decorator;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescricao() {        
        return beverage.getDescricao() + ", Leite de Soja";
    }

    @Override
    public double cost(){
        return 0.15+ beverage.cost();
    }
    
}
