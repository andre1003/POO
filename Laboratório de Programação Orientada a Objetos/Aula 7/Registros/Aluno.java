import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
    private int numMaterias;
    private int id;

    public Aluno(String nome, int idade, int numMaterias){ // Construtor
        super(nome, idade);
        this.numMaterias = numMaterias;
    }
    
    public void criarId(int id){ // Método para criar o ID
        String aux = Integer.toString(id); // Converte o id para string para conferir se possui 8 dígitos
        while(aux.length() != 8){ // Enquanto não houver 8 dígitos insere novamente
            id = Integer.parseInt(JOptionPane.showInputDialog(null, "O ID não possui 8 dígitos. Digite novamente:", "8 dígitos", JOptionPane.WARNING_MESSAGE));
            aux = Integer.toString(id);
        }
        this.id = id;
    }

    public int getNumMaterias(){ // Método para retornar o número de matérias
        return numMaterias;
    }

    public int getId(){ // Método para retornar o ID
        return id;
    }

    public void getDados(){ // Método para retornar os dados do aluno
        JOptionPane.showMessageDialog(null, "ID: " + getId() + "\nAluno: " + getNome() + "\nIdade: " + getIdade() + 
        "\nNúmero de matérias: " + getNumMaterias(), "Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}