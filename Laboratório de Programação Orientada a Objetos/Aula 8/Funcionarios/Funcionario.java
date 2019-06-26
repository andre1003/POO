public abstract class Funcionario{
    private String nome;
    private String sobrenome;
    protected double salario;
    protected double valor;

    public Funcionario(String nome, String sobrenome, double valor){ // Construtor
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.valor = valor;
    }

    public void setSalario(int qtde){ // insere salário
        this.salario = qtde * valor;
    }

    public String getNome(){ // Nome
        return nome;
    }

    public String getSobrenome(){ // Sobrenome
        return sobrenome;
    }

    public double getSalario(){ // retorna salário
        return salario;
    }

    public abstract String getDados(); // Para as classes herdadas
}