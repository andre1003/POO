import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class JogarPartida extends javax.swing.JFrame {
    
    public JogarPartida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblAFavor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        btnJogada = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Placar:");

        lblAFavor.setText("0");

        jLabel3.setText("X");

        lblContra.setText("0");

        jLabel5.setText("Status:");

        lblStatus.setText("Parado");

        jLabel7.setText("Tempo:");

        lblTempo.setText("0");

        btnJogada.setText("Jogada");
        btnJogada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogadaActionPerformed(evt);
            }
        });

        jLabel9.setText("Seu marcador é o da esquerda.");

        btnSair.setText("Sair");
        btnSair.setEnabled(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAFavor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblContra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTempo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatus))
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(btnJogada, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblAFavor)
                    .addComponent(jLabel3)
                    .addComponent(lblContra)
                    .addComponent(jLabel7)
                    .addComponent(lblTempo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(btnJogada, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }

    private String[] jogadas = {"Olha o gol...olha o gol...goooooooool!", "Na traaaaaave", "Bateu mal", "Falta!... "};
    private String[] falta = {"Nenhum cartão", "Cartão amarelo", "Cartão vermelho"};

    private int amarelos = 0;
    private int vermelhos = 0;
    
    private void btnJogadaActionPerformed(java.awt.event.ActionEvent evt) {
        // Realiza uma jogada
        Random random = new Random();
        int j = random.nextInt(4);
        int t = random.nextInt(2);
        int tempo = Integer.parseInt(lblTempo.getText());
        tempo += 15;
        setTempo(Integer.toString(tempo));
        if(tempo == 45)
            setStatus("Intervalo");
        else if(tempo == 90){
            setStatus("Fim de jogo!");
            travarBotao();
            destravarSair();
            int gols_marcados = Integer.parseInt(lblAFavor.getText());
            int gols_sofridos = Integer.parseInt(lblContra.getText());
            resultado(gols_marcados, gols_sofridos, amarelos, vermelhos);
        }
        else{
            if(j == 0){ // Gol
                if(t == 0){ // A favor
                    int p = Integer.parseInt(lblAFavor.getText());
                    p++;
                    setAFavor(Integer.toString(p));
                    List<Funcionario> lista = new ArrayList<>();
                    lista = this.t.getLista(); // Salva a lista de funcionarios
                    int n = lista.size();
                    int jogador = random.nextInt(n); // Procura um jogador randômico
                    while(true){ // Procura até achar
                        if(lista.get(jogador).getTipo().equals("Jogador"))
                            break;
                        else
                            jogador = random.nextInt(n);
                    }
                    lista.get(jogador).marcar(); // Achando, marca o gol
                    this.t.setLista(lista); // Salva na lista
                    setStatus(this.t.getSigla() + " - " + jogadas[j]);
                }
                else{ // Contra
                    int p = Integer.parseInt(lblContra.getText());
                    p++;
                    setContra(Integer.toString(p));
                    setStatus("ADV - " + jogadas[j]);
                }
            }
            else if(j == 3){ // Falta
                int f = random.nextInt(3);
                if(t == 0){ // Do seu time;
                    if(f == 1)
                        amarelos++;
                    else if(f == 2)
                        vermelhos++;
                    setStatus(this.t.getSigla() + " - " + jogadas[j] + falta[f]);
                }
                setStatus("ADV - " + jogadas[j] + falta[f]);
            }
            else{
                if(t == 0)
                    setStatus(this.t.getSigla() + " - " + jogadas[j]);
                else 
                    setStatus("ADV - " + jogadas[j]);
            }
        }       
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        // Sai da partida
        Gerenciamento g = new Gerenciamento();
        g.setTime(t);
        g.setDesbloquearBotoes();
        this.dispose();
        g.setVisible(true);
    }

    public void setAFavor(String ponto){ // Altera o placar a favor
        lblAFavor.setText(ponto);
    }
    
    public void setContra(String ponto){ // Altera o placar contra
        lblContra.setText(ponto);
    }
    
    public void setStatus(String status){ // Altera a frase de staus
        lblStatus.setText(status);
    }
    
    public void setTempo(String tempo){ // Altera o tempo
        lblTempo.setText(tempo);
    }
    
    public void travarBotao(){ // Trava o botão de jogada
        this.btnJogada.setEnabled(false);
    }
    
    public void destravarSair(){ // Destrava o botão de sair da partida
        this.btnSair.setEnabled(true);
    }

    public void setTime(Time time){ // Pega todos os dados do time
        this.t = time;
    }

    public void resultado(int gols_marcados, int gols_sofridos, int cartao_amarelo, int cartao_vermelho){
        t.setGolsMarcados(t.getGolsMarcados() + gols_marcados); // Gols marcados
        t.setGolsSofridos(t.getGolsSofridos() + gols_sofridos); // Gols sofridos
        t.setCartaoAmarelo(t.getCartaoAmarelo() + cartao_amarelo); // Cartões amarelos
        t.setCartaoVermelho(t.getCartaoVermelho() + cartao_vermelho); // Cartões vermelhos
        if(gols_marcados > gols_sofridos){ // Vitória
            t.setVitorias(t.getVitorias() + 1);
            t.setPontos(t.getPontos() + 3);
        }
        else if(gols_sofridos > gols_marcados) // Derrota
            t.setDerrotas(t.getDerrotas() + 1);
        else{ // Empate
            t.setEmpates(t.getEmpates() + 1);
            t.setPontos(t.getPontos() + 1);
        }
        t.setPartidas(t.getPartidas() + 1); // Partidas jogadas
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
            java.util.logging.Logger.getLogger(JogarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogarPartida().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnJogada;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAFavor;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTempo;
    private Time t;
}
