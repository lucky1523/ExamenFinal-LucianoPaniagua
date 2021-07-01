package Visitor.ejemplo;

import java.util.Date;

public class VeterinarioE2 implements IDoctorAnimales{
    @Override
    public void recetandoMedicina(Perro perro) {
        System.out.println("cura la enfermedad numero 2");
        System.out.println(new Date().toString());
    }

    @Override
    public void recetandoMedicina(Caballo caballo) {
        System.out.println("cura la enfermedad numero 2");
        System.out.println(new Date().toString());
    }

    @Override
    public void recetandoMedicina(Gato gato) {
        System.out.println("cura la enfermedad numero 2");
        System.out.println(new Date().toString());
    }
}
