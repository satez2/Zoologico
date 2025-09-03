package sistemaAnimais;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Rex", 5, 20.0, "Casa", "Labrador"));
        animais.add(new Gato("Mimi", 3, 5.0, "Casa", "Branco"));
        animais.add(new Leao("Simba", 7, 190.0, "Savana", 1.2));

        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Som: " + animal.emitirSom());
            System.out.println("Alimento: " + animal.alimentar());
            System.out.println("-------------------------");
        }
    }
}