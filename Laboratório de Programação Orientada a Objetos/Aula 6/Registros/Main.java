import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        String nome, materia;
        String[] opcoes = {"Aluno", "Professor"};
        String[] fim = {"Continuar", "Parar"};
        int idade, numMaterias, op;
        Aluno a;
        Professor p;
        List<Pessoa> lista = new ArrayList<>();
        while(true){
            op = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Aluno ou Professor"
            , JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            if(op == 0){
                JOptionPane.showMessageDialog(null, "Cadastrando aluno", "Aluno", JOptionPane.INFORMATION_MESSAGE);
                nome = JOptionPane.showInputDialog(null, "Nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:", "Idade", JOptionPane.QUESTION_MESSAGE));
                numMaterias = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas matérias você faz:"
                , "Número de matérias", JOptionPane.QUESTION_MESSAGE));
                a = new Aluno(nome, idade, numMaterias);
                lista.add(a);
            }
            else{
                JOptionPane.showMessageDialog(null, "Cadastrando professor", "Professor", JOptionPane.INFORMATION_MESSAGE);
                nome = JOptionPane.showInputDialog(null, "Nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:", "Idade", JOptionPane.QUESTION_MESSAGE));
                materia = JOptionPane.showInputDialog(null, "Matéria:", "Matéria", JOptionPane.QUESTION_MESSAGE);
                p = new Professor(nome, idade, materia);
                lista.add(p);
            }

            op = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Aluno ou Professor"
            , JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, fim, fim[0]);
            if(op == 1)
                break;
        }

        int n = lista.size();
        for(int i = 0; i < n; i++){
            lista.get(i).getDados();
        }
    }
}