import javax.swing.JOptionPane;

public class Divisao{
    public static void main(String args[]){
        int n1 = 0, n2 = 0;
        float r;
        try{
            n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n1:"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n2:"));
            r = n1 / n2;
            JOptionPane.showMessageDialog(null, "Divisão: " + r);
        }
        catch(ArithmeticException erro){
            JOptionPane.showMessageDialog(null, "Divisão por 0!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
}