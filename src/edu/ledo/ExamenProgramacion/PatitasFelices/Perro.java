package edu.ledo.ExamenProgramacion.PatitasFelices;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, String chip, String raza) {
        super(nombre, edad, chip);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau");
    }
}


