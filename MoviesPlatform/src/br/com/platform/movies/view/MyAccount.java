package br.com.platform.movies.view;

import br.com.platform.movies.controller.MoviePersonController;
import br.com.platform.movies.model.Movie;
import br.com.platform.movies.session.Session;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ivanildo Borges
 * @author Elieudo Maia
 */
public class MyAccount extends javax.swing.JFrame {
    private MoviePersonController moviepersoncontroller;

    /**
     * Creates new form ClientArea
     */
    public MyAccount() {
        this.moviepersoncontroller = new MoviePersonController();
        initComponents();
        showInfo();
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
        allMovies = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lanc1 = new javax.swing.JButton();
        lanc2 = new javax.swing.JButton();
        lanc3 = new javax.swing.JButton();
        estatisticsNerds1 = new javax.swing.JButton();
        btnListUsers = new javax.swing.JButton();
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

        allMovies.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        allMovies.setForeground(new java.awt.Color(137, 61, 140));
        allMovies.setText("Todos os Filmes");
        allMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allMoviesActionPerformed(evt);
            }
        });
        getContentPane().add(allMovies);
        allMovies.setBounds(130, 90, 133, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(130, 19, 138));
        jLabel4.setText("Lista de filmes assistidos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 180, 300, 30);

        tabela.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome do filme", "Gênero", "Descrição", "Duração", "Faixa etária", "Dísponibilidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setRowHeight(20);
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(130);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(250);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(5).setResizable(false);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(120);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 240, 700, 220);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LANÇAMENTOS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 490, 150, 30);

        lanc1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lanc1.setText("Lançamento 1");
        getContentPane().add(lanc1);
        lanc1.setBounds(130, 520, 160, 30);

        lanc2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lanc2.setText("Lançamento 2");
        getContentPane().add(lanc2);
        lanc2.setBounds(390, 520, 160, 30);

        lanc3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lanc3.setText("Lançamento 3");
        getContentPane().add(lanc3);
        lanc3.setBounds(670, 520, 160, 30);

        estatisticsNerds1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        estatisticsNerds1.setForeground(new java.awt.Color(137, 61, 140));
        estatisticsNerds1.setText("Estatisticas para nerds");
        estatisticsNerds1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estatisticsNerds1ActionPerformed(evt);
            }
        });
        getContentPane().add(estatisticsNerds1);
        estatisticsNerds1.setBounds(280, 90, 170, 30);

        btnListUsers.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnListUsers.setForeground(new java.awt.Color(137, 61, 140));
        btnListUsers.setText("Usuários");
        btnListUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnListUsers);
        btnListUsers.setBounds(470, 90, 170, 30);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/platform/movies/midia/Retângulo 1.jpg"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 960, 590);

        setSize(new java.awt.Dimension(958, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showInfo() {
        int linha = 0;
        int idPessoa = Session.userId;
        List<Movie> movielist = this.moviepersoncontroller.getWatchedFilms(idPessoa);
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        String valor;
        
        try {      
            while (linha < movielist.size()) {
                
                if (movielist.get(linha).isIsAvaiable()) {
                    valor = "Diponível";
                } else {
                    valor = "Indiponível";
                }
                
                modelo.addRow(new Object[]{
                    movielist.get(linha).getName(),
                    movielist.get(linha).getGenre(),
                    movielist.get(linha).getDescription(),
                    movielist.get(linha).getDuration(),
                    movielist.get(linha).getAgeRange(),
                    valor,
                    linha++
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    }
    
    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        new Perfil().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilActionPerformed

    private void allMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allMoviesActionPerformed
        new AllMovie().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_allMoviesActionPerformed

  private void estatisticsNerds1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estatisticsNerds1ActionPerformed
    new EstatisticsNerds().setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_estatisticsNerds1ActionPerformed

  private void btnListUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListUsersActionPerformed
    new UserList().setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_btnListUsersActionPerformed

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
    private javax.swing.JButton btnListUsers;
    private javax.swing.JButton estatisticsNerds1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lanc1;
    private javax.swing.JButton lanc2;
    private javax.swing.JButton lanc3;
    private javax.swing.JButton perfil;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
