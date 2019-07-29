
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.*;


public class ForgotPassword extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
   
    public ForgotPassword() {
      initComponents();
      
      try
      {
        con= DriverManager.getConnection("jdbc:derby://localhost:1527/Librarysystem","app","app");
        JOptionPane.showMessageDialog(null,"Connection Sucessfull");
        
        
      }
      catch(Exception e)
      {
       JOptionPane.showMessageDialog(null,"Error" +e.getMessage());    
      }
     
      
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtforgotname = new javax.swing.JTextField();
        btnretrive = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtforgotusername = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        txtforgotpassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtforgotanswer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtforgotsecurity = new javax.swing.JTextField();
        btnforgotsearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0)), "Forgot Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Answer");

        txtforgotname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtforgotnameActionPerformed(evt);
            }
        });

        btnretrive.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnretrive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-import-16.png"))); // NOI18N
        btnretrive.setText("Retrive");
        btnretrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnretriveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        txtforgotusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtforgotusernameActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-arrow-24.png"))); // NOI18N
        jButton3.setText("Back");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Your Security Question");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Your Password");

        btnforgotsearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnforgotsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-24.png"))); // NOI18N
        btnforgotsearch.setText("Search");
        btnforgotsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnforgotsearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("User Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtforgotusername)
                    .addComponent(txtforgotname)
                    .addComponent(txtforgotsecurity)
                    .addComponent(txtforgotanswer)
                    .addComponent(txtforgotpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnretrive)
                    .addComponent(jButton3)
                    .addComponent(btnforgotsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnforgotsearch)
                        .addGap(4, 4, 4)
                        .addComponent(txtforgotname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtforgotsecurity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtforgotusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtforgotanswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnretrive))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtforgotpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtforgotusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtforgotusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtforgotusernameActionPerformed

    private void txtforgotnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtforgotnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtforgotnameActionPerformed

    private void btnforgotsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnforgotsearchActionPerformed
    
String value = txtforgotusername.getText();
 
        
   try
   {
       
  ps=con.prepareStatement("Select * from account where username=?", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
  ps.setString(1, value);
  rs=ps.executeQuery();
  
  if(rs.next())
  {
   txtforgotname.setText(rs.getString("NAME"));
   txtforgotsecurity.setText(rs.getString("SEC_Q"));
      
  }
  
  else
  {
      
      JOptionPane.showMessageDialog(null,"Record not found");
  }
        

   }
catch(Exception e)
{
 JOptionPane.showMessageDialog(null,"Error......."+e.getMessage());  
}
           
        
        
    }//GEN-LAST:event_btnforgotsearchActionPerformed

    private void btnretriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnretriveActionPerformed
        
             String a2=txtforgotanswer.getText();
        
      try
      {
       ps=con.prepareStatement("Select * from account where answer=?");
       ps.setString(1, a2);
       rs=ps.executeQuery();
       
       if(rs.next())
       {
           txtforgotpassword.setText(rs.getString("PASSWORD"));
       }
       
      }
      
      catch(Exception e)
      {
        JOptionPane.showMessageDialog(null,"Error......."+e.getMessage());    
      }
        
    }//GEN-LAST:event_btnretriveActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnforgotsearch;
    private javax.swing.JButton btnretrive;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtforgotanswer;
    private javax.swing.JTextField txtforgotname;
    private javax.swing.JTextField txtforgotpassword;
    private javax.swing.JTextField txtforgotsecurity;
    private javax.swing.JTextField txtforgotusername;
    // End of variables declaration//GEN-END:variables

    private Connection DriverManager(String jdbcderbylocalhost1527Librarysystem, String app, String app0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
