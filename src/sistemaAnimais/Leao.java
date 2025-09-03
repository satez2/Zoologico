package sistemaAnimais;

public class Leao extends Animal {
    double tamanhoJuba;

    public Leao(String nome, int idade, double peso, String habitat, double tamanhoJuba) {
        super(nome, idade, peso, habitat);
        this.tamanhoJuba = tamanhoJuba;
    }

    @Override
    public String emitirSom() {
        return "Rugido";
    }

    @Override
    public String alimentar() {
        return "carne";
    }
}