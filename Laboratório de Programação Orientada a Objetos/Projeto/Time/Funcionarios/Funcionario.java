public abstract class Funcionario{
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario){ // Construtor
        this.nome = nome;
        this.idade = idade;
        setSalario(salario);
    }

    public void setNome(String nome){ // Método set para o nome
        this.nome = nome;
    }

    public void setIdade(int idade){ // Método set para a idade
        this.idade = idade;
    }

    public void setSalario(double salario){ // Método set para o salário
        this.salario = salario;
    }

    public String getNome(){ // Método get para o nome
        return nome;
    }

    public int getIdade(){ // Método get para a idade
        return idade;
    }

    public double getSalario(){ // Método get para o salário
        return salario;
    }
}