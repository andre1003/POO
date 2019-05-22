import javax.swing.JOptionPane;

public class Cliente{
    private String nome;
    private int cpf;
    private int rg;
    private String endereco;
    private int telefone;
    private Conta conta = new Conta();

    public Cliente(String nome, int cpf, int rg, String endereco, int telefone, int agencia){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        conta.CriarConta(agencia);
    }

    public void setSaldo(double saldo){
        conta.setSaldo(saldo);
    }

    public double getSaldo(){
        return conta.getSaldo();
    }

    public void Extrato(){
        JOptionPane.showMessageDialog(null, "Cliente: " + nome + "\nCPF: " + cpf + "\nRG: " 
        + rg + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nNúmero da conta: " + conta.getNumConta() 
        + "\nAgência: " + conta.getNumAgencia() + "\nSaldo: " + getSaldo(), "Extrato", JOptionPane.INFORMATION_MESSAGE);
    }
}