package edu.ledo.ExamenProgramacion.PatitasFelices;

public class Animal {
    private String nombre;
    private int edad;
    private String chip;

    //final
    public Animal(String nombre, int edad, String chip) {
        this.nombre = nombre;
        this.edad = edad;
        this.chip = chip;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getChip() {
        return chip;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("El animal emite un sonido generico");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", chip='" + chip + '\'' +
                '}';
    }

    public static int calcularEdadHumana(int edadAnimal) {
        return edadAnimal = edadAnimal * 7;
    }

}
