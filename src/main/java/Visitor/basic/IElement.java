package Visitor.basic;

public interface IElement {
    String metodo1();
    int metodo2();
    void metodo3();

    //agregar accpet
    void accept(IVisit visitante);
}
