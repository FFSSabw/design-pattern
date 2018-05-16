package factory;

/**
 * @author fssaw
 *工厂方法
 *也可以称为模板方法
 *由子类来决定方法(createSomething())详细做什么(how)
 *把变化的部分抽象出来由子类实现以此来实现解耦
 */
public abstract class FactoryMethod {
    
    public void doSomething() {
        //dosomething
        createSomething();
    }
    public abstract void createSomething();
}
