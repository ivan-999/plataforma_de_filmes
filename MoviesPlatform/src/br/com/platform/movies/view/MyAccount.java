package br.com.platform.movies.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivanildo Borges
 * @author Elieudo Maia
 */
public class MyAccount extends javax.swing.JFrame {

    /**
     * Creates new form ClientArea
     */
    public MyAccount() {
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
        perfil = new javax.swing.JButton();
        estatisticsNerds = new javax.swing.JButton();
        watchedMovies = new javax.swing.JButton();
        allMovies = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoText = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lanc1 = new javax.swing.JButton();
        lanc2 = new javax.swing.JButton();
        lanc3 = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minha Conta");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        Logo.setFont(new java.awt.Font("Stencil", 0, 50)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 0, 0));
        Logo.setText("PLATAFORMA DE FILMES");
        getContentPane().add(Logo);
        Logo.setBounds(170, 20, 580, 60);

        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/platform/movies/midia/avatar_user.jpg"))); // NOI18N
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        getContentPane().add(perfil);
        perfil.setBounds(840, 10, 90, 90);

        estatisticsNerds.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estatisticsNerds.setForeground(new java.awt.Color(137, 61, 140));
        estatisticsNerds.setText("Estatisticas para nerds");
        estatisticsNerds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estatisticsNerdsActionPerformed(evt);
            }
        });
        getContentPane().add(estatisticsNerds);
        estatisticsNerds.setBounds(490, 100, 180, 40);

        watchedMovies.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        watchedMovies.setForeground(new java.awt.Color(137, 61, 140));
        watchedMovies.setText("Filmes Assistidos");
        watchedMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchedMoviesActionPerformed(evt);
            }
        });
        getContentPane().add(watchedMovies);
        watchedMovies.setBounds(330, 100, 150, 40);

        allMovies.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allMovies.setForeground(new java.awt.Color(137, 61, 140));
        allMovies.setText("Todos os Filmes");
        allMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allMoviesActionPerformed(evt);
            }
        });
        getContentPane().add(allMovies);
        allMovies.setBounds(180, 100, 140, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Informe o nome do filme, gênero ou faixa etária do filme que");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 260, 590, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("deseja assistir:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 290, 150, 30);

        campoText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoText.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(campoText);
        campoText.setBounds(170, 330, 400, 26);

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(137, 61, 140));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/platform/movies/midia/button_search.jpg"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(570, 330, 170, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LANÇAMENTOS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 460, 150, 30);

        lanc1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lanc1.setText("Lançamento 1");
        getContentPane().add(lanc1);
        lanc1.setBounds(170, 490, 200, 40);

        lanc2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lanc2.setText("Lançamento 2");
        getContentPane().add(lanc2);
        lanc2.setBounds(380, 490, 200, 40);

        lanc3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lanc3.setText("Lançamento 3");
        getContentPane().add(lanc3);
        lanc3.setBounds(590, 490, 200, 40);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/platform/movies/midia/Retângulo 1.jpg"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 960, 590);

        setSize(new java.awt.Dimension(958, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void estatisticsNerdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estatisticsNerdsActionPerformed
        new EstatisticsNerds().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_estatisticsNerdsActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String valor = campoText.getText();
        
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_searchActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        new Perfil().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilActionPerformed

    private void allMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allMoviesActionPerformed
        new AllMovie().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_allMoviesActionPerformed

    private void watchedMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchedMoviesActionPerformed
        new WatchedMovies().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_watchedMoviesActionPerformed

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
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton allMovies;
    private javax.swing.JLabel backGround;
    private javax.swing.JTextField campoText;
    private javax.swing.JButton estatisticsNerds;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton lanc1;
    private javax.swing.JButton lanc2;
    private javax.swing.JButton lanc3;
    private javax.swing.JButton perfil;
    private javax.swing.JButton search;
    private javax.swing.JButton watchedMovies;
    // End of variables declaration//GEN-END:variables
}