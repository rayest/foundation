package cn.rayest.object;

/**
 * Created by Rayest on 2016/7/16 0016.
 */
class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}

abstract class Pizza{
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}

class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("preparing pizza...");
    }

    @Override
    public void bake() {
        System.out.println("baking pizza...");
    }

    @Override
    public void cut() {
        System.out.println("cutting pizza...");
    }

    @Override
    public void box() {
        System.out.println("boxing pizza...");
    }
}

class PizzaStore{

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}

public class TestPizzaFactory{
    public static void main(String[] args) {
        /*
           PizzaStore pizzaStore = new PizzaStore();
           pizzaStore.orderPizza("cheese");

        */
    }
}