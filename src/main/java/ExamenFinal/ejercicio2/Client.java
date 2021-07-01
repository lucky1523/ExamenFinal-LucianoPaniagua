package ExamenFinal.ejercicio2;

public class Client {
    public static void main(String[]args){
        CaudraElectrica caudraElectrica = new CaudraElectrica();

        AdaptorCuadraElectrica cuadraElectricaAdapatada = new AdaptorCuadraElectrica(caudraElectrica);

        // aqui se puede ser al cuadratrack electrico adaptado y sus acciones
        System.out.println("Tipo cuadra: Electrica");
        cuadraElectricaAdapatada.llenarCombustible();
        cuadraElectricaAdapatada.estadoCombustible();
    }
}
