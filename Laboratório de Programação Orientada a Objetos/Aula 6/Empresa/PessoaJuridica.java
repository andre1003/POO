import javax.swing.JOptionPane;

public class PessoaJuridica extends Pessoa{
    private int cnpj;

    public PessoaJuridica(String nome, String endereco, int tel, String email, int cnpj){
        super(nome, endereco, tel, email);
        this.cnpj = cnpj;
    }

    public int getDocumento(){
        return cnpj;
    }

    public String getTipo(){
        return "Pessoa Jurídica";
    }

    public void getDados(){
        JOptionPane.showMessageDialog(null, "Tipo: " + getTipo() + "\nNome: " + getNome() + 
        "\nEndereço: " + getEndereco() + "\nTelefone: " + getTel() + "\nE-mail: " + getEmail() + "\nCNPJ: " + getDocumento(), "Dados"
        , JOptionPane.INFORMATION_MESSAGE);
    }
}