package br.com.platform.movies.view;

import br.com.platform.movies.controller.MovieController;
import br.com.platform.movies.model.Movie;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elieudo Maia
 * @author Ivanildo Borges
 */
public class UpdateMovie extends javax.swing.JFrame {
    private MovieController movieController;
    private int id;
    
  /**
   * Creates new form UpdateMovie
   */
  public UpdateMovie() {
        this.movieController = new MovieController();
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
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campo2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
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

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(137, 61, 140));
        jButton3.setText("VOLTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 30, 90, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Clique na linha do filme que deseja alterar");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 110, 340, 30);

        tabela.setAutoCreateRowSorter(true);
        tabela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Gênero", "Descrição", "Duração", "Faixa Etária", "Disponibilidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(80);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(250);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(5).setResizable(false);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(6).setResizable(false);
            tabela.getColumnModel().getColumn(6).setPreferredWidth(130);
        }

        getContentPane().add(jScrollPane);
        jScrollPane.setBounds(80, 140, 780, 160);

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

        campo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(campo2);
        campo2.setBounds(90, 480, 160, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Faixa Etária:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(650, 340, 100, 30);

        campo3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(campo3);
        campo3.setBounds(90, 420, 430, 30);

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
        register.setText("ATUALIZAR");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register);
        register.setBounds(420, 500, 120, 40);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/platform/movies/midia/Retângulo 1.jpg"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 940, 570);

        setSize(new java.awt.Dimension(956, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showInfo() {
        int linha = 0;
        List<Movie> movieList = this.movieController.listAll("", "", 0);
        DefaultTableModel modelo;
        String valor = "";
        
        try {
            modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            
            while (linha < movieList.size()) {
             
                //Salva uma mensagem para disponibilidade do filme    
                if (movieList.get(linha).isIsAvaiable()) {
                    valor = "Disponível";
                } else {
                    valor = "Indisponível";
                }
                
                //Cria um objeto e adiciona numa linha da tabela
                //Cada linha é composta de colunas com os seguintes valores da
                //lista de filmes (movieList):
                modelo.addRow(new Object[]{
                    movieList.get(linha).getId(),
                    movieList.get(linha).getName(),
                    movieList.get(linha).getGenre(),
                    movieList.get(linha).getDescription(),
                    movieList.get(linha).getDuration(),
                    movieList.get(linha).getAgeRange(),
                    valor,
                    linha++
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new AllMovie().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new MovieForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed

        try {
            String nome = campo1.getText();
            String genero = campo2.getText();
            String descricao = campo3.getText();
            int duracao =  Integer.parseInt(campo4.getText());
            int faixaEtaria = Integer.parseInt(campo5.getText());
            boolean disponivel = Boolean.parseBoolean(campo6.getText());
            
            System.out.println("Valor id: " + id);
            System.out.println("Valor nome: " + nome);
            System.out.println("Valor genero: " + genero);
            System.out.println("Valor descrição: " + descricao);
            System.out.println("Valor duração: " + duracao);
            System.out.println("Valor disponibilidade: " + disponivel);
            System.out.println("Valor faixa etária: " + faixaEtaria);
            
            this.movieController.updateMovie(id, nome, genero, descricao, duracao, disponivel, faixaEtaria);
            JOptionPane.showMessageDialog(null, "Filme atualizado com sucesso!");
            showInfo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_registerActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        try {
            int linha = tabela.getSelectedRow();
            int coluna = 1;
            int colunaAux = 0;
            String nome;
            String genero;
            String descricao;
            int duracao;
            int faixaEtaria;
            String disponivel;
            int identificador;

            System.out.println("LINHA: " + linha);
            System.out.println("COLUNA: " + coluna);

            identificador = (int) tabela.getValueAt(linha, colunaAux);
            System.out.println("ID do Filme " + identificador);
            
            nome = (String) tabela.getValueAt(linha, 1);
            genero = (String) tabela.getValueAt(linha, 2);
            descricao = (String) tabela.getValueAt(linha, 3);
            duracao =  (int) tabela.getValueAt(linha, 4);
            faixaEtaria = (int) tabela.getValueAt(linha, 5);
            disponivel = (String) tabela.getValueAt(linha, 6);
            
            boolean disponibilidade;
            
            if (disponivel.equals("Disponível")) {
                disponibilidade = true;
            } else {
                disponibilidade = false;
            }
            
            campo1.setText(nome);
            campo2.setText(genero);
            campo3.setText(descricao);
            campo4.setText(Integer.toString(duracao));
            campo5.setText(Integer.toString(faixaEtaria));
            campo6.setText(Boolean.toString(disponibilidade));

            this.id = identificador;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tabelaMouseClicked
   
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
    private javax.swing.JTextField campo2;
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
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton register;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}