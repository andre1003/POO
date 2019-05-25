import java.util.InputMismatchException;
import  javax.swing.JOptionPane;

public class Main{
    public static void main(String args[]){
        String nome;
        int idade = 0;
        double altura = 0.0;
        double passada = 0.0;
        
        try{
            // Inserir o nome
            nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "Nome", JOptionPane.QUESTION_MESSAGE);

            // Inserir a idade
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?", "Idade", JOptionPane.QUESTION_MESSAGE));

            // Inserir a altura
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a sua altura?", "Altura", JOptionPane.QUESTION_MESSAGE));
            
            // Inserir o tamanho da passada
            passada = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o comprimento da sua passada (em metros)?", "Passada", JOptionPane.QUESTION_MESSAGE));
            
            // Cria o objeto p com base nos dados inseridos
            Pessoa p = new Pessoa(nome, idade, altura, passada);

            // Insere o quantidade de quilômetros andados
            p.setKm(Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos km você andou?", "Quilômetros", JOptionPane.QUESTION_MESSAGE)));
            
            // Mostra a quantidade de passos que foram dados
            JOptionPane.showMessageDialog(null, "Parabéns " + p.getNome() + "!" + "\nVocê deu " 
            + p.Passos() + " passos tendo " + p.getIdade() + " e " + p.getAltura() + " de altura!\nVocê é o bixão!", "Passos", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException e){ // Caso seja inserido caracteres ao invés de números
            JOptionPane.showMessageDialog(null, "Insira somente números", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
}