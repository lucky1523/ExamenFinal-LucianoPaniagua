package Bridge.basic;

public class Client {
    public static void main(String[]args){
        ConcreteAbstraction concreteAbstraction= new ConcreteAbstraction(new ConcreteImplementorB());
        concreteAbstraction.metodo1();
        concreteAbstraction.metodo2();
    }
}
