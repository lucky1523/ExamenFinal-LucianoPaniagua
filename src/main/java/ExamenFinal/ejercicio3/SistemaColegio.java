package ExamenFinal.ejercicio3;

import java.util.ArrayList;

public class SistemaColegio implements ISistemaInscripcion{
    private IRedSocial redSocial;
    private String nombre;
    private int capacidad;
    private int estudiantes[];
    private String requisitos;

    public SistemaColegio(){

    }
    @Override
    public void nuevaRedSocial() {
        System.out.println("Agregando... ");
    }
}
