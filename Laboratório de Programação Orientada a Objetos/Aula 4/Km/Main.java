import  javax.swing.JOptionPane;
// FALTA O TRY-CATCH
public class Main{
    public static void main(String args[]){
        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "Nome", JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?", "Idade", JOptionPane.QUESTION_MESSAGE));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a sua altura?", "Altura", JOptionPane.QUESTION_MESSAGE));
        double passada = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o comprimento da sua passada (em metros)?", "Passada", JOptionPane.QUESTION_MESSAGE));
        Pessoa p = new Pessoa(nome, idade, altura, passada);
        p.setKm(Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos km você andou?", "Quilômetros", JOptionPane.QUESTION_MESSAGE)));
        JOptionPane.showMessageDialog(null, "Parabéns " + p.getNome() + "!" + "\nVocê deu " + p.Passos() + " passos!", "Passos", JOptionPane.INFORMATION_MESSAGE);
    }
}