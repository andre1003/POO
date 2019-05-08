import java.util.Scanner;
import javax.swing.JOptionPane;

public class Carrinho{
    public static void main(String args[]){
        try{
            String[] id = new String[4]; // Vetor para o ID
            String[] description = new String[4]; // Vetor para a descrição
            int[] quantity = new int[4]; // Vetor quantidade
            double[] unity_price = new double[4]; // Vetor para preço unitário
            double total = 0.0; // Valor total da compra

            for(int i = 0; i < 4; i++){ // Lê os valores para serem inseridos
                JOptionPane.showMessageDialog(null, "Inserção do produto " + (i + 1), "Produto " + (i + 1), JOptionPane.INFORMATION_MESSAGE);

                id[i] = JOptionPane.showInputDialog(null, "ID:", "Produto " + (i + 1), JOptionPane.QUESTION_MESSAGE); // ID
                
                description[i] = JOptionPane.showInputDialog(null, "Descrição:", "Produto " + (i + 1), JOptionPane.QUESTION_MESSAGE); // Descrição
                
                quantity[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade:", "Produto " + (i + 1), JOptionPane.QUESTION_MESSAGE)); // Quantidade

                unity_price[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço:", "Produto " + (i + 1), JOptionPane.QUESTION_MESSAGE)); // Preço
            }

            Item item1 = new Item(id[0], description[0], quantity[0], unity_price[0]); // Insere os valores do item1
            Item item2 = new Item(id[1], description[1], quantity[1], unity_price[1]); // Insere os valores do item2
            Item item3 = new Item(id[2], description[2], quantity[2], unity_price[2]); // Insere os valores do item3
            Item item4 = new Item(id[3], description[3], quantity[3], unity_price[3]); // Insere os valores do item4
            double disc = (Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto de disconto deseja inserir (em %):"))) / 100;
            int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual item deseja por o desconto?", "Desconto", JOptionPane.QUESTION_MESSAGE));
            switch(op){
                case 1:
                    item1.setDiscount(disc); // Dá um desconto para o item1
                    break;
                case 2:
                    item2.setDiscount(disc); // Dá um desconto para o item2
                    break;
                case 3:
                    item3.setDiscount(disc); // Dá um desconto para o item3
                    break;
                case 4:
                    item4.setDiscount(disc); // Dá um desconto para o item4
                    break;
                default:
                    item3.setDiscount(disc); // Dá um desconto para o item3
            }

            total = item1.getAdjustedTotal() + item2.getAdjustedTotal() + item3.getAdjustedTotal() + item4.getAdjustedTotal(); // Soma o total dos itens

            JOptionPane.showMessageDialog(null,
              "Item 1\n" + "Descricao: " + item1.getDescription() + "\nQuantidade: " + item1.getQuantity() + "\nPreco: " + item1.getPriceWithDiscount()
            + "\n\nItem 2\n" + "Descricao: " + item2.getDescription() + "\nQuantidade: " + item2.getQuantity() + "\nPreco: " + item2.getPriceWithDiscount()
            + "\n\nItem 3\n" + "Descricao: " + item3.getDescription() + "\nQuantidade: " + item3.getQuantity() + "\nPreco: " + item3.getPriceWithDiscount()
            + "\n\nItem 4\n" + "Descricao: " + item4.getDescription() + "\nQuantidade: " + item4.getQuantity() + "\nPreco: " + item4.getPriceWithDiscount()
            + "\n\nTotal: " + total, "Nota Fiscal", JOptionPane.INFORMATION_MESSAGE); // Nota Fiscal
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE); // Caso insira letras ao invéz de números
        }
    }
}