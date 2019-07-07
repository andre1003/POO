public class Funcionario{
    private String nome;
    private int idade;
    private double salario;
    private String tipo;
    private String marcarReuniao;

    public Funcionario(String nome, int idade, double salario, String tipo, double bonus){ // Construtor
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        calcularSalario(salario, bonus);
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

    public void setTipo(String tipo){ // Método set para o tipo de funcionário
        this.tipo = tipo;
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

    public String getTipo(){ // Método get para o tipo de funcionário
        return tipo;
    }

    private void calcularSalario(double salario, double bonus){ // Método para calcular o salário
        salario += bonus;
        setSalario(salario);
    }

    public void marcar(){
        marcarReuniao = "Solicitada";
    }

    public String getDados(){ // Retorna os dados
        return "Tipo de Funionário: " + getTipo() + "\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nSalário: R$" + getSalario(); 
    }

    public String notaFiscal(){
        return "Tipo de Funcionário: " + getTipo() + "\nNome: " + getNome() + "\nSalário: R$" + getSalario();
    }

}