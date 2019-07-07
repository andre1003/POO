import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Gerenciamento extends javax.swing.JFrame {
    
    public Gerenciamento() {
        initComponents();
        if(lblTime.getText().equals("Nenhum"))
            setTravarTodosBotoes();
        
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        btnJogar = new javax.swing.JButton();
        btnNotaFiscal = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSimular = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        btnCriar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblPartidasJogadas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bem vindo ao Paulinho's Team Manager!");

        jLabel3.setText("Time:");

        lblTime.setText("Nenhum");

        btnJogar.setText("Jogar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        btnNotaFiscal.setText("NF");
        btnNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaFiscalActionPerformed(evt);
            }
        });

        btnRelatorio.setText("Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSimular.setText("Simular");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });

        btnDetalhes.setText("Detalhes");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                btnDetalhesActionPerformed(evt);
            }
        });

        btnCriar.setText("Criar");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        jLabel5.setText("Partidas Jogadas:");

        lblPartidasJogadas.setText("0");

        jLabel7.setText("Jogar Partida");

        jLabel8.setText("Simular Partida");

        jLabel9.setText("Detalhes do Time");

        jLabel10.setText("Emitir Nota Fiscal");

        jLabel11.setText("Emitir Relatório");

        jLabel12.setText("Sair");

        jLabel13.setText("Criar Novo Time");

        jLabel14.setText("Pontos:");

        lblPontos.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblPartidasJogadas))
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8)
                                            .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(166, 166, 166)))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPontos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblTime))
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblTime))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblPartidasJogadas)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(lblPontos))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        pack();
    }

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) { // Função para criar um time
        this.dispose();
        new CadastroTime().setVisible(true);
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) { // Função para sair do programa
        System.exit(0);
    }

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) { // Gera um resultado automático
        Random random = new Random();

        int num = random.nextInt(4); // Gera a pontuação aleatoriamente
        while(num == 2) // Não existe 2 pontos no futebol, então arruma outro
            num = random.nextInt(4);
        
        if(num == 0){ // Derrota
            int d = time.getDerrotas() + 1;
            time.setDerrotas(d);
            time.setGolsSofridos(time.getGolsSofridos() + 1);
        }      
        else if(num == 1){ // Empate
            int e = time.getEmpates() + 1;
            time.setEmpates(e);
        }
        else{ // Vitória
            int v = time.getVitorias() + 1;
            time.setVitorias(v);
            time.setGolsMarcados(time.getGolsMarcados() + 1);

            List<Funcionario> lista = new ArrayList<>();
            lista = time.getLista(); // Salva a lista de funcionarios
            int n = lista.size();
            int jogador = random.nextInt(n); // Procura um jogador randômico
            while(true){ // Procura até achar
                if(lista.get(jogador).getTipo().equals("Jogador"))
                    break;
                else
                    jogador = random.nextInt(n);
            }
            lista.get(jogador).marcar(); // Achando, marca o gol
            time.setLista(lista); // Salva na lista
        }
        num += time.getPontos(); // Soma com os pontos atuais
        time.setPontos(num); // Altera no time
        int partidas = time.getPartidas() + 1; // Soma mais um nas partidas jogadas
        time.setPartidas(partidas); // Altera no time
        atualizar(); // Atualiza os dados
        if(partidas == 5) // Se der 5 partidas, trava os botões de jogar e simular
            setTravarBotoes();
    }

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) { // Jogar partida
        JogarPartida jp = new JogarPartida();
        jp.setTime(time);
        this.dispose(); // Fechar a aba
        jp.setVisible(true);
    }

    private void btnNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) { // Nota fiscal
        List<Funcionario> lista = new ArrayList<>();
        lista = time.getLista(); // Pega a lista de jogadores
        int n = lista.size();
        double total = 0;
        String dados = "";
        for(int i = 0; i < n; i++){ // Pega todos os dados
            total += lista.get(i).getSalario();
            dados += lista.get(i).notaFiscal() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, dados + "============================\n\nTotal: R$" + total, "Notinha", JOptionPane.INFORMATION_MESSAGE);
    }

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) { // Relatório individual
        List<Funcionario> jogadores = new ArrayList<>();
        List<Funcionario> comissao = new ArrayList<>();
        List<Funcionario> aux = new ArrayList<>();
        aux = time.getLista();
        int n = aux.size();
        for(int i = 0; i < n; i++){ // Separa os jogadores dos demais
            if(aux.get(i).getTipo().equals("Jogador"))
                jogadores.add(aux.get(i));
            else
                comissao.add(aux.get(i));
        }

        n = jogadores.size();
        for(int i = 0; i < n; i++){
            JOptionPane.showMessageDialog(null, jogadores.get(i).getDados(), "Dados", JOptionPane.INFORMATION_MESSAGE);
        }

        n = comissao.size();
        for(int i = 0; i < n; i++){
            JOptionPane.showMessageDialog(null, comissao.get(i).getDados(), "Dados", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt){ // Detalhes do time
        JOptionPane.showMessageDialog(null, time.getDados(), "Detalhes do time", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setNomeTime(String time){ // Método para alterar o nome do time
        this.lblTime.setText(time);
    }
    
    public void setPartidas(String partidas){ // Método para alterar o número de partidas jogadas
        this.lblPartidasJogadas.setText(partidas);
    }
    
    public void setPontos(String pontos){ // Método para alterar os pontos
        this.lblPontos.setText(pontos);
    }
    
    public void setTravarBotoes(){ // Método para travar os botões de Jogar e Simular
        this.btnJogar.setEnabled(false);
        this.btnSimular.setEnabled(false);
    }

    public void setTravarTodosBotoes(){ // Trava todos os botões
        this.btnDetalhes.setEnabled(false);
        this.btnNotaFiscal.setEnabled(false);
        this.btnRelatorio.setEnabled(false);
        this.btnJogar.setEnabled(false);
        this.btnSimular.setEnabled(false);
    }

    public void setDesbloquearBotoes(){
        this.btnDetalhes.setEnabled(true);
        this.btnNotaFiscal.setEnabled(true);
        this.btnRelatorio.setEnabled(true);
        this.btnJogar.setEnabled(true);
        this.btnSimular.setEnabled(true);
    }

    public void setTime(Time time){ // Atualiza os dados do time
        this.time = time;
        atualizar();
    }

    private void atualizar(){ // Função para atualizar todos os dados do time
        setNomeTime(time.getNome());
        setPartidas(Integer.toString(time.getPartidas()));
        setPontos(Integer.toString(time.getPontos()));
        if(time.getPartidas() == 5)
            setTravarBotoes();
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
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerenciamento().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnNotaFiscal;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSimular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblPartidasJogadas;
    private javax.swing.JLabel lblPontos;
    private javax.swing.JLabel lblTime;
    private Time time;
}
