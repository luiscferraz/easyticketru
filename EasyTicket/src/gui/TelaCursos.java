/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dados.RepositorioCursos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.CadastroCursos;
import negocio.Curso;

/**
 *
 * @author Allan
 */
public class TelaCursos extends javax.swing.JFrame {
    private RepositorioCursos repositorioCursos = new RepositorioCursos();
    private CadastroCursos cadastro= new CadastroCursos(repositorioCursos);
   
    /**
     * Creates new form TelaCursos
     */
    public TelaCursos() {
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
        guiaVisualizarAluno = new javax.swing.JPanel();
        tituloVisualizarFunc = new javax.swing.JLabel();
        botaoVoltar6 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        tituloNome2 = new javax.swing.JLabel();
        tituloCpf3 = new javax.swing.JLabel();
        painelConsulta1 = new javax.swing.JPanel();
        tituloConsultar1 = new javax.swing.JLabel();
        tituloCpf4 = new javax.swing.JLabel();
        botaoPesquisar1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        tituloAlunos1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        guiaEditarAluno = new javax.swing.JPanel();
        tituloAlunos2 = new javax.swing.JLabel();
        painelConsulta2 = new javax.swing.JPanel();
        tituloConsultar2 = new javax.swing.JLabel();
        tituloCpf5 = new javax.swing.JLabel();
        campoPesquisarCpfFunc2 = new javax.swing.JTextField();
        botaoPesquisar2 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        tituloVisualizarFunc1 = new javax.swing.JLabel();
        tituloCpf6 = new javax.swing.JLabel();
        tituloNome3 = new javax.swing.JLabel();
        botaoVoltar8 = new javax.swing.JButton();
        botaoVoltar9 = new javax.swing.JButton();
        guiaCadastrarAluno = new javax.swing.JPanel();
        tituloCadastrar = new javax.swing.JLabel();
        botaoCadastrar1 = new javax.swing.JButton();
        botaoVoltar5 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        tituloNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        tituloAlunos3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guiasAluno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tituloVisualizarFunc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloVisualizarFunc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarFunc.setText("Curso");
        tituloVisualizarFunc.setToolTipText("");
        tituloVisualizarFunc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoVoltar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/back.png"))); // NOI18N
        botaoVoltar6.setText("Voltar");
        botaoVoltar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar6ActionPerformed(evt);
            }
        });

        tituloNome2.setText("Nome:");

        tituloCpf3.setText("Código do curso:");

        painelConsulta1.setBackground(new java.awt.Color(222, 235, 216));
        painelConsulta1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        painelConsulta1.setForeground(new java.awt.Color(204, 204, 204));
        painelConsulta1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        tituloConsultar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloConsultar1.setText("Consultar Curso");

        tituloCpf4.setText("Código: ");

        botaoPesquisar1.setBackground(new java.awt.Color(255, 255, 255));
        botaoPesquisar1.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/search.png"))); // NOI18N
        botaoPesquisar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoPesquisar1.setBorderPainted(false);
        botaoPesquisar1.setContentAreaFilled(false);
        botaoPesquisar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisar1ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConsulta1Layout = new javax.swing.GroupLayout(painelConsulta1);
        painelConsulta1.setLayout(painelConsulta1Layout);
        painelConsulta1Layout.setHorizontalGroup(
            painelConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsulta1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloConsultar1)
                    .addGroup(painelConsulta1Layout.createSequentialGroup()
                        .addComponent(tituloCpf4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelConsulta1Layout.setVerticalGroup(
            painelConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsulta1Layout.createSequentialGroup()
                .addComponent(tituloConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConsulta1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(painelConsulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tituloCpf4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelConsulta1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisar1))))
        );

        botaoPesquisar1.getAccessibleContext().setAccessibleName("btnSearchByCod");
        jTextField1.getAccessibleContext().setAccessibleName("txtCampoBuscaId");

        tituloAlunos1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloAlunos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/cursos.png"))); // NOI18N
        tituloAlunos1.setText("  Manter Cursos");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout guiaVisualizarAlunoLayout = new javax.swing.GroupLayout(guiaVisualizarAluno);
        guiaVisualizarAluno.setLayout(guiaVisualizarAlunoLayout);
        guiaVisualizarAlunoLayout.setHorizontalGroup(
            guiaVisualizarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaVisualizarAlunoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(guiaVisualizarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoVoltar6)
                    .addGroup(guiaVisualizarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiaVisualizarAlunoLayout.createSequentialGroup()
                            .addComponent(tituloAlunos1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(guiaVisualizarAlunoLayout.createSequentialGroup()
                            .addComponent(tituloNome2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2))
                        .addComponent(tituloVisualizarFunc)
                        .addGroup(guiaVisualizarAlunoLayout.createSequentialGroup()
                            .addComponent(tituloCpf3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        guiaVisualizarAlunoLayout.setVerticalGroup(
            guiaVisualizarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaVisualizarAlunoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(guiaVisualizarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloAlunos1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloVisualizarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(guiaVisualizarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloCpf3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(guiaVisualizarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloNome2)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(botaoVoltar6)
                .addGap(23, 23, 23))
        );

        jLabel1.getAccessibleContext().setAccessibleName("lblCodigoCurso");
        jLabel2.getAccessibleContext().setAccessibleName("lblNomeCurso");

        guiasAluno.addTab("Visualizar Curso", guiaVisualizarAluno);

        tituloAlunos2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloAlunos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/cursos.png"))); // NOI18N
        tituloAlunos2.setText("  Manter Cursos");

        painelConsulta2.setBackground(new java.awt.Color(222, 235, 216));
        painelConsulta2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        painelConsulta2.setForeground(new java.awt.Color(204, 204, 204));
        painelConsulta2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        tituloConsultar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloConsultar2.setText("Consultar Curso");

        tituloCpf5.setText("Código: ");

        botaoPesquisar2.setBackground(new java.awt.Color(255, 255, 255));
        botaoPesquisar2.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/search.png"))); // NOI18N
        botaoPesquisar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoPesquisar2.setBorderPainted(false);
        botaoPesquisar2.setContentAreaFilled(false);
        botaoPesquisar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConsulta2Layout = new javax.swing.GroupLayout(painelConsulta2);
        painelConsulta2.setLayout(painelConsulta2Layout);
        painelConsulta2Layout.setHorizontalGroup(
            painelConsulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsulta2Layout.createSequentialGroup()
                .addGroup(painelConsulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConsulta2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(tituloConsultar2))
                    .addGroup(painelConsulta2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloCpf5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPesquisarCpfFunc2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelConsulta2Layout.setVerticalGroup(
            painelConsulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsulta2Layout.createSequentialGroup()
                .addComponent(tituloConsultar2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelConsulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConsulta2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(painelConsulta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tituloCpf5)
                            .addComponent(campoPesquisarCpfFunc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelConsulta2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisar2))))
        );

        tituloVisualizarFunc1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloVisualizarFunc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarFunc1.setText("Curso");
        tituloVisualizarFunc1.setToolTipText("");
        tituloVisualizarFunc1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tituloCpf6.setText("Código do curso:");

        tituloNome3.setText("Nome:");

        botaoVoltar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/edit.png"))); // NOI18N
        botaoVoltar8.setText("Salvar Alterações");

        botaoVoltar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/back.png"))); // NOI18N
        botaoVoltar9.setText("Voltar");
        botaoVoltar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout guiaEditarAlunoLayout = new javax.swing.GroupLayout(guiaEditarAluno);
        guiaEditarAluno.setLayout(guiaEditarAlunoLayout);
        guiaEditarAlunoLayout.setHorizontalGroup(
            guiaEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaEditarAlunoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(guiaEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(guiaEditarAlunoLayout.createSequentialGroup()
                        .addComponent(botaoVoltar9)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVoltar8))
                    .addGroup(guiaEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiaEditarAlunoLayout.createSequentialGroup()
                            .addComponent(tituloAlunos2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tituloNome3)
                        .addComponent(tituloVisualizarFunc1)
                        .addComponent(tituloCpf6)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        guiaEditarAlunoLayout.setVerticalGroup(
            guiaEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaEditarAlunoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(guiaEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloAlunos2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloVisualizarFunc1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloCpf6)
                .addGap(18, 18, 18)
                .addComponent(tituloNome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(guiaEditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar9)
                    .addComponent(botaoVoltar8))
                .addGap(24, 24, 24))
        );

        guiasAluno.addTab("Editar Curso", guiaEditarAluno);

        tituloCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCadastrar.setText("Cadastrar Novo Curso");
        tituloCadastrar.setToolTipText("");
        tituloCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoCadastrar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoCadastrar1.setText("Cadastrar");
        botaoCadastrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrar1ActionPerformed(evt);
            }
        });

        botaoVoltar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/back.png"))); // NOI18N
        botaoVoltar5.setText("Voltar");
        botaoVoltar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar5ActionPerformed(evt);
            }
        });

        tituloNome.setText("Nome:");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        tituloAlunos3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloAlunos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/cursos.png"))); // NOI18N
        tituloAlunos3.setText("  Manter Cursos");

        javax.swing.GroupLayout guiaCadastrarAlunoLayout = new javax.swing.GroupLayout(guiaCadastrarAluno);
        guiaCadastrarAluno.setLayout(guiaCadastrarAlunoLayout);
        guiaCadastrarAlunoLayout.setHorizontalGroup(
            guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastrarAlunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoVoltar5)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastrar1)
                .addGap(26, 26, 26))
            .addGroup(guiaCadastrarAlunoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiaCadastrarAlunoLayout.createSequentialGroup()
                        .addGroup(guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(guiaCadastrarAlunoLayout.createSequentialGroup()
                                .addComponent(tituloNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(guiaCadastrarAlunoLayout.createSequentialGroup()
                        .addGroup(guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloCadastrar)
                            .addComponent(tituloAlunos3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 394, Short.MAX_VALUE))))
        );
        guiaCadastrarAlunoLayout.setVerticalGroup(
            guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastrarAlunoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloAlunos3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(guiaCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar5))
                .addContainerGap())
        );

        guiasAluno.addTab("Cadastrar Novo Curso", guiaCadastrarAluno);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void botaoPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisar1ActionPerformed
        // TODO add your handling code here:
        if (campoNome.getText().equals("")) {
                JOptionPane.showMessageDialog(this,"Informe o código do curso.","VALIDAÇÃO",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
    }//GEN-LAST:event_botaoPesquisar1ActionPerformed

    private void botaoPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPesquisar2ActionPerformed

    private void botaoVoltar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar6ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaoVoltar6ActionPerformed

    private void botaoVoltar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar9ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaoVoltar9ActionPerformed

    private void botaoVoltar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar5ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaoVoltar5ActionPerformed

    private void botaoCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrar1ActionPerformed
            
            if (campoNome.getText().equals("")) {
                JOptionPane.showMessageDialog(this,"Preencha todos os campos.","VALIDAÇÃO",JOptionPane.ERROR_MESSAGE);
            return;
            }
            
            int result = JOptionPane.showConfirmDialog(this, "Realmente deseja adicionar este curso?","CONFIRMAÇÃO",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (result != 0) {
                return;
            }            
            
            if (cadastro.verificaExistenciaNome(campoNome.getText())){
                //System.out.println("Curso já existente");
                JOptionPane.showMessageDialog(this,"Curso existente","ATENÇÃO",JOptionPane.ERROR_MESSAGE);
                campoNome.setText("");
                
            }else{
                try{
                Curso curso = new Curso();
                curso.setNome(campoNome.getText());
                cadastro.cadastrar(curso);
                campoNome.setText("");

                } catch (Exception ex) {
                    System.out.println("incluirCurso(): "+ex.toString());
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this,"Não foi possível cadastrar o curso.","ATENÇÃO",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
    
           
            
    }//GEN-LAST:event_botaoCadastrar1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCursos().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar1;
    private javax.swing.JButton botaoPesquisar1;
    private javax.swing.JButton botaoPesquisar2;
    private javax.swing.JButton botaoVoltar5;
    private javax.swing.JButton botaoVoltar6;
    private javax.swing.JButton botaoVoltar8;
    private javax.swing.JButton botaoVoltar9;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPesquisarCpfFunc2;
    private javax.swing.JPanel guiaCadastrarAluno;
    private javax.swing.JPanel guiaEditarAluno;
    private javax.swing.JPanel guiaVisualizarAluno;
    private javax.swing.JTabbedPane guiasAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel painelConsulta1;
    private javax.swing.JPanel painelConsulta2;
    private javax.swing.JLabel tituloAlunos1;
    private javax.swing.JLabel tituloAlunos2;
    private javax.swing.JLabel tituloAlunos3;
    private javax.swing.JLabel tituloCadastrar;
    private javax.swing.JLabel tituloConsultar1;
    private javax.swing.JLabel tituloConsultar2;
    private javax.swing.JLabel tituloCpf3;
    private javax.swing.JLabel tituloCpf4;
    private javax.swing.JLabel tituloCpf5;
    private javax.swing.JLabel tituloCpf6;
    private javax.swing.JLabel tituloNome;
    private javax.swing.JLabel tituloNome2;
    private javax.swing.JLabel tituloNome3;
    private javax.swing.JLabel tituloVisualizarFunc;
    private javax.swing.JLabel tituloVisualizarFunc1;
    // End of variables declaration//GEN-END:variables
}
