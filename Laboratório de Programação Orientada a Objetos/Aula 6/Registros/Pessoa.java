import javax.swing.JOptionPane;

public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void getDados(){
        JOptionPane.showMessageDialog(null, "Aluno: " + getNome() + "\nIdade: " + getIdade(),
         "Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}