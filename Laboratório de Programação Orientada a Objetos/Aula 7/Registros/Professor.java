import javax.swing.JOptionPane;

public class Professor extends Pessoa{
    private String materia;
    private String id;

    public Professor(String nome, int idade, String materia){ // Construtor
        super(nome, idade);
        this.materia = materia;
    }
    
    public void criarId(String dep, int n){ // Método para criar o ID
        String aux = Integer.toString(n); // Converte n para ver se possui 3 dígitos
        while(aux.length() != 3){ // Enquanto não houver 3 dígitos insere novamente
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "O ID não possui 3 dígitos. Digite novamente:",
            "3 dígitos", JOptionPane.WARNING_MESSAGE));
            aux = Integer.toString(n);
        }
        id = dep + getMateria() + aux; // Formata o ID
    }

    public String getMateria(){ // Método para retornar a matéria
        return materia;
    }   

    public String getId(){ // Método para retornar o ID
        return id;
    }

    public void getDados(){ // Método para retornar os dados formatados
        JOptionPane.showMessageDialog(null, "Id: " + getId() + "\nProfessor: " + getNome() + "\nIdade: " + getIdade() +
        "\nMatéria: " + getMateria(), "Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}