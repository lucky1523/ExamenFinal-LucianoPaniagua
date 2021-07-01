package Bridge.basic;

public class ConcreteImplementorA implements Implementor{
    @Override
    public void operation1() {
        System.out.println("Concrete implementor A -> operation 1");
    }

    @Override
    public String operation2() {
        System.out.println("Concrete implementor A -> operation 2");
        return null;
    }

    @Override
    public int operation3() {
        System.out.println("Concrete implementor A -> operation 3");
        return 0;
    }
}
