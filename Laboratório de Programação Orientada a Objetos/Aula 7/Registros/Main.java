import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        String nome, materia, dep;
        String[] opcoes = {"Aluno", "Professor"}; // Opções de inserções
        String[] fim = {"Continuar", "Parar"}; // Opções de paradas
        int idade, numMaterias, op, id;
        Aluno a;
        Professor p;
        List<Pessoa> lista = new ArrayList<>();
        try{ // Para evitar de inserir letra no lugar de número
            while(true){
                op = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Aluno ou Professor"
                , JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                
                if(op == 0){ // Aluno
                    JOptionPane.showMessageDialog(null, "Cadastrando aluno", "Aluno", JOptionPane.INFORMATION_MESSAGE);
                    nome = JOptionPane.showInputDialog(null, "Nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
                    idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:", "Idade", JOptionPane.QUESTION_MESSAGE));
                    numMaterias = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas matérias você faz:"
                    , "Número de matérias", JOptionPane.QUESTION_MESSAGE));
                    a = new Aluno(nome, idade, numMaterias); // Cria o aluno
                    id = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ID com extamente 8 dígitos:"
                    , "ID de 8 dígitos!", JOptionPane.QUESTION_MESSAGE));
                    a.criarId(id); // Cria o ID
                    lista.add(a); // Adiciona na lista
                }
                else{ // Professor
                    JOptionPane.showMessageDialog(null, "Cadastrando professor", "Professor", JOptionPane.INFORMATION_MESSAGE);
                    nome = JOptionPane.showInputDialog(null, "Nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
                    idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:", "Idade", JOptionPane.QUESTION_MESSAGE));
                    materia = JOptionPane.showInputDialog(null, "Matéria:", "Matéria", JOptionPane.QUESTION_MESSAGE);
                    p = new Professor(nome, idade, materia); // Cria o professor
                    dep = JOptionPane.showInputDialog(null, "Insira a sigla do departamento:", "Departamento",
                    JOptionPane.QUESTION_MESSAGE);
                    id = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira exatamente 3 números:",
                    "3 dígitos", JOptionPane.QUESTION_MESSAGE));
                    p.criarId(dep, id); // Cria o ID
                    lista.add(p); // Adiciona na lista
                }
    
                op = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Continuar ou Parar"
                , JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, fim, fim[0]);
                if(op == 1) // Se a opção for igual a parar
                    break;
            }
        }
        catch(NumberFormatException e){ // Caso insira uma letra em um int
            JOptionPane.showMessageDialog(null, "Você inseriu uma letra no lugar de número. Acho que crashou...",
            "CRASHOU!!!!", JOptionPane.ERROR_MESSAGE);
        }

        int n = lista.size(); // Tamanho da lista
        for(int i = 0; i < n; i++){
            lista.get(i).getDados(); // Imprime os dados
        }
    }
}