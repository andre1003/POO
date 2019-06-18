import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa{
    private int cpf;

    public PessoaFisica(String nome, String endereco, int tel, String email, int cpf){
        super(nome, endereco, tel, email);
        this.cpf = cpf;
    }

    public int getDocumento(){
        return cpf;
    }

    public String getTipo(){
        return "Pessoa Física";
    }

    public void getDados(){
        JOptionPane.showMessageDialog(null, "Tipo: " + getTipo() + "\nNome: " + getNome() + 
        "\nEndereço: " + getEndereco() + "\nTelefone: " + getTel() + "\nE-mail: " + getEmail() + "\nRG: " + getDocumento(), "Dados"
        , JOptionPane.INFORMATION_MESSAGE);
    }
}