import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String args[]){
        String nome, endereco;
        int agencia, cpf, rg, telefone, op, cont = 1;
        double saldo;
        List<Cliente> lista = new ArrayList<>();

        JOptionPane.showMessageDialog(null, "Inserindo clientes", "Inserir", JOptionPane.INFORMATION_MESSAGE);
        while(true){
            JOptionPane.showMessageDialog(null, "Cliente " + cont, "Cliente " + cont, JOptionPane.INFORMATION_MESSAGE);
            nome = JOptionPane.showInputDialog(null, "Insira seu nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
            cpf = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu CPF:", "CPF", JOptionPane.QUESTION_MESSAGE));
            rg = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu RG:", "RG", JOptionPane.QUESTION_MESSAGE));
            endereco = JOptionPane.showInputDialog(null, "Insira seu endereço:", "Endereço", JOptionPane.QUESTION_MESSAGE);
            telefone = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu telefone:", "Telefone", JOptionPane.QUESTION_MESSAGE));
            agencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número da agência de sua preferência:", "Agência", JOptionPane.QUESTION_MESSAGE));
            
            Cliente cliente = new Cliente(nome, cpf, rg, endereco, telefone, agencia);
            JOptionPane.showMessageDialog(null, "Conta criada com sucesso!\nSeu saldo é de R$" + cliente.getSaldo(), "Saldo", JOptionPane.INFORMATION_MESSAGE);
            saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o seu saldo:", "Saldo", JOptionPane.QUESTION_MESSAGE));
            cliente.setSaldo(saldo);
            lista.add(cliente);
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja continuar inserindo? [1 - Sim / 2 - Não]", "Inserir mais", JOptionPane.QUESTION_MESSAGE));
            if(op == 2)
                break;
            cont++;
        }

        JOptionPane.showMessageDialog(null, "Saldos", "Saldos", JOptionPane.INFORMATION_MESSAGE);
        int n = lista.size();
        for(int i = 0; i < n; i++){   
            lista.get(i).Extrato();
        }
    }
}