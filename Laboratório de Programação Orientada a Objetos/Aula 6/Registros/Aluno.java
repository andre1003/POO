import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
    private int numMaterias;

    public Aluno(String nome, int idade, int numMaterias){
        super(nome, idade);
        this.numMaterias = numMaterias;
    }

    public int getNumMaterias(){
        return numMaterias;
    }

    public void getDados(){
        JOptionPane.showMessageDialog(null, "Aluno: " + getNome() + "\nIdade: " + getIdade() + 
        "\nNúmero de matérias: " + getNumMaterias(), "Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}