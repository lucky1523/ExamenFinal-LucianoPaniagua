package Adapter.basic;

public class ConcreteObject {
    //ADAPTEE
    public void metodoA(){
        System.out.println("INF> concrete object > metodo A");
    }

    public int metodoB(){
        System.out.println("INF> concrete object > metodo B");
        return 0;
    }

    public String metodoC(){
        System.out.println("INF> concrete object > metodo C");
        return "";
    }
    public String metodoD(){
        System.out.println("INF> concrete object > metodo D");
        return "";
    }



}
