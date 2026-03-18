package edu.ledo.ExamenProgramacion.PatitasFelices;

public class Gato extends Animal {
    private boolean esCazador;

    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau");
    }

    public Gato(String nombre, int edad, String chip, boolean esCazador) {
        super(nombre, edad, chip);
        this.esCazador = esCazador;
    }

}
