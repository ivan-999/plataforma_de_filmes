package br.com.platform.movies.view;

/**
 *
 * @author Elieudo Maia
 * @author Ivanildo Borges
 */
public class UpdateMovie extends javax.swing.JFrame {

  /**
   * Creates new form UpdateMovie
   */
  public UpdateMovie() {
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

        Logo = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tabela = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        campo3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campo4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campo5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campo6 = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atualizar Filme");
        setResizable(false);
        getContentPane().setLayout(null);

        Logo.setFont(new java.awt.Font("Stencil", 0, 50)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 0, 0));
        Logo.setText("PLATAFORMA DE FILMES");
        getContentPane().add(Logo);
        Logo.setBounds(170, 20, 580, 60);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(137, 61, 140));
        jButton4.setText("CADASTRAR FILME");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(760, 30, 160, 30);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(137, 61, 140));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(350, 520, 99, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Clique na linha do filme que deseja alterar");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 110, 340, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(20);
        tabela.setViewportView(jTable1);

        getContentPane().add(tabela);
        tabela.setBounds(80, 140, 780, 160);

        jLabel0.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel0.setForeground(new java.awt.Color(255, 255, 255));
        jLabel0.setText("Altere somente os campos que deseja atualizar");
        getContentPane().add(jLabel0);
        jLabel0.setBounds(290, 320, 380, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 340, 60, 20);

        campo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(campo1);
        campo1.setBounds(90, 360, 430, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descrição:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 400, 90, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Faixa Etária:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(650, 340, 100, 30);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(90, 420, 430, 30);

        campo3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(campo3);
        campo3.setBounds(90, 480, 160, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gênero");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 450, 60, 30);

        campo4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(campo4);
        campo4.setBounds(770, 370, 90, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Duração:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(770, 340, 70, 30);

        campo5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(campo5);
        campo5.setBounds(650, 370, 90, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Disponibilidade:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(650, 400, 140, 30);

        campo6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(campo6);
        campo6.setBounds(650, 430, 210, 30);

        register.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        register.setForeground(new java.awt.Color(137, 61, 140));
        register.setText("Alterar");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register);
        register.setBounds(470, 520, 100, 40);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/platform/movies/midia/Retângulo 1.jpg"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 940, 570);

        setSize(new java.awt.Dimension(956, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new AllMovie().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new MovieForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
//        String name = this.name.getText();
//        String genre = (String) this.genre.getSelectedItem();
//        int ageRange = (int) this.ageRange.getValue();
//        int duration = (int) this.duration.getValue();
//        String description= this.description.getText();
//        boolean isAvailable = this.isAvailable.isSelected();
//
//        try {
//            this.movieController.createMovie(name, genre, description, duration, isAvailable, ageRange);
//
//            JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso");
//
//            new UpdateMovie().setVisible(true);
//            this.setVisible(false);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
    }//GEN-LAST:event_registerActionPerformed

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
      java.util.logging.Logger.getLogger(UpdateMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(UpdateMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(UpdateMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(UpdateMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new UpdateMovie().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel backGround;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo3;
    private javax.swing.JTextField campo4;
    private javax.swing.JTextField campo5;
    private javax.swing.JTextField campo6;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton register;
    private javax.swing.JScrollPane tabela;
    // End of variables declaration//GEN-END:variables
}
