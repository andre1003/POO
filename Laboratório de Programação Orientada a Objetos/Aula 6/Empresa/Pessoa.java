public abstract class Pessoa{
    private String nome;
    private String endereco;
    private int tel;
    private String email;

    public Pessoa(String nome, String endereco, int tel, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.tel = tel;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public int getTel(){
        return tel;
    }

    public String getEmail(){
        return email;
    }

    public void getDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + 
        "\nEndereço: " + getEndereco() + "\nTelefone: " + getTel() + "\nE-mail: " + getEmail(), "Dados"
        , JOptionPane.INFORMATION_MESSAGE);
    }

    public abstract String getTipo();
    public abstract int getDocumento();
}