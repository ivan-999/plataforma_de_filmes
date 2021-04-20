package br.com.platform.movies.view;

/**
 *
 * @author Elieudo Maia
 * @author Ivanildo Borges
 */
public class EstatisticsNerds extends javax.swing.JFrame {

    /**
     * Creates new form EstatisticsNerds
     */
    public EstatisticsNerds() {
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

        back1 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoText = new javax.swing.JTextField();
        tableInfo = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        campoText2 = new javax.swing.JTextField();
        media = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        backGround = new javax.swing.JLabel();

        back1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back1.setForeground(new java.awt.Color(137, 61, 140));
        back1.setText("VOLTAR");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estatísticas para Nerds");
        setResizable(false);
        getContentPane().setLayout(null);

        Logo.setFont(new java.awt.Font("Stencil", 0, 50)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 0, 0));
        Logo.setText("PLATAFORMA DE FILMES");
        getContentPane().add(Logo);
        Logo.setBounds(170, 20, 580, 60);

        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(137, 61, 140));
        back.setText("VOLTAR");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(20, 30, 90, 29);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(130, 19, 138));
        jLabel4.setText("ESTATÍSTICAS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 130, 170, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total de minutos assistidos:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 220, 240, 30);

        campoText.setEditable(false);
        campoText.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        campoText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoText.setText("0");
        campoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextActionPerformed(evt);
            }
        });
        getContentPane().add(campoText);
        campoText.setBounds(410, 220, 80, 30);

        tableInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Gênero", "Minutos gastos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableInfo.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Minutos gastos");
        }

        getContentPane().add(tableInfo);
        tableInfo.setBounds(190, 260, 300, 240);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Média Total:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 220, 100, 30);

        campoText2.setEditable(false);
        campoText2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        campoText2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoText2.setText("0");
        campoText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoText2ActionPerformed(evt);
            }
        });
        getContentPane().add(campoText2);
        campoText2.setBounds(640, 220, 100, 30);

        media.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Média por gênero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        media.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(100);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        getContentPane().add(media);
        media.setBounds(540, 260, 200, 240);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/platform/movies/midia/Retângulo 1.jpg"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 960, 590);

        setSize(new java.awt.Dimension(958, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MyAccount().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        new MyAccount().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back1ActionPerformed

    private void campoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextActionPerformed

    private void campoText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoText2ActionPerformed

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
            java.util.logging.Logger.getLogger(EstatisticsNerds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstatisticsNerds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstatisticsNerds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstatisticsNerds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstatisticsNerds().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JLabel backGround;
    private javax.swing.JTextField campoText;
    private javax.swing.JTextField campoText2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane media;
    private javax.swing.JScrollPane tableInfo;
    // End of variables declaration//GEN-END:variables
}
