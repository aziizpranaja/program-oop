/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran;

import javax.swing.JOptionPane;

/**
 *
 * @author AZIIZ
 */
public class restoran_form extends javax.swing.JFrame {

    /**
     * Creates new form restoran_form
     */
    public restoran_form() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cetak = new javax.swing.JButton();
        Item_makanan = new javax.swing.JComboBox<>();
        Bayar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Harga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Jumlah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ttl_Harga = new javax.swing.JTextField();
        Batal = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(143, 188, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Coolvetica Compressed Rg", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restoran Moro Seneng");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 360, 110));

        jLabel3.setFont(new java.awt.Font("Coolvetica Rg", 0, 14)); // NOI18N
        jLabel3.setText("Bayar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, 50));

        jLabel4.setFont(new java.awt.Font("Coolvetica Rg", 0, 14)); // NOI18N
        jLabel4.setText("Item");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, 50));

        cetak.setText("Cetak");
        cetak.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cetak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        jPanel1.add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 110, 30));

        Item_makanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih", "Nasi Putih", "Ayam Goreng", "Ayam Bakar", "Soto", "Rawon", "Sayur Sop", "Es Teh" }));
        Item_makanan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Item_makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_makananActionPerformed(evt);
            }
        });
        jPanel1.add(Item_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 200, 30));

        Bayar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarActionPerformed(evt);
            }
        });
        jPanel1.add(Bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 200, 30));

        jLabel5.setFont(new java.awt.Font("Coolvetica Rg", 0, 14)); // NOI18N
        jLabel5.setText("Harga");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 50, 50));

        Harga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });
        jPanel1.add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 200, 30));

        jLabel6.setFont(new java.awt.Font("Coolvetica Rg", 0, 14)); // NOI18N
        jLabel6.setText("Total Harga");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 50));

        Jumlah.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahActionPerformed(evt);
            }
        });
        Jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JumlahKeyReleased(evt);
            }
        });
        jPanel1.add(Jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 200, 30));

        jLabel7.setFont(new java.awt.Font("Coolvetica Rg", 0, 14)); // NOI18N
        jLabel7.setText("Jumlah");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, 50));

        Ttl_Harga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ttl_Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ttl_HargaActionPerformed(evt);
            }
        });
        jPanel1.add(Ttl_Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 200, 30));

        Batal.setText("Batal");
        Batal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Batal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalActionPerformed(evt);
            }
        });
        jPanel1.add(Batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 110, 30));

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 463, 110, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 350, 510);

        setSize(new java.awt.Dimension(362, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BayarActionPerformed

    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaActionPerformed

    private void JumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahActionPerformed

    private void Item_makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_makananActionPerformed
       if(Item_makanan.getSelectedItem().toString().equalsIgnoreCase("Nasi Putih"))
       {
           Harga.setText("3000");
       }else if (Item_makanan.getSelectedItem().toString().equalsIgnoreCase("Ayam Goreng"))
       {
           Harga.setText("6000");
       }else if (Item_makanan.getSelectedItem().toString().equalsIgnoreCase("Ayam Bakar"))
       {
           Harga.setText("8000");
       }
       else if (Item_makanan.getSelectedItem().toString().equalsIgnoreCase("Soto"))
       {
           Harga.setText("6000");
       }
       else if (Item_makanan.getSelectedItem().toString().equalsIgnoreCase("Rawon"))
       {
           Harga.setText("10.000");
       }
       else if (Item_makanan.getSelectedItem().toString().equalsIgnoreCase("Sayur Sop"))
       {
           Harga.setText("5000");
       }
       else if (Item_makanan.getSelectedItem().toString().equalsIgnoreCase("Es Teh"))
       {
           Harga.setText("3000");
       }
    }//GEN-LAST:event_Item_makananActionPerformed

    private void Ttl_HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ttl_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ttl_HargaActionPerformed

    private void JumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JumlahKeyReleased
        int harga = Integer.parseInt(Harga.getText());
        int jumlah = Integer.parseInt(Jumlah.getText());
        int totalbyr = harga*jumlah;
        String total = Integer.toString(totalbyr);
        Ttl_Harga.setText(total);
    }//GEN-LAST:event_JumlahKeyReleased

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        int bayar = Integer.parseInt(Bayar.getText());
        int ttl_hrga = Integer.parseInt(Ttl_Harga.getText());
        int kembalian = bayar - ttl_hrga;

        String kembali = Integer.toString(kembalian);

        JOptionPane.showMessageDialog(null,"\n Kembalian anda : \n"+kembali);

        Item_makanan.setSelectedItem("pilih");
        Harga.setText("");
        Jumlah.setText("");
        Ttl_Harga.setText("");
        Bayar.setText("");
    }//GEN-LAST:event_cetakActionPerformed

    private void BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalActionPerformed
        Item_makanan.setSelectedItem("pilih");
        Harga.setText("");
        Jumlah.setText("");
        Ttl_Harga.setText("");
        Bayar.setText("");
    }//GEN-LAST:event_BatalActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(restoran_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restoran_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restoran_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restoran_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new restoran_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal;
    private javax.swing.JTextField Bayar;
    private javax.swing.JTextField Harga;
    private javax.swing.JComboBox<String> Item_makanan;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField Ttl_Harga;
    private javax.swing.JButton cetak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
