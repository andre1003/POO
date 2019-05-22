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
        sucesso();
    }

    public void setSaldo(double saldo){
        conta.setSaldo(saldo);
    }

    public void extrato(){
        JOptionPane.showMessageDialog(null, "Cliente: " + nome + "\nCPF: " + cpf + "\nRG: " 
        + rg + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nNúmero da conta: " + conta.getNumConta() 
        + "\nAgência: " + conta.getNumAgencia() + "\nSaldo: " + conta.getSaldo(), "Extrato", JOptionPane.INFORMATION_MESSAGE);
    }

    private void sucesso(){
        JOptionPane.showMessageDialog(null, "Conta criada com sucesso!" 
        + "\nNome: " + nome + "\nNúmero da conta: " + conta.getNumConta() 
        + "\nAgência: " + conta.getNumAgencia() + "\nSeu saldo é de R$" + conta.getSaldo(), "Saldo", JOptionPane.INFORMATION_MESSAGE);
    }
}