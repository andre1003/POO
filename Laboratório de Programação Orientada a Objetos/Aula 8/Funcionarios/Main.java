import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        FuncionarioComissionado fc;
        FuncionarioHorista fh;
        int qtde, op, total_prod = 0, total_hora = 0;
        double valor_hora, valor_produto, salario_total = 0;
        String[] opcoes = {"Comissionado", "Horista"};
        String[] parar = {"Continuar", "Parar"};
        String nome, sobrenome, dados = "";
        List<Funcionario> lista = new ArrayList<>();
        
        // Valor da hora
        valor_hora = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da hora trabalhada?",
        "Hora", JOptionPane.QUESTION_MESSAGE));
        
        // Valor do produto
        valor_produto = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do produto?",
        "Produto", JOptionPane.QUESTION_MESSAGE));

        while(true){
            // Seleciona qual tipo deseja inserir
            op = JOptionPane.showOptionDialog(null, "Selecione o tipo de funcionário", "Funcionário", JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
            
            // Nome
            nome = JOptionPane.showInputDialog(null, "Insira o nome: ", "Nome", JOptionPane.QUESTION_MESSAGE);

            // Sobrenome
            sobrenome = JOptionPane.showInputDialog(null, "Insira o sobrenome: ", "Sobrenome", JOptionPane.QUESTION_MESSAGE);

            if(op == 0){ // Comissionado
                // Quantidade de produtos vendidos
                qtde = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de produtos vendidos:", "Produtos",
                JOptionPane.QUESTION_MESSAGE));

                total_prod += qtde; // Total de produtos vendidos
                
                fc = new FuncionarioComissionado(nome, sobrenome, qtde, valor_produto); // Cria o funcionário comissionado
                lista.add(fc); // Adiciona na lista
            }
            else{ // Horista
                // Quantidade de horas trabalhadas
                qtde = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de horas trabalhadas:", "Horas",
                JOptionPane.QUESTION_MESSAGE));

                total_hora += qtde; // Total de horas trabalhadas

                fh = new FuncionarioHorista(nome, sobrenome, qtde, valor_hora); // Cria o funcionário horista
                lista.add(fh); // Adiciona na lista
            }

            // Continuar ou para
            op = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Continuar ou Parar", JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE, null, parar, parar[0]);
            if(op == 1)
                break;
        }

        int n = lista.size();
        for(int i = 0; i < n; i++){
            dados += lista.get(i).getDados(); // Forma uma única String contendo os dados de todos os funcionários
            salario_total += lista.get(i).getSalario(); // Soma todos os salários
        }

        // Folha de pagamento
        JOptionPane.showMessageDialog(null, dados
        + "\n------------------------------------------------------------------------\n\n"
        + "Total de horas trabalhadas: " + total_hora + "\nTotal de produtos vendidos: " + total_prod
        + "\nTotal de salário: R$" + salario_total, "Folha de Pagamento", JOptionPane.INFORMATION_MESSAGE);
    }
}