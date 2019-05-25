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
        try{
            while(true){
                // Mensagem de qual cliente está sendo cadastrado
                JOptionPane.showMessageDialog(null, "Cliente " + cont, "Cliente " + cont, JOptionPane.INFORMATION_MESSAGE);
                
                // Nome
                nome = JOptionPane.showInputDialog(null, "Insira seu nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
                
                // CPF
                cpf = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu CPF:", "CPF", JOptionPane.QUESTION_MESSAGE));
                
                // RG
                rg = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu RG:", "RG", JOptionPane.QUESTION_MESSAGE));
                
                // Endereço
                endereco = JOptionPane.showInputDialog(null, "Insira seu endereço:", "Endereço", JOptionPane.QUESTION_MESSAGE);
                
                // Telefone
                telefone = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu telefone:", "Telefone", JOptionPane.QUESTION_MESSAGE));
                
                // Agência
                agencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número da agência de sua preferência:", "Agência", JOptionPane.QUESTION_MESSAGE));
                
                // Criar o objeto cliente
                Cliente cliente = new Cliente(nome, cpf, rg, endereco, telefone, agencia);
                
                // Saldo
                saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o seu saldo:", "Saldo", JOptionPane.QUESTION_MESSAGE));
                cliente.setSaldo(saldo); // Seta o saldo

                // Adiciona o cliente na lista de clientes
                lista.add(cliente);
    
                // Continuar ou parar
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja continuar inserindo? [1 - Sim / 2 - Não]", "Inserir mais", JOptionPane.QUESTION_MESSAGE));
                if(op == 2) // Se a opção for 2 (não) para de inserir novos elementos
                    break;
                cont++; // Apenas para saber qual é o cliente que está sendo inserido
            }

            // Mensagem que serão exibidos os saldos
            JOptionPane.showMessageDialog(null, "Saldos", "Saldos", JOptionPane.INFORMATION_MESSAGE);
            int n = lista.size(); // Pega quantos clientes estão cadastrados
            for(int i = 0; i < n; i++){
                lista.get(i).extrato(); // Chama a função que produz o extrato de cada cliente
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Insira somente números!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}