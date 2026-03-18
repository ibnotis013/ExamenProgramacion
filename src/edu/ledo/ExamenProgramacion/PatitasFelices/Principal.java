package edu.ledo.ExamenProgramacion.PatitasFelices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    static void main() {
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        Refugio refugio = new Refugio(listaAnimales);
        ArrayList<Animal> listaAnimalesMirados = new ArrayList<>();

        Perro perro1 = new Perro("Pablo", 7, "chip1", "pitbull");
        Gato gato1 = new Gato("lucas", 5, "Chip2", true);
        Perro perro2 = new Perro("roberto", 2, "chip3", "Caniche");
        Gato gato2 = new Gato("Bombon", 8, "Chip4", false);
        Perro perro3 = new Perro("Ezequiel", 3, "chip5", "Mariposa");
        Gato gato3 = new Gato("Maxi", 4, "Chip6", true);

        refugio.admitirAnimal(perro1);
        refugio.admitirAnimal(gato1);
        refugio.admitirAnimal(perro2);
        refugio.admitirAnimal(gato2);
        refugio.admitirAnimal(perro3);
        refugio.admitirAnimal(gato3);

        refugio.hacerConcierto();
        System.out.println(Refugio.buscarPorEspecie(perro1));
        System.out.println(Animal.calcularEdadHumana(perro1.getEdad()));


    }
}
