package Decorator.basic;

public class DecoratorConcrete2 extends Decorator {
    private String attribute1;
    private int attribute2;

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }



    public DecoratorConcrete2(Component component) {
        super(component);
    }
    @Override
    public void operation(){
        super.operation();
        //agregando funcionalidad}
        this.attribute1="nueva funcionalidad";
        this.attribute2=1;

        System.out.println("agregando funcionalidad (decorator concrete 2)");
    }
}
