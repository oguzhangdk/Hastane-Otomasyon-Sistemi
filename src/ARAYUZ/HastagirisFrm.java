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
import KOD.IAnaFrameDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Font;
import java.awt.Color;
import KOD.IKarsilaBilgidoldur;
public class HastagirisFrm extends javax.swing.JFrame implements IKarsilaBilgidoldur,IAnaFrameDon{

    /**
     * Creates new form HastagirisFrm
     */
    public HastagirisFrm() {
        initComponents();
        DbBaglanti.baglan();
        karsıla();
        bilgiDoldur();
        
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
        lblsikayet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblrecete = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbleczanekod = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblsırano = new javax.swing.JLabel();
        btnGeriGel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblilac = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hasta Bilgilendirme Ekranı");

        jPanel1.setBackground(new java.awt.Color(255, 242, 229));

        lblKarsıla.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblKarsıla.setText("Sayın Adı Soyadı Hoşgeldiniz!");

        lblsikayet.setText("Doktorunuz henüz şikayetinizi girmedi, şikayetiniz bu alanda görülecektir.");
        lblsikayet.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Şikayet :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Reçete :");

        lblrecete.setText("Doktorunuz henüz reçetenizi girmedi, reçeteniz bu alanda görülecektir.");
        lblrecete.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Eczane Kodunuz :");

        lbleczanekod.setText("Personel henüz eczane kodunuzu girmedi, kod bu alanda görülecektir.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Sıra Numaranız :");

        lblsırano.setText("Personel henüz sıra  numaranızı girmedi, sıra no bu alanda görülecektir.");

        btnGeriGel.setBackground(new java.awt.Color(94, 158, 255));
        btnGeriGel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGeriGel.setText("Geri");
        btnGeriGel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriGelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("İlacınız :");

        lblilac.setText("Doktorunuz henüz ilaç vermedi, ilaç adı bu alanda görülecektir.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblKarsıla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGeriGel)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsikayet, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblrecete, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lbleczanekod))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblilac)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lblsırano, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKarsıla, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeriGel))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblsırano, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblsikayet, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblrecete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbleczanekod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblilac, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(HastagirisFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastagirisFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastagirisFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastagirisFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastagirisFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeriGel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblKarsıla;
    private javax.swing.JLabel lbleczanekod;
    private javax.swing.JLabel lblilac;
    private javax.swing.JLabel lblrecete;
    private javax.swing.JLabel lblsikayet;
    private javax.swing.JLabel lblsırano;
    // End of variables declaration//GEN-END:variables

    @Override
    public void karsıla(){
        String girenHastaTc=MainFrm.hastaTc;
        String karsilaSQL="SELECT * FROM hasta WHERE htc='"+girenHastaTc+"'";
        ResultSet myRs=DbBaglanti.listele(karsilaSQL);
        try{
        while(myRs.next()){
        lblKarsıla.setText("SAYIN "+myRs.getString(2)+" "+myRs.getString(3)+" HOŞGELDİNİZ");

 
    }}catch(SQLException e){
            e.printStackTrace();
            }
}
    
    
    @Override
    public void bilgiDoldur(){
         String girenHastaTc=MainFrm.hastaTc;
    
         
         
    String girenHastaDoktordanBilgiSQL="SELECT * FROM dislev WHERE htc='"+girenHastaTc+"'";
    ResultSet myRs=DbBaglanti.listele(girenHastaDoktordanBilgiSQL);
    
    
     try{
         
     while(myRs.next()){
        lblsikayet.setText(myRs.getString(2));
        lblrecete.setText(myRs.getString(3));
        lblilac.setText(myRs.getString(4));
  
        
     }
     }catch(SQLException e){
             e.printStackTrace();
             }
     
     String girenHastaPersoneldenBilgiSQL="SELECT * FROM pislev WHERE htc='"+girenHastaTc+"'";
    ResultSet myRs1=DbBaglanti.listele(girenHastaPersoneldenBilgiSQL);
    
    try{
        while(myRs1.next()){
            lblsırano.setText(myRs1.getString(2));
            lbleczanekod.setText(myRs1.getString(3));
            
        }
    }catch(SQLException a){
        a.printStackTrace();
    }
     
    
    //VERİYE GÖRE RENK VE FONT İŞLERİ
    if(lblsikayet.getText()==null){
        lblsikayet.setText("Doktorunuz henüz şikayetinizi girmedi, şikayetiniz bu alanda görülecektir.");
        lblsikayet.setForeground(new Color(221, 40, 40));
    }
    if(lblrecete.getText()==null){
        lblrecete.setText("Doktorunuz henüz reçetenizi girmedi, reçeteniz bu alanda görülecektir.");
        lblrecete.setForeground(new Color(221, 40, 40));
    }
    if(lblilac.getText()==null){
        lblilac.setText("Doktorunuz henüz ilaç vermedi, ilaç adı bu alanda görülecektir.");
        lblilac.setForeground(new Color(221, 40, 40));
        
    }
    else{
        lblilac.setFont(new Font("Times New Roman", Font.BOLD, 32));
    }
    if(lblsırano.getText()==null){
        lblsırano.setText("Personel henüz sıra  numaranızı girmedi, sıra no bu alanda görülecektir.");
        lblsırano.setForeground(new Color(221, 40, 40));
    }
    else{
        lblsırano.setFont(new Font("Times New Roman", Font.BOLD, 32));
    }
    if(lbleczanekod.getText()==null){
        lbleczanekod.setText("Personel henüz eczane kodunuzu girmedi, kod bu alanda görülecektir.");
        lbleczanekod.setForeground(new Color(221, 40, 40));
    }else{
        lbleczanekod.setFont(new Font("Times New Roman", Font.BOLD, 32));
    }
  
    
}
    }