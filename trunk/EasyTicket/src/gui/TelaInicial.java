/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Allan
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TelaInicial() {
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

        TelaAbas = new javax.swing.JTabbedPane();
        TelaInicial = new javax.swing.JPanel();
        logoEasyTicket = new javax.swing.JLabel();
        TelaAlunos = new javax.swing.JPanel();
        tabelaAlunos = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        botaoCadastrarAluno = new javax.swing.JButton();
        botaoEditarAluno = new javax.swing.JButton();
        botaoExcluirAluno = new javax.swing.JButton();
        tituloAlunos = new javax.swing.JLabel();
        botaoVisualizarAluno = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        TelaFuncionarios = new javax.swing.JPanel();
        tabelaFuncionarios = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tituloFuncionarios = new javax.swing.JLabel();
        botaoVisualizarFuncionario = new javax.swing.JButton();
        botaoEditarFuncionario = new javax.swing.JButton();
        botaoExcluirFuncionario = new javax.swing.JButton();
        botaoCadastrarFuncionario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 180));
        setMaximumSize(new java.awt.Dimension(690, 550));
        setMinimumSize(new java.awt.Dimension(690, 550));
        setPreferredSize(new java.awt.Dimension(690, 550));
        setResizable(false);

        TelaAbas.setBackground(new java.awt.Color(204, 204, 255));
        TelaAbas.setMaximumSize(new java.awt.Dimension(600, 515));
        TelaAbas.setMinimumSize(new java.awt.Dimension(600, 515));
        TelaAbas.setPreferredSize(new java.awt.Dimension(600, 515));

        TelaInicial.setBackground(new java.awt.Color(102, 118, 165));
        TelaInicial.setFont(new java.awt.Font("GungsuhChe", 1, 18)); // NOI18N

        logoEasyTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/logo2.png"))); // NOI18N

        javax.swing.GroupLayout TelaInicialLayout = new javax.swing.GroupLayout(TelaInicial);
        TelaInicial.setLayout(TelaInicialLayout);
        TelaInicialLayout.setHorizontalGroup(
            TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaInicialLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(logoEasyTicket)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        TelaInicialLayout.setVerticalGroup(
            TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaInicialLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(logoEasyTicket)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        TelaAbas.addTab("Inicial", TelaInicial);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Curso", "Status"
            }
        ));
        tabelaAlunos.setViewportView(jTable2);

        botaoCadastrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/add.png"))); // NOI18N
        botaoCadastrarAluno.setText("Cadastrar novo");
        botaoCadastrarAluno.setToolTipText("");
        botaoCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarAlunoActionPerformed(evt);
            }
        });

        botaoEditarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/edit.png"))); // NOI18N
        botaoEditarAluno.setText("Editar");
        botaoEditarAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoEditarAluno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botaoExcluirAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/delete.png"))); // NOI18N
        botaoExcluirAluno.setText("Excluir");
        botaoExcluirAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoExcluirAluno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tituloAlunos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/alunos.png"))); // NOI18N
        tituloAlunos.setText("            Alunos");

        botaoVisualizarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/view.png"))); // NOI18N
        botaoVisualizarAluno.setText("Visualizar");
        botaoVisualizarAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVisualizarAluno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoVisualizarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaAlunosLayout = new javax.swing.GroupLayout(TelaAlunos);
        TelaAlunos.setLayout(TelaAlunosLayout);
        TelaAlunosLayout.setHorizontalGroup(
            TelaAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAlunosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(TelaAlunosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(TelaAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TelaAlunosLayout.createSequentialGroup()
                        .addComponent(tabelaAlunos)
                        .addGap(18, 18, 18)
                        .addGroup(TelaAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botaoVisualizarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoExcluirAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoEditarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(botaoCadastrarAluno)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        TelaAlunosLayout.setVerticalGroup(
            TelaAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloAlunos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(TelaAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaAlunosLayout.createSequentialGroup()
                        .addComponent(botaoVisualizarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEditarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabelaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoCadastrarAluno)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        TelaAbas.addTab("Alunos", TelaAlunos);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Cargo ", "Status"
            }
        ));
        tabelaFuncionarios.setViewportView(jTable1);

        tituloFuncionarios.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/funcionarios.png"))); // NOI18N
        tituloFuncionarios.setText("           Funcionários");

        botaoVisualizarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/view.png"))); // NOI18N
        botaoVisualizarFuncionario.setText("Visualizar");
        botaoVisualizarFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVisualizarFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoVisualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarFuncionarioActionPerformed(evt);
            }
        });

        botaoEditarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/edit.png"))); // NOI18N
        botaoEditarFuncionario.setText("Editar");
        botaoEditarFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoEditarFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botaoExcluirFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/delete.png"))); // NOI18N
        botaoExcluirFuncionario.setText("Excluir");
        botaoExcluirFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoExcluirFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botaoCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/add.png"))); // NOI18N
        botaoCadastrarFuncionario.setText("Cadastrar novo");
        botaoCadastrarFuncionario.setToolTipText("");
        botaoCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaFuncionariosLayout = new javax.swing.GroupLayout(TelaFuncionarios);
        TelaFuncionarios.setLayout(TelaFuncionariosLayout);
        TelaFuncionariosLayout.setHorizontalGroup(
            TelaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaFuncionariosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(TelaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TelaFuncionariosLayout.createSequentialGroup()
                        .addComponent(tituloFuncionarios)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(TelaFuncionariosLayout.createSequentialGroup()
                        .addGroup(TelaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TelaFuncionariosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoCadastrarFuncionario))
                            .addGroup(TelaFuncionariosLayout.createSequentialGroup()
                                .addComponent(tabelaFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(TelaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoEditarFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoExcluirFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoVisualizarFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jSeparator1))
                        .addGap(29, 29, 29))))
        );
        TelaFuncionariosLayout.setVerticalGroup(
            TelaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaFuncionariosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaFuncionariosLayout.createSequentialGroup()
                        .addComponent(botaoVisualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEditarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExcluirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabelaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoCadastrarFuncionario)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        TelaAbas.addTab("Funcionários", TelaFuncionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TelaAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TelaAbas.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarAlunoActionPerformed
        new TelaAddAluno().setVisible(true);
    }//GEN-LAST:event_botaoCadastrarAlunoActionPerformed

    private void botaoVisualizarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVisualizarAlunoActionPerformed

    private void botaoVisualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVisualizarFuncionarioActionPerformed

    private void botaoCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastrarFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TelaAbas;
    private javax.swing.JPanel TelaAlunos;
    private javax.swing.JPanel TelaFuncionarios;
    private javax.swing.JPanel TelaInicial;
    private javax.swing.JButton botaoCadastrarAluno;
    private javax.swing.JButton botaoCadastrarFuncionario;
    private javax.swing.JButton botaoEditarAluno;
    private javax.swing.JButton botaoEditarFuncionario;
    private javax.swing.JButton botaoExcluirAluno;
    private javax.swing.JButton botaoExcluirFuncionario;
    private javax.swing.JButton botaoVisualizarAluno;
    private javax.swing.JButton botaoVisualizarFuncionario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel logoEasyTicket;
    private javax.swing.JScrollPane tabelaAlunos;
    private javax.swing.JScrollPane tabelaFuncionarios;
    private javax.swing.JLabel tituloAlunos;
    private javax.swing.JLabel tituloFuncionarios;
    // End of variables declaration//GEN-END:variables
}
