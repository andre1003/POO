import javax.swing.JOptionPane;

public class Aluno{
    private String nome;
    private int n_matricula;
    private int idade;
    private String sexo;
    private String cidade;
    private int ano;
    private Disciplina disciplina;

    public Aluno(String nome, int n_matricula, int idade, String sexo, String cidade, int ano){ // Construtor da classe Aluno
        this.nome = nome;
        this.n_matricula = n_matricula;
        this.idade = idade;
        this.sexo = sexo;
        this.cidade = cidade;
        this.ano = ano;
    }

    public void setDisciplina(Disciplina disciplina){ // Método para vincular o aluno com a disciplina
        this.disciplina = disciplina;
    }

    public void dados(){ // Método para mostrar os dados de um aluno
        JOptionPane.showMessageDialog(null, "Aluno: " + nome
        + "\nNúmero de matrícula: " + n_matricula  + "\nIdade: " + idade + "\nSexo: " + sexo +
        "\nCidade de nascimento: " + cidade + "\nAno de ingresso: " + ano +
        "\n\nDisciplina: " + disciplina.getDisciplina() + "\nProfessor: " + disciplina.getProf() + 
        "\nNota 1: " + disciplina.getN1() + "\nNota 2: " + disciplina.getN2(), "Dados", JOptionPane.INFORMATION_MESSAGE);
    }

    public void media(){ // Pega a média e verifica se foi reprovado, está de exame ou aprovado
        double m = disciplina.media();

        if(m < 3.0) // Reprovado
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " foi reprovado.\nA média foi: " + m, "Reprovado!", JOptionPane.INFORMATION_MESSAGE);
        else if(m < 5.0) // Exame
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " está de exame.\nA média foi: " + m, "Exame!", JOptionPane.INFORMATION_MESSAGE);
        else // Aprovado
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " foi aprovado.\nA média foi: " + m, "Aprovado!", JOptionPane.INFORMATION_MESSAGE);
    }
}