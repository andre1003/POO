import javax.swing.JOptionPane;
import java.util.*;

public class Main{
    public static void main(String args[]){
        String nome, endereco, email;
        String[] opcoes = {"Pessoa Física", "Pessoa Jurídica"};
        String[] fim = {"Continuar", "Parar"};
        int tel, cpf, cnpj, op;
        PessoaFisica pf;
        PessoaJuridica pj;
        List<Pessoa> lista = new ArrayList<>();

        while(true){
            op = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Tipo de pessoa"
            , JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
            
            nome = JOptionPane.showInputDialog(null, "Nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
            endereco = JOptionPane.showInputDialog(null, "Endereço:", "Endereço", JOptionPane.QUESTION_MESSAGE);
            email = JOptionPane.showInputDialog(null, "E-mail:", "E-mail", JOptionPane.QUESTION_MESSAGE);
            tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Telefone:", "Telefone", JOptionPane.QUESTION_MESSAGE));
            if(op == 0){ // Pessoa física      
                cpf = Integer.parseInt(JOptionPane.showInputDialog(null, "CPF:", "CPF", JOptionPane.QUESTION_MESSAGE));
                pf = new PessoaFisica(nome, endereco, tel, email, cpf);
                lista.add(pf);
            }
            else{
                cnpj = Integer.parseInt(JOptionPane.showInputDialog(null, "CNPJ:", "CNPJ", JOptionPane.QUESTION_MESSAGE));
                pj = new PessoaJuridica(nome, endereco, tel, email, cnpj);
                lista.add(pj);
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