/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Kasir;
import java.awt.HeadlessException;
import java.security.PrivateKey;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Another
 */
public class Inputan extends javax.swing.JFrame {

    /**
     * Creates new form Inputan
     */
    public Inputan() {
        initComponents();
    }
    public JTextField getNama(){
        return TfNama;
    }
    public JTextField getHarga(){
        return TfHarga;
    }
    
    public JTextField getJumlah(){
        return TfJumlah;
    }
    
    public void simpan(){
       String nama = getNama().getText();
       String harga = getHarga().getText();
       String jumlah = getJumlah().getText();
       String jenis = (String)cbJenis.getSelectedItem();
       
        try{
           String sql = "INSERT INTO "+jenis+"(nama,harga,jumlah) VALUES('"+nama+"','"+harga+"','"+jumlah+"');";
           java.sql.Connection conn = (java.sql.Connection)Koneksi.koneksi.koneksi_db();
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Data tersimpan");
       }catch(SQLException | HeadlessException e){
           JOptionPane.showMessageDialog(null, "Data tidak tersimpan");
       }
    }
    public void stock(){
       String nama = getNama().getText();
       String jumlah = getJumlah().getText();
       String jenis = (String)cbJenis.getSelectedItem();
       
        try{
           String sql = "INSERT INTO stock(nama,jumlah,jenis) VALUES('"+nama+"','"+jumlah+"','"+jenis+"');";
           java.sql.Connection conn = (java.sql.Connection)Koneksi.koneksi.koneksi_db();
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           pst.execute();
       }catch(SQLException | HeadlessException e){
       }
    }
    public void reset(){
        TfNama.setText("");
        TfJumlah.setText("");
        TfHarga.setText("");

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TfNama = new javax.swing.JTextField();
        TfJumlah = new javax.swing.JTextField();
        TfHarga = new javax.swing.JTextField();
        LbNama = new javax.swing.JLabel();
        LbJumlah = new javax.swing.JLabel();
        LbHarga = new javax.swing.JLabel();
        LbJenis = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        cbJenis = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Input Data Produk");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        getContentPane().add(TfNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 340, -1));
        getContentPane().add(TfJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 340, -1));

        TfHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfHargaActionPerformed(evt);
            }
        });
        getContentPane().add(TfHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, -1));

        LbNama.setText("Nama");
        getContentPane().add(LbNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        LbJumlah.setText("Jumlah");
        getContentPane().add(LbJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        LbHarga.setText("Harga");
        getContentPane().add(LbHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        LbJenis.setText("Jenis");
        getContentPane().add(LbJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Snack" }));
        getContentPane().add(cbJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfHargaActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
       new Menu_Utama().setVisible(true);
       dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        simpan();
        stock();
    }//GEN-LAST:event_btnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(Inputan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inputan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inputan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inputan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inputan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbHarga;
    private javax.swing.JLabel LbJenis;
    private javax.swing.JLabel LbJumlah;
    private javax.swing.JLabel LbNama;
    private javax.swing.JTextField TfHarga;
    private javax.swing.JTextField TfJumlah;
    private javax.swing.JTextField TfNama;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
