public class Pessoa{
	private String nome;
	private int idade;
	private double altura;
	private double passada;
	private double km;
	private double passo;

	public Pessoa(String nome, int idade, double altura, double passada){ // Construtor
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.passada = passada;
	}

	public void setPassada(double passada){ // Define a passada
		this.passada = passada;
	}

	public void setKm(double km){ // Define a quilômetragem
		this.km = km;
	}

	public double getPassada(){ // Acessa o valor de passada
		return this.passada;
	}

	public String getNome(){
		return this.nome;
	}

	public double Passos(){ // Conta os passos
		passo = km / passada;
		return passo;
	}
}