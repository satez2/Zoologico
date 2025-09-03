package sistemaAnimais;

public abstract class Animal {
    String nome;
    int idade;
    double peso;
    String habitat;

    public Animal(String nome, int idade, double peso, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.habitat = habitat;
    }

    public abstract String emitirSom();
    public abstract String alimentar();

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
}