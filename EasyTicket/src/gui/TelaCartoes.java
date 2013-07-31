/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Marcela Domingues
 */
public class TelaCartoes extends javax.swing.JFrame {

    /**
     * Creates new form TelaCartoes
     */
    public TelaCartoes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guiasAluno = new javax.swing.JTabbedPane();
        guiaConsultarAluno = new javax.swing.JPanel();
        tituloAlunos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        painelConsulta = new javax.swing.JPanel();
        tituloConsultar = new javax.swing.JLabel();
        tituloCpf = new javax.swing.JLabel();
        campoPesquisarCpfFunc = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        guiaCadastrarAluno = new javax.swing.JPanel();
        tituloCadastrar = new javax.swing.JLabel();
        botaoCadastrar1 = new javax.swing.JButton();
        botaoVoltar5 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        guiaEditarAluno = new javax.swing.JPanel();
        tituloCadastrar1 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        botaoVoltar1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        guiaVisualizarAluno = new javax.swing.JPanel();
        tituloVisualizarFunc = new javax.swing.JLabel();
        botaoVoltar6 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guiasAluno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tituloAlunos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/cartoes.png"))); // NOI18N
        tituloAlunos.setText("  Cartão");

        painelConsulta.setBackground(new java.awt.Color(222, 235, 216));
        painelConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        painelConsulta.setForeground(new java.awt.Color(204, 204, 204));
        painelConsulta.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        tituloConsultar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloConsultar.setText("Consultar Cartão");

        tituloCpf.setText("Número:");

        botaoPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        botaoPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/search.png"))); // NOI18N
        botaoPesquisar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoPesquisar.setBorderPainted(false);
        botaoPesquisar.setContentAreaFilled(false);
        botaoPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConsultaLayout = new javax.swing.GroupLayout(painelConsulta);
        painelConsulta.setLayout(painelConsultaLayout);
        painelConsultaLayout.setHorizontalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoPesquisarCpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(tituloConsultar)
                .addGap(81, 81, 81))
        );
        painelConsultaLayout.setVerticalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaLayout.createSequentialGroup()
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConsultaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tituloCpf)
                            .addComponent(campoPesquisarCpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelConsultaLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(botaoPesquisar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/back.png"))); // NOI18N
        botaoVoltar.setText("Voltar");

        javax.swing.GroupLayout guiaConsultarAlunoLayout = new javax.swing.GroupLayout(guiaConsultarAluno);
        guiaConsultarAluno.setLayout(guiaConsultarAlunoLayout);
        guiaConsultarAlunoLayout.setHorizontalGroup(
            guiaConsultarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaConsultarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiaConsultarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiaConsultarAlunoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(painelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(guiaConsultarAlunoLayout.createSequentialGroup()
                        .addGroup(guiaConsultarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoVoltar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        guiaConsultarAlunoLayout.setVerticalGroup(
            guiaConsultarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaConsultarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        guiasAluno.addTab("Consultar Cartão", guiaConsultarAluno);

        tituloCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCadastrar.setText("Cadastrar Novo Cartão");
        tituloCadastrar.setToolTipText("");
        tituloCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoCadastrar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoCadastrar1.setText("Cadastrar");
        botaoCadastrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoVoltar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/back.png"))); // NOI18N
        botaoVoltar5.setText("Voltar");

        jLabel5.setText("Aluno:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout guiaCadastrarAlunoLayout = new javax.swing.GroupLayout(guiaCadastrarAluno);
        guiaCadastrarAluno.setLayout(guiaCadastrarAlunoLayout);
        guiaCadastrarAlunoLayout.setHorizontalGroup(
            guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastrarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(guiaCadastrarAlunoLayout.createSequentialGroup()
                            .addComponent(tituloCadastrar)
                            .addGap(182, 182, 182)
                            .addComponent(botaoVoltar5)
                            .addGap(18, 18, 18)
                            .addComponent(botaoCadastrar1)
                            .addGap(1, 1, 1))
                        .addComponent(jSeparator3))
                    .addGroup(guiaCadastrarAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        guiaCadastrarAlunoLayout.setVerticalGroup(
            guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastrarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar5))
                .addContainerGap())
        );

        guiasAluno.addTab("Cadastrar Novo Cartão", guiaCadastrarAluno);

        tituloCadastrar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloCadastrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCadastrar1.setText("Editar Cartão");
        tituloCadastrar1.setToolTipText("");
        tituloCadastrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/back.png"))); // NOI18N
        botaoVoltar1.setText("Voltar");

        javax.swing.GroupLayout guiaEditarAlunoLayout = new javax.swing.GroupLayout(guiaEditarAluno);
        guiaEditarAluno.setLayout(guiaEditarAlunoLayout);
        guiaEditarAlunoLayout.setHorizontalGroup(
            guiaEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaEditarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiaEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiaEditarAlunoLayout.createSequentialGroup()
                        .addGap(0, 399, Short.MAX_VALUE)
                        .addComponent(botaoVoltar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(guiaEditarAlunoLayout.createSequentialGroup()
                        .addComponent(tituloCadastrar1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        guiaEditarAlunoLayout.setVerticalGroup(
            guiaEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaEditarAlunoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tituloCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addGroup(guiaEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar1))
                .addContainerGap())
        );

        guiasAluno.addTab("Editar Cartão", guiaEditarAluno);

        tituloVisualizarFunc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloVisualizarFunc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarFunc.setText("Cartão");
        tituloVisualizarFunc.setToolTipText("");
        tituloVisualizarFunc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoVoltar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/back.png"))); // NOI18N
        botaoVoltar6.setText("Voltar");

        jLabel1.setText("Número:");

        jLabel2.setText("Aluno:");

        jLabel3.setText("Status:");

        jLabel4.setText("Saldo:");

        javax.swing.GroupLayout guiaVisualizarAlunoLayout = new javax.swing.GroupLayout(guiaVisualizarAluno);
        guiaVisualizarAluno.setLayout(guiaVisualizarAlunoLayout);
        guiaVisualizarAlunoLayout.setHorizontalGroup(
            guiaVisualizarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaVisualizarAlunoLayout.createSequentialGroup()
                .addGroup(guiaVisualizarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiaVisualizarAlunoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(guiaVisualizarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloVisualizarFunc)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiaVisualizarAlunoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltar6)))
                .addContainerGap())
        );
        guiaVisualizarAlunoLayout.setVerticalGroup(
            guiaVisualizarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaVisualizarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloVisualizarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(botaoVoltar6)
                .addContainerGap())
        );

        guiasAluno.addTab("Visualizar Cartão", guiaVisualizarAluno);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guiasAluno)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guiasAluno)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCartoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCartoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCartoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCartoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaCartoes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar1;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JButton botaoVoltar1;
    private javax.swing.JButton botaoVoltar5;
    private javax.swing.JButton botaoVoltar6;
    private javax.swing.JTextField campoPesquisarCpfFunc;
    private javax.swing.JPanel guiaCadastrarAluno;
    private javax.swing.JPanel guiaConsultarAluno;
    private javax.swing.JPanel guiaEditarAluno;
    private javax.swing.JPanel guiaVisualizarAluno;
    private javax.swing.JTabbedPane guiasAluno;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JLabel tituloAlunos;
    private javax.swing.JLabel tituloCadastrar;
    private javax.swing.JLabel tituloCadastrar1;
    private javax.swing.JLabel tituloConsultar;
    private javax.swing.JLabel tituloCpf;
    private javax.swing.JLabel tituloVisualizarFunc;
    // End of variables declaration//GEN-END:variables
}
