public class FuncionarioComissionado extends Funcionario{
    private int qtde_produtos;

    public FuncionarioComissionado(String nome, String sobrenome, int qtde_produtos, double valor){ // Construtor
        super(nome, sobrenome, valor);
        this.qtde_produtos = qtde_produtos;
        setSalario();
    }

    public void setSalario(){ // Salário
        this.salario = qtde_produtos * valor;
    }

    public int getQtdeProdutos(){ // Quantidade de produtos vendidos
        return qtde_produtos;
    }

    public String getDados(){ // Dados
        return "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome()
        + "\nQuantidade de produtos vendidos: " + getQtdeProdutos() + "\nSalário: R$" + getSalario() + "\n";
    }
}