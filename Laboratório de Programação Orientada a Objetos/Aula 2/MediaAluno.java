import javax.swing.*;

public class MediaAluno{
    public static void main(String args[]){
        float n1 = 0, n2 = 0, media;
        try{ // Tenta executar as tarefas, se houver erro cairá no bloco catch
            n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a primeira nota:", "Notas", JOptionPane.QUESTION_MESSAGE)); // Tenta converter n1
            n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a segunda nota:", "Notas", JOptionPane.QUESTION_MESSAGE)); // Tenta converter n2
            media = (n1 + n2) / 2; // Calcula a média
            if(media < 3.0){ // Se a média for menor que 3 o aluno foi reprovado
                JOptionPane.showMessageDialog(null, "Você foi reprovado, troxa! Média: " + media, "Reprova", JOptionPane.ERROR_MESSAGE);
            }
            else if(media < 5.0){ // Se a média for maior que 3 mas menor que 5 o aluno está de recuperação
                JOptionPane.showMessageDialog(null, "Você está de recuperação, hehehe! Média: " + media, "Recuperação", JOptionPane.WARNING_MESSAGE);
            }
            else{ // Se a média for maior que 5 o alunos foi aprovado
                JOptionPane.showMessageDialog(null, "Você passou, espertinho hein?! Média: " + media, "Aprovado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(NumberFormatException e){ // Trata o erro de digitação de algun caracter
            JOptionPane.showMessageDialog(null, "Digita só número jamanta");
        }
    }
}