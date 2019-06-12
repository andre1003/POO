import javax.swing.JOptionPane;

public class Professor extends Pessoa{
    private String materia;

    public Professor(String nome, int idade, String materia){
        super(nome, idade);
        this.materia = materia;
    }

    public String getMateria(){
        return materia;
    }

    public void getDados(){
        JOptionPane.showMessageDialog(null, "Professor: " + getNome() + "\nIdade: " + getIdade() +
        "\nMatéria: " + getMateria(), "Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}