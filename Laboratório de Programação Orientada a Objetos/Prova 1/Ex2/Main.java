import javax.swing.JOptionPane;

public class Main{
    public static void main(String args[]){
        int n1 = 0, n2 = 0, n3 = 0, op = 1, r;
        double res; // res deve ser double pois o resultado da divisão poder ser um número quebrado
        while(op != 0){ // Enquanto o usuário quiser
            r = 0; // limpar a variável de resultado int
            res = 0; // limpar a variável de resultado double
            // Opção
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo ao Paulinho's Calculator!\n1 - Somar 3 números" + 
            "\n2 - Subtrair 3 números\n3 - Multiplicar 3 números\n4 - Dividir 3 números\n0 - Sair do programa"
            , "Chose your weapon", JOptionPane.QUESTION_MESSAGE));
            
            if(op != 0){ // Se o usuário quiser continuar, lê 3 novos números, senão apenas sai do programa
                // N1
                n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira n1:", "N1", JOptionPane.INFORMATION_MESSAGE));

                // N2
                n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira n2:", "N2", JOptionPane.INFORMATION_MESSAGE));
    
                // N1
                n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira n3:", "N3", JOptionPane.INFORMATION_MESSAGE));
            }

            switch(op){ // Escolha das opções
                case 1: // Soma
                    Soma s = new Soma(n1, n2, n3);
                    r = s.somar();
                    JOptionPane.showMessageDialog(null, "A soma entre " + n1 + ", " + n2 + " e " + n3 + " é: " + r
                    , "Soma", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2: // Subtração
                    Subtracao sub = new Subtracao(n1, n2, n3);
                    r = sub.subtrair();
                    JOptionPane.showMessageDialog(null, "A subtração entre " + n1 + ", " + n2 + " e " + n3 + " é: " + r
                    , "Subtração", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3: // Multiplicação
                    Multiplicacao m = new Multiplicacao(n1, n2, n3);
                    r = m.multiplicar();
                    JOptionPane.showMessageDialog(null, "A multiplicação entre " + n1 + ", " + n2 + " e " + n3 + " é: " + r
                    , "Multiplicação", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 4: // Divisão
                    Divisao d = new Divisao(n1, n2, n3);
                    res = d.dividir();
                    JOptionPane.showMessageDialog(null, "A divisão entre " + n1 + ", " + n2 + " e " + n3 + " é: " + res
                    , "Divisão", JOptionPane.INFORMATION_MESSAGE);
                    break;
                
            }
        }
        JOptionPane.showMessageDialog(null, "Obrigado por usar o Paulinho's Calculator!", "Obrigado", JOptionPane.INFORMATION_MESSAGE);
    }
}