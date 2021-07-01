package Adapter.basic;

public class ConcreteAdapter2 implements IAdapter{
    @Override
    public void metodo1() {
        System.out.println("INF> concreteadapter 2 metodo 1");
    }

    @Override
    public String metodo2() {
        System.out.println("INF> concreteadapter 2 metodo 2");
        return null;
    }

    @Override
    public int metodo3() {
        System.out.println("INF> concreteadapter 2 metodo 3");
        return 0;
    }
}
