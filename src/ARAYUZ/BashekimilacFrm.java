/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ARAYUZ;

import KOD.DbBaglanti;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import KOD.IListeleBosalt;

/**
 *
 * @author oguzh
 */
public class BashekimilacFrm extends javax.swing.JFrame implements IListeleBosalt {
    DefaultTableModel ilacModel =new DefaultTableModel();
    Object[]kolonlar ={"İLAÇ NO", "İLAÇ İSMİ"};
    Object[]satirlar = new Object[2];

    /**
     * Creates new form BashekimilacFrm
     */
    public BashekimilacFrm() {
        initComponents();
        //Veritabanına bağlanıcak
        DbBaglanti.baglan();
        //Frame oluşurken ilaçları listeleyecek
        this.listele();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGeriGel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblilac = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtilacno = new javax.swing.JTextField();
        txtilacad = new javax.swing.JTextField();
        btnilackaydet = new javax.swing.JButton();
        btnilacsil = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin İlaç Erişme ve Düzenleme Ekranı");

        jPanel1.setBackground(new java.awt.Color(255, 224, 232));

        btnGeriGel.setBackground(new java.awt.Color(94, 158, 255));
        btnGeriGel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGeriGel.setText("Geri");
        btnGeriGel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriGelActionPerformed(evt);
            }
        });

        tblilac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "İLAÇ NO", "İLAÇ İSMİ"
            }
        ));
        tblilac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblilacMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblilac);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("İlaç No :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("İlaç İsmi :");

        txtilacno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtilacno.setForeground(new java.awt.Color(0, 0, 204));

        txtilacad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnilackaydet.setBackground(new java.awt.Color(119, 255, 119));
        btnilackaydet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnilackaydet.setText("İLAÇ KAYDET");
        btnilackaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnilackaydetActionPerformed(evt);
            }
        });

        btnilacsil.setBackground(new java.awt.Color(255, 125, 125));
        btnilacsil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnilacsil.setText("İLAÇ SİL");
        btnilacsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnilacsilActionPerformed(evt);
            }
        });

        jLabel3.setText("(İlaç no 4 haneli girilmelidir!)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGeriGel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtilacad, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtilacno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(120, 120, 120)
                                        .addComponent(jLabel3)))))
                        .addGap(0, 210, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(btnilackaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnilacsil, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGeriGel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtilacno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtilacad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnilackaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnilacsil, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriGelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriGelActionPerformed
        // TODO add your handling code here:
        BashekimFrm bashekimfrm1 = new BashekimFrm();

        this.setVisible(false);
        bashekimfrm1.setVisible(true);
        bashekimfrm1.pack();
        bashekimfrm1.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnGeriGelActionPerformed

    private void tblilacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblilacMouseClicked
        // TODO add your handling code here:
        
        txtilacno.setText((String) ilacModel.getValueAt(tblilac.getSelectedRow(),0));
        txtilacad.setText((String) ilacModel.getValueAt(tblilac.getSelectedRow(),1));
    }//GEN-LAST:event_tblilacMouseClicked

    private void btnilackaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnilackaydetActionPerformed
        // TODO add your handling code here:
        String ilacno,ilacad;
        ilacno=txtilacno.getText();
        ilacad=txtilacad.getText();
        if(ilacad.isEmpty() || ilacno.isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Boş alan bırakmayın!");
            
        }
        else if(ilacno.length()!=4){
            JOptionPane.showMessageDialog(null,"İlaç numarası 4 haneli girilmelidir!");
        }
        else{
        String kaydetSQL="INSERT INTO ilac (ilacno, ilacad)" +
        " VALUES ('"+ilacno+"', '"+ilacad+"')";
        
      
        
        DbBaglanti.kaydet(kaydetSQL);

      
        listele();
        txtbosalt();
        
        }
    }//GEN-LAST:event_btnilackaydetActionPerformed

    private void btnilacsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnilacsilActionPerformed
        // TODO add your handling code here:
         String ilacno;
        ilacno=txtilacno.getText();
        String deleteSQL="DELETE FROM ilac WHERE ilacno="+ilacno;
        
    
        DbBaglanti.sil(deleteSQL);
        
        listele();
        txtbosalt();
        
        
    }//GEN-LAST:event_btnilacsilActionPerformed

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
            java.util.logging.Logger.getLogger(BashekimilacFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BashekimilacFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BashekimilacFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BashekimilacFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BashekimilacFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeriGel;
    private javax.swing.JButton btnilackaydet;
    private javax.swing.JButton btnilacsil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblilac;
    private javax.swing.JTextField txtilacad;
    private javax.swing.JTextField txtilacno;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void listele(){
       
        
        String listeleSql = "select * from ilac";
        ResultSet rs = DbBaglanti.listele(listeleSql);
        ilacModel.setColumnCount(0);
        ilacModel.setRowCount(0);
        ilacModel.setColumnIdentifiers(kolonlar);
        
        try{
        while(rs.next()){
            satirlar[0]=rs.getString("ilacno");
            satirlar[1]=rs.getString("ilacad");
            
            ilacModel.addRow(satirlar);
        }
        tblilac.setModel(ilacModel);
    }catch(SQLException e){
        e.printStackTrace();
    }

}
    @Override
    public  void txtbosalt(){
        txtilacno.setText("");
        txtilacad.setText("");
        
       }


}
