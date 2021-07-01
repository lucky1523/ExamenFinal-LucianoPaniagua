package Visitor.ejemplo;

public class Client {
    public static void main(String[]args){
        Perro perro= new Perro();
        perro.setNombre("firulais");
        perro.setEdad(10);
        Gato gato= new Gato();
        gato.setNombre("gar");
        gato.setEdad(3);
        Caballo caballo= new Caballo();
        caballo.setNombre("juan");
        caballo.setEdad(5);

        VeterinarioE1 veterinarioE1 = new VeterinarioE1();
        //Enfermedad 1
        perro.accept(veterinarioE1);
        gato.accept(veterinarioE1);
        caballo.accept(veterinarioE1);

        VeterinarioE2 veterinarioE2= new VeterinarioE2();
        //Enfermedad 2
        perro.accept(veterinarioE2);
        gato.accept(veterinarioE2);
        caballo.accept(veterinarioE2);

    }
}
