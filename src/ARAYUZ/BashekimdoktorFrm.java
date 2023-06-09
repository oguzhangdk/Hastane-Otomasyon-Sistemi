/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ARAYUZ;

/**
 *
 * @author oguzh
 */
import KOD.DbBaglanti;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import KOD.IListeleBosalt;
public class BashekimdoktorFrm extends javax.swing.JFrame implements IListeleBosalt{
    DefaultTableModel doktorModel =new DefaultTableModel();
    Object[]kolonlar ={"Doktor Tc", "Doktor Ad", "Doktor Soyad", "Doktor Yaş", "Doktor Telefon","Doktor Mail", "Doktor Şifre"};
    Object[]satirlar = new Object[7];

    /**
     * Creates new form BashekimdoktorFrm
     */
    public BashekimdoktorFrm() {
        initComponents();
         //Veritabanına bağlantı sağlayacak
        DbBaglanti.baglan();
        //frame oluşurken direkt listeleme çalışacak
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoktor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txttc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsoyad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtyas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        btnDoktorKaydet = new javax.swing.JButton();
        btnDoktorUpdate = new javax.swing.JButton();
        btnDoktorSil = new javax.swing.JButton();
        btnGeriGel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtsifre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Doktor Erişme ve Düzenleme Ekranı");

        jPanel1.setBackground(new java.awt.Color(234, 255, 234));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));

        tblDoktor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Doktor Tc", "Doktor Ad", "Doktor Soyad", "Doktor Yaş", "Doktor Telefon", "Doktor Mail", "Doktor Şifre"
            }
        ));
        tblDoktor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoktorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDoktor);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Doktor Tc :");

        txttc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Doktor Adı :");

        txtad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Doktor Soyadı :");

        txtsoyad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Doktor Yaşı :");

        txtyas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Doktor Telefonu :");

        txttel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Doktor Maili :");

        txtmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnDoktorKaydet.setBackground(new java.awt.Color(119, 255, 119));
        btnDoktorKaydet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoktorKaydet.setText("DOKTOR KAYDET");
        btnDoktorKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoktorKaydetActionPerformed(evt);
            }
        });

        btnDoktorUpdate.setBackground(new java.awt.Color(255, 255, 51));
        btnDoktorUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoktorUpdate.setText("DOKTOR GÜNCELLE");
        btnDoktorUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoktorUpdateActionPerformed(evt);
            }
        });

        btnDoktorSil.setBackground(new java.awt.Color(255, 125, 125));
        btnDoktorSil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoktorSil.setText("DOKTOR SİL");
        btnDoktorSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoktorSilActionPerformed(evt);
            }
        });

        btnGeriGel.setBackground(new java.awt.Color(94, 158, 255));
        btnGeriGel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGeriGel.setText("Geri");
        btnGeriGel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriGelActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Doktor Şifresi :");

        txtsifre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGeriGel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel2))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(btnDoktorKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel4)))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtyas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(btnDoktorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel6)))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)
                                .addComponent(btnDoktorSil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnGeriGel)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txttc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDoktorKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(txtyas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDoktorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDoktorSil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDoktorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoktorMouseClicked
        // TODO add your handling code here:
        txttc.setText((String) doktorModel.getValueAt(tblDoktor.getSelectedRow(),0));
        txtad.setText((String) doktorModel.getValueAt(tblDoktor.getSelectedRow(),1));
        txtsoyad.setText((String) doktorModel.getValueAt(tblDoktor.getSelectedRow(),2));
        txtyas.setText((String) doktorModel.getValueAt(tblDoktor.getSelectedRow(),3));
        txttel.setText((String) doktorModel.getValueAt(tblDoktor.getSelectedRow(),4));
        txtmail.setText((String) doktorModel.getValueAt(tblDoktor.getSelectedRow(),5));
        txtsifre.setText((String) doktorModel.getValueAt(tblDoktor.getSelectedRow(),6));
    }//GEN-LAST:event_tblDoktorMouseClicked

    private void btnDoktorKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoktorKaydetActionPerformed
        // TODO add your handling code here:
        String tc, ad, soyad,yas, tel, mail, sifre;
        tc=txttc.getText();
        ad=txtad.getText();
        soyad=txtsoyad.getText();
        yas=txtyas.getText();
        tel=txttel.getText();
        mail=txtmail.getText();
        sifre=txtsifre.getText();
        
        if(tc.isEmpty() || ad.isEmpty() || soyad.isEmpty() || yas.isEmpty() || tel.isEmpty() ||mail.isEmpty()|| sifre.isEmpty() ){
            
            JOptionPane.showMessageDialog(null,"Boş alan bırakmayın!");
            
        }
        else if(tc.length()!=11){
            JOptionPane.showMessageDialog(null,"Tc numarası 11 karakter olmalıdır!");
        }
        else{
        String kaydetSQL="INSERT INTO doktor (dtc, dad, dsoyad, dyas, dtel, dmail, dsifre)" +
        " VALUES ('"+tc+"', '"+ad+"', '"+soyad+"', '"+yas+"', '"+tel+"', '"+mail+"', '"+sifre+"')";

        DbBaglanti.kaydet(kaydetSQL);
        listele();
        txtbosalt();
        }
    }//GEN-LAST:event_btnDoktorKaydetActionPerformed

    private void btnDoktorUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoktorUpdateActionPerformed
        // TODO add your handling code here:

        String tc, ad, soyad,yas, tel, mail, sifre;
        tc=txttc.getText();
        ad=txtad.getText();
        soyad=txtsoyad.getText();
        yas=txtyas.getText();
        tel=txttel.getText();
        mail=txtmail.getText();
        sifre=txtsifre.getText();

        String updateSQL="UPDATE doktor SET dtc='"+tc+"',"+"dad='"+ad+"',"+"dsoyad='"+soyad+"',"+"dyas='"+yas+"',"+"dtel='"+tel+"', dmail='"+mail+"', dsifre='"+sifre+"' WHERE dtc="+tc;

        DbBaglanti.update(updateSQL);
        listele();
        txtbosalt();
    }//GEN-LAST:event_btnDoktorUpdateActionPerformed

    private void btnDoktorSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoktorSilActionPerformed
        // TODO add your handling code here:

        String tc;
        tc=txttc.getText();
        String deleteSQL="DELETE FROM doktor WHERE dtc="+tc;

        DbBaglanti.sil(deleteSQL);

        listele();
        txtbosalt();
    }//GEN-LAST:event_btnDoktorSilActionPerformed

    private void btnGeriGelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriGelActionPerformed
        // TODO add your handling code here:
        BashekimFrm bashekimfrm1 = new BashekimFrm();

        this.setVisible(false);
        bashekimfrm1.setVisible(true);
        bashekimfrm1.pack();
        bashekimfrm1.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnGeriGelActionPerformed

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
            java.util.logging.Logger.getLogger(BashekimdoktorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BashekimdoktorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BashekimdoktorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BashekimdoktorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BashekimdoktorFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoktorKaydet;
    private javax.swing.JButton btnDoktorSil;
    private javax.swing.JButton btnDoktorUpdate;
    private javax.swing.JButton btnGeriGel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDoktor;
    private javax.swing.JTextField txtad;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtsifre;
    private javax.swing.JTextField txtsoyad;
    private javax.swing.JTextField txttc;
    private javax.swing.JTextField txttel;
    private javax.swing.JTextField txtyas;
    // End of variables declaration//GEN-END:variables
 //tabloya listeleme sağlar
    @Override
    public void listele(){
       
        
        String listeleSql = "select * from doktor";
        ResultSet rs = DbBaglanti.listele(listeleSql);
        doktorModel.setColumnCount(0);
        doktorModel.setRowCount(0);
        doktorModel.setColumnIdentifiers(kolonlar);
        
        try{
        while(rs.next()){
            satirlar[0]=rs.getString("dtc");
            satirlar[1]=rs.getString("dad");
            satirlar[2]=rs.getString("dsoyad");
            satirlar[3]=rs.getString("dyas");
            satirlar[4]=rs.getString("dtel");
            satirlar[5]=rs.getString("dmail");
            satirlar[6]=rs.getString("dsifre");
            doktorModel.addRow(satirlar);
        }
        tblDoktor.setModel(doktorModel);
    }catch(SQLException e){
        e.printStackTrace();
    }
}
    @Override
     public void txtbosalt(){
        txttc.setText("");
        txtad.setText("");
        txtsoyad.setText("");
        txtyas.setText("");
        txttel.setText("");
        txtmail.setText("");
        txtsifre.setText("");
       }
}
    
