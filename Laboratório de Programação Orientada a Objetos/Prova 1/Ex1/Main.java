import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        List<Aluno> lista = new ArrayList<>(); // Lista de alunos
        String nome, sexo, cidade, disciplina, prof;
        int n_matricula, idade, ano, id, op = 0;
        double n1, n2;

        JOptionPane.showMessageDialog(null, "Cadastros de nerds da Computação da UNESP de São José do Rio Preto", "Cadastro dos nerdões", JOptionPane.INFORMATION_MESSAGE);
        while(op != 1){ // Enquanto o usuário quiser
            // Nome
            nome = JOptionPane.showInputDialog(null, "Insira seu nome:", "Nome", JOptionPane.INFORMATION_MESSAGE);

            // Sexo
            sexo = JOptionPane.showInputDialog(null, "Insira o sexo: ", "Sexo", JOptionPane.INFORMATION_MESSAGE);

            // Cidade
            cidade = JOptionPane.showInputDialog(null, "Insira a cidade de nascimento: ", "Cidade de nascimento", JOptionPane.INFORMATION_MESSAGE);

            // Número de matrícula
            n_matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número de matrícula: ", "Número de matrícula", JOptionPane.INFORMATION_MESSAGE));

            // Idade
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade: ", "Idade", JOptionPane.INFORMATION_MESSAGE));

            // Ano de ingresso
            ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano de ingresso: ", "Ano de ingresso", JOptionPane.INFORMATION_MESSAGE));

            Aluno a = new Aluno(nome, n_matricula, idade, sexo, cidade, ano); // Cria o objeto aluno

            // Disciplina
            disciplina = JOptionPane.showInputDialog(null, "Insira a disciplina que está cursando:", "Matéria", JOptionPane.INFORMATION_MESSAGE);

            // Professor
            prof = JOptionPane.showInputDialog(null, "Insira o professor que está ministrando:", "Professor", JOptionPane.INFORMATION_MESSAGE);

            // Identificador
            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o identificador da matéria: ", "ID", JOptionPane.INFORMATION_MESSAGE));

            // N1
            n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota 1: ", "Nota 1", JOptionPane.INFORMATION_MESSAGE));

            // N2
            n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota 2: ", "Nota 2", JOptionPane.INFORMATION_MESSAGE));

            Disciplina d = new Disciplina(disciplina, id, prof, n1, n2); // Cria o objeto disciplina

            a.setDisciplina(d); // Liga o aluno com a disciplina

            lista.add(a); // Adiciona na lista

            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja continuar?\n0 - Sim\n1 - Não", "Continuar ou não, eis a questão", JOptionPane.QUESTION_MESSAGE)); // Pergunta se quer continuar
        }

        int n = lista.size(); // Pega o tamanho da lista para o for
        for(int i = 0; i < n; i++){
            Aluno aux = lista.get(i); // Pega o aluno na posição i da lista 
            aux.dados(); // Mostra os dados de cada aluno
            aux.media(); // Mostra a média junto com a situação final de cada aluno 
        }
    }
}