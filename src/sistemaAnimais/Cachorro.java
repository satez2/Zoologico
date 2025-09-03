package sistemaAnimais;

public class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, int idade, double peso, String habitat, String raca) {
        super(nome, idade, peso, habitat);
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "Latido";
    }

    @Override
    public String alimentar() {
        return "ração";
    }
}