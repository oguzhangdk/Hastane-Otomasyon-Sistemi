/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ARAYUZ;

import KOD.DbBaglanti;
import KOD.IAnaFrameDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import KOD.IKarsilaBilgidoldur;

/**
 *
 * @author oguzh
 */
public class PersonelgirisFrm extends javax.swing.JFrame implements IKarsilaBilgidoldur,IAnaFrameDon{
    static String secilenHastaTc;

    /**
     * Creates new form PersonelgirisFrm
     */
    public PersonelgirisFrm() {
        initComponents();
        DbBaglanti.baglan();
        karsıla();
        comboBoxListele();
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
        lblKarsıla = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnHastaGetir = new javax.swing.JButton();
        btnGeriGel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbltc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblsoyad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblyas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbltel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblcinsiyet = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSıra = new javax.swing.JTextField();
        txtEczane = new javax.swing.JTextField();
        btnSıraNoVer = new javax.swing.JButton();
        btnEczaneKoduGonder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personel Giriş Ekranı");

        jPanel1.setBackground(new java.awt.Color(255, 255, 225));

        lblKarsıla.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblKarsıla.setText("Sayın Hasta Personeli Adı Soyadı Hoşgeldiniz!");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Hasta Seçin");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnHastaGetir.setBackground(new java.awt.Color(255, 204, 51));
        btnHastaGetir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHastaGetir.setText("Hasta Getir");
        btnHastaGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHastaGetirActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Hasta Tc :");

        lbltc.setText("bos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Hasta Adı :");

        lblad.setText("bos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Hasta Soyadı :");

        lblsoyad.setText("bos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Hasta Yaşı :");

        lblyas.setText("bos");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Hasta Telefonu :");

        lbltel.setText("bos");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Hasta Cinsiyet :");

        lblcinsiyet.setText("bos");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Sıra Numarası Verin");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Eczane Kodu Girin");

        txtSıra.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtSıra.setForeground(new java.awt.Color(0, 0, 255));

        txtEczane.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtEczane.setForeground(new java.awt.Color(0, 0, 255));

        btnSıraNoVer.setBackground(new java.awt.Color(160, 255, 190));
        btnSıraNoVer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSıraNoVer.setText("SIRA NO VER");
        btnSıraNoVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSıraNoVerActionPerformed(evt);
            }
        });

        btnEczaneKoduGonder.setBackground(new java.awt.Color(82, 207, 122));
        btnEczaneKoduGonder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEczaneKoduGonder.setText("ECZANE KODU GÖNDER");
        btnEczaneKoduGonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEczaneKoduGonderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKarsıla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGeriGel)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbltel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblyas, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblad, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbltc, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)))
                .addComponent(btnHastaGetir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(205, 205, 205))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(txtSıra, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310)
                .addComponent(txtEczane, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnSıraNoVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEczaneKoduGonder, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKarsıla, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeriGel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHastaGetir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbltc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(11, 11, 11)
                        .addComponent(lblsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblyas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEczane)
                    .addComponent(txtSıra, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEczaneKoduGonder, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnSıraNoVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
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
        btnAnaFrameDon(evt);
    }//GEN-LAST:event_btnGeriGelActionPerformed

     @Override
    public void btnAnaFrameDon(java.awt.event.ActionEvent evt){
          MainFrm mainfrm1 = new MainFrm();
       
        this.setVisible(false);
        mainfrm1.setVisible(true);
        mainfrm1.pack();
        mainfrm1.setLocationRelativeTo(null);
        
    }
    private void btnHastaGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHastaGetirActionPerformed
        // TODO add your handling code here:

        String comboBoxYazısı;
        comboBoxYazısı = jComboBox1.getSelectedItem().toString();

        secilenHastaTc=comboBoxYazısı.substring(5, 16);

        bilgiDoldur();
    }//GEN-LAST:event_btnHastaGetirActionPerformed

    private void btnSıraNoVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSıraNoVerActionPerformed

        // TODO add your handling code here:
        if(txtSıra.toString().isEmpty()){
            JOptionPane.showMessageDialog(null,"Sıra no giriniz!");
        }else{
            
            String UpdateSikayetSQL="UPDATE pislev SET sıra = '"+txtSıra.getText().toString()+"' WHERE htc="+secilenHastaTc;
            
            DbBaglanti.update(UpdateSikayetSQL);
            
            JOptionPane.showMessageDialog(null,"Hastaya sıra bilgisi gönderildi, hasta bilgileri kendi ekranından takip edebilir!");
           
        }
        
    }//GEN-LAST:event_btnSıraNoVerActionPerformed

    private void btnEczaneKoduGonderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEczaneKoduGonderActionPerformed
        // TODO add your handling code here:
         if(txtEczane.toString().isEmpty()){
            JOptionPane.showMessageDialog(null,"Hastaya gönderilmek üzere eczane kodu giriniz!");
        }else{
            
            String UpdateSikayetSQL="UPDATE pislev SET eczanekod = '"+txtEczane.getText().toString()+"' WHERE htc="+secilenHastaTc;
            
            DbBaglanti.update(UpdateSikayetSQL);
            
            JOptionPane.showMessageDialog(null,"Hastaya eczane kodu gönderildi, hasta eczaneden ilaç almak için gerekli kod bilgisini kendi ekranından görebilir!");
           
        }
    }//GEN-LAST:event_btnEczaneKoduGonderActionPerformed

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
            java.util.logging.Logger.getLogger(PersonelgirisFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelgirisFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelgirisFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelgirisFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelgirisFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEczaneKoduGonder;
    private javax.swing.JButton btnGeriGel;
    private javax.swing.JButton btnHastaGetir;
    private javax.swing.JButton btnSıraNoVer;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblKarsıla;
    private javax.swing.JLabel lblad;
    private javax.swing.JLabel lblcinsiyet;
    private javax.swing.JLabel lblsoyad;
    private javax.swing.JLabel lbltc;
    private javax.swing.JLabel lbltel;
    private javax.swing.JLabel lblyas;
    private javax.swing.JTextField txtEczane;
    private javax.swing.JTextField txtSıra;
    // End of variables declaration//GEN-END:variables

    @Override
    public void karsıla(){
        String girenPersonelTc=MainFrm.personelTc;
        String karsilaSQL="SELECT * FROM personel WHERE ptc='"+girenPersonelTc+"'";
        ResultSet myRs=DbBaglanti.listele(karsilaSQL);
        try{
        while(myRs.next()){
        lblKarsıla.setText("SAYIN HASTA PERSONELİ "+myRs.getString(2)+" "+myRs.getString(3)+" HOŞGELDİNİZ");

 
    }}catch(SQLException e){
            e.printStackTrace();
            }
}
    void comboBoxListele(){
    String sql="SELECT * FROM hasta";
    ResultSet myRs=DbBaglanti.listele(sql);
    
  
    try{
        
        while(myRs.next()){
            jComboBox1.addItem("Tc:  "+myRs.getString(1)+" Adı:  "+myRs.getString(2)+" Soyadı:  "+myRs.getString(3));
        }
        
    }catch(SQLException e){
        e.printStackTrace();
    }
            
}
    
    @Override
    public void bilgiDoldur(){
    
    String secilenHastaGetirSQL="SELECT * FROM hasta WHERE htc='"+secilenHastaTc+"'";
    ResultSet myRs=DbBaglanti.listele(secilenHastaGetirSQL);
    
    
     try{
         
     while(myRs.next()){
        lbltc.setText(myRs.getString(1));
        lblad.setText(myRs.getString(2));
        lblsoyad.setText(myRs.getString(3));
        lblyas.setText(myRs.getString(4));
        lbltel.setText(myRs.getString(5));
        lblcinsiyet.setText(myRs.getString(7));
        
         
        
     }
     }catch(SQLException e){
             e.printStackTrace();
             }
     
       
}

}
