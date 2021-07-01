package Bridge.basic;

public class ConcreteAbstraction implements IAbtraction{
    private Implementor implementor= new ConcreteImplementorA();

    public ConcreteAbstraction(Implementor implementor){
        this.implementor=implementor;

    }

    @Override
    public void metodo1() {
        System.out.println("Concrete Abstraction -> metodo 1");
        implementor.operation1();
        implementor.operation2();
        implementor.operation3();
    }

    @Override
    public void metodo2() {
        System.out.println("Concrete Abstraction -> metodo 2");
        implementor.operation1();
        implementor.operation2();
        implementor.operation3();
    }
}
