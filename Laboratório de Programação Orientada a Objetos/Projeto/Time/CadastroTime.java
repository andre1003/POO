import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import javax.swing.UIManager.*;

public class CadastroTime extends javax.swing.JFrame {
    public javax.swing.JButton btnCriar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner spnAno;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdSigla;
    private Time time;

    public CadastroTime() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        tfdSigla = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spnAno = new javax.swing.JSpinner();
        btnCriar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Prencha a ficha abaixo para criar ou editar os dados do time:");

        jLabel2.setText("Nome do Time:");

        jLabel3.setText("Sigla do Time:");

        jLabel4.setText("Ano de Fundação:");

        spnAno.setModel(new javax.swing.SpinnerNumberModel(2019, null, 2019, 1));

        btnCriar.setText("Criar");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfdSigla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addComponent(tfdNome, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );

        pack();
    }

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) { // Criar um novo time
        boolean validado = validarEntradas();
        if(validado == true){
            Gerenciamento g = new Gerenciamento(); // Inicializa os componentes da tela principal
            List<Funcionario> lista = new ArrayList<>();

            String[] opcoes = {"Jogador", "Comissão Técnica"}; // Opções de cadastro
            String[] fim = {"Continuar", "Parar"}; // Para ou não
            String[] pe = {"Direito", "Esquerdo"}; // Pé dominante
            int op = 0;
            JOptionPane.showMessageDialog(null, "Você deve cadastrar 11 jogadores e 1 pessoa da comissão técnica", "Cadastro Obrigatório", JOptionPane.INFORMATION_MESSAGE);
            try{
                for(int i = 0; i < 12; i++){
                    if(i < 11){ // Jogador
                        JOptionPane.showMessageDialog(null, "Cadastrando o " + (i + 1) + "º Jogador", "Jogador", JOptionPane.INFORMATION_MESSAGE);
                        String nome = JOptionPane.showInputDialog(null, "Insira o nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
                        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade:", "Idade", JOptionPane.QUESTION_MESSAGE));
                        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o salário:", "Salário", JOptionPane.QUESTION_MESSAGE));
                        String tipo = opcoes[op];
                        double bonus = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um bônus:", "Bônus", JOptionPane.QUESTION_MESSAGE));
                        double direitosImagem = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor dos direitos de imagem:", "Diretos de Imagem", JOptionPane.QUESTION_MESSAGE));
                        op = JOptionPane.showOptionDialog(null, "Pé dominante:", "Pézinho de Deus", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, pe, pe[0]);
                        String peDominante = pe[0];
                        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura:", "Altura", JOptionPane.QUESTION_MESSAGE));
                        Jogador j = new Jogador(nome, idade, salario, tipo, direitosImagem, peDominante, altura);
                        j.calcularSalario(bonus, direitosImagem);
                        lista.add(j);
                    }
                    else{ // Comissão Técnica
                        JOptionPane.showMessageDialog(null, "Comissão técnica", "Comissão Técnica", JOptionPane.INFORMATION_MESSAGE);
                        String nome = JOptionPane.showInputDialog(null, "Insira o nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
                        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade:", "Idade", JOptionPane.QUESTION_MESSAGE));
                        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o salário:", "Salário", JOptionPane.QUESTION_MESSAGE));
                        String tipo = opcoes[1];
                        double bonus = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um bônus:", "Bônus", JOptionPane.QUESTION_MESSAGE));
                        Funcionario f = new Funcionario(nome, idade, salario, tipo);
                        f.calcularSalario(bonus);
                        lista.add(f);
                    }
                }
    
                op = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Escolhas da vida", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, fim, fim[0]);
                if(op == 0){ // Inserir mais
                    while(true){ // Inserir funcionários
                        op = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Jogador ou Comissão", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                        String nome = JOptionPane.showInputDialog(null, "Insira o nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
                        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade:", "Idade", JOptionPane.QUESTION_MESSAGE));
                        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o salário:", "Salário", JOptionPane.QUESTION_MESSAGE));
                        String tipo = opcoes[op];
                        double bonus = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um bônus:", "Bônus", JOptionPane.QUESTION_MESSAGE));
                        if(op == 0){ // Jogador
                            double direitosImagem = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor dos direitos de imagem:", "Diretos de Imagem", JOptionPane.QUESTION_MESSAGE));
                            op = JOptionPane.showOptionDialog(null, "Pé dominante:", "Pézinho de Deus", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, pe, pe[0]);
                            String peDominante = pe[op];
                            double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura:", "Altura", JOptionPane.QUESTION_MESSAGE));
                            Jogador j = new Jogador(nome, idade, salario, tipo, direitosImagem, peDominante, altura);
                            j.calcularSalario(bonus, direitosImagem);
                            lista.add(j);
                        }
                        else{ // Comissão Técnica
                            Funcionario f = new Funcionario(nome, idade, salario, tipo);
                            f.calcularSalario(bonus);
                            lista.add(f);
                        }
                        op = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Escolhas da vida", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, fim, fim[0]);
                        if(op == 1)
                            break;
                    }
                }
                int ano = Integer.parseInt(spnAno.getValue().toString());
                time = new Time(tfdNome.getText(), tfdSigla.getText(), ano, lista); // Cria um novo time
                g.setTime(time); // Passa o time para a tela principal
                g.setDesbloquearBotoes();
                this.dispose();
                g.setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Uma letra foi inserida no lugar de um número!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean validarEntradas(){ // Valida os campos de input
        if(tfdNome.getText().equals("") || tfdSigla.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nome ou Sigla nulos! Insira algum nome!", "Nome ou Sigla", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else
            return true;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTime().setVisible(true);
            }
        });
    }
}
