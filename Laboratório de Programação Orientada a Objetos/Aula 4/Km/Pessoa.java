public class Pessoa{
	private String nome;
	private int idade;
	private double altura;
	private double passada;
	private double km;
	private double passo;

	public void Pessoa(String nome, int idade, double altura){ // Construtor
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		if(peso <= 80.0)
			this.passada = altura - (peso / 100);
		else
			this.passada = altura - 0.2;
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

	public double Passos(){ // Conta os passos
		passo = km / passada;
		return passo;
	}
}