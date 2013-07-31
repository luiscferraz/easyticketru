/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Allan
 */
public class TelaPrincipalRU extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalRU
     */
    public TelaPrincipalRU() {
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

        logoEasyTicket = new javax.swing.JLabel();
        botaoRefeicoes = new javax.swing.JButton();
        botaoPagamentos = new javax.swing.JButton();
        botaoRelatorios = new javax.swing.JButton();
        botaoRecargas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoEasyTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/logo.png"))); // NOI18N

        botaoRefeicoes.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        botaoRefeicoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/refeicao.png"))); // NOI18N
        botaoRefeicoes.setText("  Refeições");
        botaoRefeicoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoRefeicoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRefeicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRefeicoesActionPerformed(evt);
            }
        });

        botaoPagamentos.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        botaoPagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/pagamentos.png"))); // NOI18N
        botaoPagamentos.setText("  Pagamentos");
        botaoPagamentos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoPagamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botaoRelatorios.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        botaoRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/relatorios.png"))); // NOI18N
        botaoRelatorios.setText("  Relatórios");
        botaoRelatorios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botaoRecargas.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        botaoRecargas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/saldo.png"))); // NOI18N
        botaoRecargas.setText("  Recargas");
        botaoRecargas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoRecargas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoRefeicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(logoEasyTicket)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(logoEasyTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(botaoRefeicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRefeicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRefeicoesActionPerformed
        new TelaAlunos().setVisible(true);
    }//GEN-LAST:event_botaoRefeicoesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalRU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalRU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalRU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalRU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalRU().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPagamentos;
    private javax.swing.JButton botaoRecargas;
    private javax.swing.JButton botaoRefeicoes;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JLabel logoEasyTicket;
    // End of variables declaration//GEN-END:variables
}