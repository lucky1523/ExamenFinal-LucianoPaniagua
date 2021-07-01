package Bridge.basic;

public class ConcreteImplementorB implements Implementor{
    @Override
    public void operation1() {
        System.out.println("Concrete implementor B -> operation 1");
    }

    @Override
    public String operation2() {
        System.out.println("Concrete implementor B -> operation 2");
        return null;
    }

    @Override
    public int operation3() {
        System.out.println("Concrete implementor B -> operation 3");
        return 0;
    }
}
