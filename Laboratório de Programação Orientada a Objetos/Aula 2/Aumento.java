import javax.swing.*;

public class Aumento{
    public static void main(String args[]){
        double salario = 0, salario_aumento;
        try{
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira seus temers:", "Dinheiro", JOptionPane.QUESTION_MESSAGE));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite números!");
        }
        
        if(salario <= 1500){
            salario_aumento = salario * 1.2;
        }
        else{
            salario_aumento = salario * 1.1;
        }
        JOptionPane.showMessageDialog(null, "Seu novo salário é R$" + salario_aumento, "Novo salário", JOptionPane.INFORMATION_MESSAGE);

        int op = 0;
        if(salario_aumento > 2000 && salario_aumento <= 3000){
            op = 1;
        }
        else if(salario_aumento > 3000 && salario_aumento <= 4000){
            op = 2;
        }
        else if(salario_aumento > 4000 && salario_aumento <= 5000){
            op = 3;
        }
        else if(salario_aumento > 5000){
            op = 4;
        }

        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null, "Estou pronto! Promoção!! 1 aninho a mais nessa joça!", "Promoção 1", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Estou pronto, estou pronto! Promoçããão!! 2 aninhos a mais!", "Promoção 2", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Estou pronto, estou pronto! Promoçããão!! Estou pronto, estou pronto! Promoçããão!! 3 aninhos a mais, se ferrou!", "Promoção 3", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "HÁ!! Se ferrou, foi demitido!", "Demissão", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nada", "Nada", JOptionPane.PLAIN_MESSAGE);
        }
    }
}