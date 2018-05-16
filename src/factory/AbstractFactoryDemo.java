package factory;

public class AbstractFactoryDemo {
    AbstractFactory factory;
    public AbstractFactoryDemo(AbstractFactory factory) {
        this.factory = factory;
    }
    
    public int createA() {
        return factory.createA();
    }
    
    public int createB() {
        return factory.createB();
    }
    
    public int createC() {
        return factory.createC();
    }
}
