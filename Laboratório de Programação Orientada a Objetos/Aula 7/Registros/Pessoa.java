public abstract class Pessoa{
    private String nome;
    private int idade;
    private int id;

    public Pessoa(String nome, int idade){ // Construtor
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){ // Método para alterar o nome
        this.nome = nome;
    }

    public void setIdade(int idade){ // Método para alterar a idade
        this.idade = idade;
    }

    public void criarId(int id){ // Método para criar o ID
        this.id = id;
    }

    public String getNome(){ // método para retornar o nome
        return nome;
    }

    public int getIdade(){ // Método para retornar a idade
        return idade;
    }

    public abstract void getDados(); // Método abstrato para formatar os dados
}