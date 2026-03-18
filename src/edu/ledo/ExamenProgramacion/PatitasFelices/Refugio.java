package edu.ledo.ExamenProgramacion.PatitasFelices;

import java.util.ArrayList;
import java.util.Objects;

public class Refugio {
    private final int CAPACIDAD_MAXIMA = 5;
    private static ArrayList<Animal> listaAnimales;

    public Refugio(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public void admitirAnimal(Animal a) {
        if (listaAnimales.size() < CAPACIDAD_MAXIMA) {
            listaAnimales.add(a);
            System.out.println("Animal admitido con exito !!!");
        } else {
            System.out.println("Capacidad agotada: no se puede admitir al animal " + a.getNombre());
        }

    }

    public void mostrarAnimales() {
        for (Animal a : listaAnimales) {
            System.out.println(a.getNombre());
            System.out.println(a.getEdad());
            System.out.println(a.getChip());
        }
    }

    public void hacerConcierto() {
        for (Animal a : listaAnimales) {
            a.hacerSonido();
        }
    }


    public static ArrayList<Animal> buscarPorEspecie(Animal animalReferencia) {
        ArrayList<Animal> animalEspecie = new ArrayList<Animal>();
        for (Animal a : listaAnimales) {
            if (animalReferencia instanceof Perro && a instanceof Perro) {
                animalEspecie.add(a);
            } else if (animalReferencia instanceof Gato && a instanceof Gato) {
                animalEspecie.add(a);
            }
        }
        return animalEspecie;
        
    }
}