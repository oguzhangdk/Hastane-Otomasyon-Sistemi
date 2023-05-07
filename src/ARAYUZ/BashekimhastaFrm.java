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
public class BashekimhastaFrm extends javax.swing.JFrame implements IListeleBosalt{
    DefaultTableModel hastaModel =new DefaultTableModel();
    Object[]kolonlar ={"Hasta Tc", "Hasta Ad", "Hasta Soyad", "Hasta Yaş", "Hasta Telefon", "Hasta Şifresi", "Hasta Cinsiyet"};
    Object[]satirlar = new Object[7];


    /**
     * Creates new form BashekimhastaFrm
     */
    public BashekimhastaFrm() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHasta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttc = new javax.swing.JTextField();
        txtad = new javax.swing.JTextField();
        txtsoyad = new javax.swing.JTextField();
        txtyas = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        btnHastaKaydet = new javax.swing.JButton();
        btnHastaUpdate = new javax.swing.JButton();
        btnHastaSil = new javax.swing.JButton();
        btnGeriGel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtsifre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rbtnerkek = new javax.swing.JRadioButton();
        rbtnkadın = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Hasta Erişme ve Düzenleme Ekranı");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 238, 213));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));

        tblHasta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Hasta Tc", "Hasta Ad", "Hasta Soyad", "Hasta Yaş", "Hasta Telefon", "Hasta Şifre", "Hasta Cinsiyet"
            }
        ));
        tblHasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHastaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHasta);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Hasta Tc :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Hasta Adı :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Hasta Soyadı :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Hasta Yaşı :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Hasta Telefonu :");

        txttc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtsoyad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtyas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txttel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnHastaKaydet.setBackground(new java.awt.Color(119, 255, 119));
        btnHastaKaydet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHastaKaydet.setText("HASTA KAYDET");
        btnHastaKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHastaKaydetActionPerformed(evt);
            }
        });

        btnHastaUpdate.setBackground(new java.awt.Color(255, 255, 51));
        btnHastaUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHastaUpdate.setText("HASTA GÜNCELLE");
        btnHastaUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHastaUpdateActionPerformed(evt);
            }
        });

        btnHastaSil.setBackground(new java.awt.Color(255, 125, 125));
        btnHastaSil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHastaSil.setText("HASTA SİL");
        btnHastaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHastaSilActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Hasta Şifresi :");

        txtsifre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Hasta Cinsiyet :");

        buttonGroup1.add(rbtnerkek);
        rbtnerkek.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnerkek.setText("Erkek");

        buttonGroup1.add(rbtnkadın);
        rbtnkadın.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnkadın.setText("Kadın");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(btnHastaKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtyas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnerkek)
                                    .addComponent(rbtnkadın))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHastaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHastaSil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnGeriGel)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeriGel))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txttc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnHastaKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHastaUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnHastaSil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtyas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnerkek)
                        .addGap(18, 18, 18)))
                .addComponent(rbtnkadın)
                .addContainerGap())
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

    private void btnHastaKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHastaKaydetActionPerformed
        // TODO add your handling code here:
        String tc, ad, soyad,yas, tel,sifre, cinsiyet;
        tc=txttc.getText();
        ad=txtad.getText();
        soyad=txtsoyad.getText();
        yas=txtyas.getText();
        tel=txttel.getText();
        sifre=txtsifre.getText();
        
        if(rbtnerkek.isSelected()){
            cinsiyet="Erkek";
        }
        else if (rbtnkadın.isSelected()){
            cinsiyet="Kadın";
        }
        else{
            cinsiyet="";
        }
        
        if(tc.isEmpty() || ad.isEmpty() || soyad.isEmpty() || yas.isEmpty() || tel.isEmpty() || sifre.isEmpty() || cinsiyet.isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Boş alan bırakmayın!");
            
        }
        else if(tc.length()!=11){
            JOptionPane.showMessageDialog(null,"Tc numarası 11 karakter olmalıdır!");
        }
        else{
        String kaydetSQL="INSERT INTO hasta (htc, had, hsoyad, hyas, htel, hsifre, hcinsiyet)" +
        " VALUES ('"+tc+"', '"+ad+"', '"+soyad+"', '"+yas+"', '"+tel+"', '"+sifre+"', '"+cinsiyet+"')";
        
        String kaydetdislevSQL="INSERT INTO dislev (htc)" +
        " VALUES ('"+tc+"')";
        
        String kaydetpislevSQL="INSERT INTO pislev (htc)" +
        " VALUES ('"+tc+"')";
        
        
        DbBaglanti.kaydet(kaydetSQL,kaydetdislevSQL,kaydetpislevSQL);
       
        
        listele();
        txtbosalt();
        buttonGroup1.clearSelection();
        }
    }//GEN-LAST:event_btnHastaKaydetActionPerformed

    private void tblHastaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHastaMouseClicked
        // TODO add your handling code here:
        txttc.setText((String) hastaModel.getValueAt(tblHasta.getSelectedRow(),0));
        txtad.setText((String) hastaModel.getValueAt(tblHasta.getSelectedRow(),1));
        txtsoyad.setText((String) hastaModel.getValueAt(tblHasta.getSelectedRow(),2));
        txtyas.setText((String) hastaModel.getValueAt(tblHasta.getSelectedRow(),3));
        txttel.setText((String) hastaModel.getValueAt(tblHasta.getSelectedRow(),4));
        txtsifre.setText((String) hastaModel.getValueAt(tblHasta.getSelectedRow(),5));
        
        String x;
        x=(String) hastaModel.getValueAt(tblHasta.getSelectedRow(),6);
        if(x.equals("Erkek")){
            rbtnerkek.doClick();
            
        }
        else if (x.equals("Kadın")){
            rbtnkadın.doClick();
        }
        else{
            buttonGroup1.clearSelection();
        }
        
     
    }//GEN-LAST:event_tblHastaMouseClicked

    private void btnHastaUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHastaUpdateActionPerformed
        // TODO add your handling code here:
        
        String tc, ad, soyad,yas, tel,sifre,cinsiyet;
        tc=txttc.getText();
        ad=txtad.getText();
        soyad=txtsoyad.getText();
        yas=txtyas.getText();
        tel=txttel.getText();
        sifre=txtsifre.getText();
        
        if(rbtnerkek.isSelected()){
            cinsiyet="Erkek";
        }
        else if (rbtnkadın.isSelected()){
            cinsiyet="Kadın";
        }
        else{
            cinsiyet="";
        }
        
        String updateSQL="UPDATE hasta SET htc='"+tc+"',"+"had='"+ad+"',"+"hsoyad='"+soyad+"',"+"hyas='"+yas+"',"+"htel='"+tel+"', hsifre='"+sifre+"', hcinsiyet='"+cinsiyet+"' WHERE htc="+tc;
                
                
                DbBaglanti.update(updateSQL);
                
                
                listele();
                txtbosalt();
                buttonGroup1.clearSelection();
        
    }//GEN-LAST:event_btnHastaUpdateActionPerformed

    private void btnHastaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHastaSilActionPerformed
        // TODO add your handling code here:
        
        String tc;
        tc=txttc.getText();
        String deleteSQL="DELETE FROM hasta WHERE htc="+tc;
        String deletedislevSQL="DELETE FROM dislev WHERE htc="+tc;
        String deletepislevSQL="DELETE FROM pislev WHERE htc="+tc;
        
        DbBaglanti.sil(deletedislevSQL);
        DbBaglanti.sil(deletepislevSQL);
        
        DbBaglanti.sil(deleteSQL);
        
        listele();
        txtbosalt();
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnHastaSilActionPerformed

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
            java.util.logging.Logger.getLogger(BashekimhastaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BashekimhastaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BashekimhastaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BashekimhastaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BashekimhastaFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeriGel;
    private javax.swing.JButton btnHastaKaydet;
    private javax.swing.JButton btnHastaSil;
    private javax.swing.JButton btnHastaUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnerkek;
    private javax.swing.JRadioButton rbtnkadın;
    private javax.swing.JTable tblHasta;
    private javax.swing.JTextField txtad;
    private javax.swing.JTextField txtsifre;
    private javax.swing.JTextField txtsoyad;
    private javax.swing.JTextField txttc;
    private javax.swing.JTextField txttel;
    private javax.swing.JTextField txtyas;
    // End of variables declaration//GEN-END:variables

    //tabloya listeleme sağlar
    @Override
    public void listele(){
       
        
        String listeleSql = "select * from hasta";
        ResultSet rs = DbBaglanti.listele(listeleSql);
        hastaModel.setColumnCount(0);
        hastaModel.setRowCount(0);
        hastaModel.setColumnIdentifiers(kolonlar);
        
        try{
        while(rs.next()){
            satirlar[0]=rs.getString("htc");
            satirlar[1]=rs.getString("had");
            satirlar[2]=rs.getString("hsoyad");
            satirlar[3]=rs.getString("hyas");
            satirlar[4]=rs.getString("htel");
            satirlar[5]=rs.getString("hsifre");
            satirlar[6]=rs.getString("hcinsiyet");
            hastaModel.addRow(satirlar);
        }
        tblHasta.setModel(hastaModel);
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
        txtsifre.setText("");
       }
}