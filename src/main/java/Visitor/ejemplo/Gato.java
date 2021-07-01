package Visitor.ejemplo;

public class Gato implements IAnimal{
   private int edad;
   private String nombre;
   private boolean hasVaccine;
   private String color;
    private String raza;

    public Gato(){}

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHasVaccine() {
        return hasVaccine;
    }

    public void setHasVaccine(boolean hasVaccine) {
        this.hasVaccine = hasVaccine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void accept(IDoctorAnimales veterinario) {
        veterinario.recetandoMedicina(this);
    }
}
