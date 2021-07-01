package Visitor.basic;

public class ConcreteVisitante implements IVisit {

    //AKI VAN LOS ALGORITMOS CRACK
    @Override
    public void visit(ElementConcrete1 elementConcrete1) {
        System.out.println("************ Algoritmo **********");
        System.out.println("Para el concrete element 1 ");
    }

    @Override
    public void visit(ElementConcrete2 elementConcrete2) {
        System.out.println("************ Algoritmo **********");
        System.out.println("Para el concrete element 2 ");
    }

    @Override
    public void visit(ElementConcrete3 elementConcrete3) {
        System.out.println("************ Algoritmo **********");
        System.out.println("Para el concrete element 3 ");
    }
}
