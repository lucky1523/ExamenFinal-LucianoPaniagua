package ExamenFinal.ejercicio3;

import java.util.ArrayList;

public class Client {
    public static void main(String[]args){
        ISistemaInscripcion colegio = new SistemaColegio(new Facebook());
        int[] estudiantes = new int[50];
        ((SistemaColegio) colegio).setNombre("Santa Ana");
        ((SistemaColegio) colegio).setCapacidad(100);
        ((SistemaColegio) colegio).setEstudiantes(estudiantes);
        ((SistemaColegio) colegio).setRequisitos("CI");
        colegio.nuevaRedSocial();

        ISistemaInscripcion escuela = new SistemaEscuela(new Whatsapp());
        int[] estudiantes2 = new int[100];
        ((SistemaEscuela) escuela).setNombre("San Ignacio");
        ((SistemaEscuela) escuela).setCapacidad(200);
        ((SistemaEscuela) escuela).setEstudiantes(estudiantes2);
        ((SistemaEscuela) escuela).setRequisitos("CI");
        escuela.nuevaRedSocial();

        ISistemaInscripcion universidad = new SistemaUniversidad(new Twitter());
        int[] estudiantes3 = new int[100];
        ((SistemaUniversidad) universidad).setNombre("San Calixto");
        ((SistemaUniversidad) universidad).setCapacidad(300);
        ((SistemaUniversidad) universidad).setEstudiantes(estudiantes3);
        ((SistemaUniversidad) universidad).setRequisitos("CI");
        universidad.nuevaRedSocial();

    }
}
