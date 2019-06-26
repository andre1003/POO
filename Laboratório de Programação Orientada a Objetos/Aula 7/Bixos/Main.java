import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        List<Animal> lista = new ArrayList<>();
        String nome;
        int veneno, nvl_raiva, op;
        boolean vivo, extincao, pica, venenoso, fome = false;
        String[] opcoes = {"Sim", "Não"};
        String[] animal = {"Mamífero", "Inseto"};
        Mamifero m;
        Inseto i;
        try{
            while(true){
                op = JOptionPane.showOptionDialog(null, "Escolha sua opção:", "Mamífero ou Inseto", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, animal, animal[0]);
                if(op == 0){ // Mamífero
                    nome = JOptionPane.showInputDialog(null, "Insira o nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
                    op = JOptionPane.showOptionDialog(null, "Está vivo?", "Sim ou Não", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                    if(op == 0)
                        vivo = true;
                    else
                        vivo = false;
                    
                    op = JOptionPane.showOptionDialog(null, "Está extinto?", "Sim ou Não", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                    if(op == 0)
                        extincao = true;
                    else
                        extincao = false;
                    
                    if(extincao == false){
                        op = JOptionPane.showOptionDialog(null, "Está com fome?", "Sim ou Não", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                        if(op == 0)
                            fome = true;
                        else
                            fome = false;
                    }
                    nvl_raiva = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o nível da raiva desse bixo (0 - 10)?", "Raiva", JOptionPane.QUESTION_MESSAGE));
                    m = new Mamifero(nome, vivo, extincao, fome, nvl_raiva);
                    lista.add(m);
                }
                else{
                    nome = JOptionPane.showInputDialog(null, "Insira o nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
                    op = JOptionPane.showOptionDialog(null, "Está vivo?", "Sim ou Não", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                    if(op == 0)
                        vivo = true;
                    else
                        vivo = false;
                    
                    op = JOptionPane.showOptionDialog(null, "Está extinto?", "Sim ou Não", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                    if(op == 0)
                        extincao = true;
                    else
                        extincao = false;

                    op = JOptionPane.showOptionDialog(null, "Pica?", "Sim ou Não", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                    if(op == 0)
                        pica = true;
                    else
                        pica = false;

                    op = JOptionPane.showOptionDialog(null, "É venenoso?", "Sim ou Não", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                    if(op == 0)
                        venenoso = true;
                    else
                        venenoso = false;
                    veneno = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o nível de veneno:", "Veneno", JOptionPane.QUESTION_MESSAGE));
                    i = new Inseto(nome, vivo, extincao, pica, venenoso, veneno);
                    lista.add(i);
                }
                op = JOptionPane.showOptionDialog(null, "Deseja continuar inserindo?", "Sim ou Não", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                if(op == 1)
                    break;
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Inseriu letra no lugar de número denovo?", "Denovo?", JOptionPane.ERROR_MESSAGE);
        }

        int n = lista.size();
        for(int j = 0; j < n; j++){
            lista.get(j).getDados();
        }
    }
}