public class FuncionarioHorista extends Funcionario{
    private int qtde_horas;

    public FuncionarioHorista(String nome, String sobrenome, int qtde_horas, double valor){ // Construtor
        super(nome, sobrenome, valor);
        this.qtde_horas = qtde_horas;
        setSalario();
    }

    public void setSalario(){ // Salário
        this.salario = qtde_horas * valor;
    }

public int getQtdeHoras(){ // Quantidade de horas trabalhadas
        return qtde_horas;
    }

    public String getDados(){ // Dados
        return "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome()
        + "\nQuantidade de horas trabalhadas: " + getQtdeHoras() + "\nSalário: R$" + getSalario() + "\n";
    }
}