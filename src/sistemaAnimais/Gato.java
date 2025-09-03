package sistemaAnimais;

public class Gato extends Animal {
    String cor;

    public Gato(String nome, int idade, double peso, String habitat, String cor) {
        super(nome, idade, peso, habitat);
        this.cor = cor;
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }

    @Override
    public String alimentar() {
        return "ração de gato";
    }
}