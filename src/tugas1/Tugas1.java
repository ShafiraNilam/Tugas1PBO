/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author USER
 */
public class Tugas1 extends javax.swing.JFrame {

    /**
     * Creates new form Tugas1
     */
    public Tugas1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jconadoc = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtspesial = new javax.swing.JTextField();
        jtxtnama = new javax.swing.JTextField();
        jtxtalamat = new javax.swing.JTextField();
        jtxtusia = new javax.swing.JTextField();
        jtxtjenis = new javax.swing.JTextField();
        jtxtgol = new javax.swing.JTextField();
        jtxtstatus = new javax.swing.JTextField();
        jtxtkewar = new javax.swing.JTextField();
        jtxtwaktu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Pilih Dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 80, 80, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Pemilihan Dokter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 30, 150, 20);

        jconadoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Salah Satu-", "DR. Farras Yassar", "DR. Anisa Putri", "DR. Harun Fajar" }));
        jconadoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconadocActionPerformed(evt);
            }
        });
        getContentPane().add(jconadoc);
        jconadoc.setBounds(130, 80, 140, 20);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identitas"));
        jPanel1.setLayout(null);

        jLabel3.setText("Alamat");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 70, 50, 14);

        jLabel4.setText("Golongan Darah");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 160, 100, 14);

        jLabel5.setText("Nama");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 40, 50, 14);

        jLabel6.setText("Kewarganegaraan");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 220, 110, 14);

        jLabel7.setText("Jenis Kelamin");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 130, 80, 14);

        jLabel8.setText("Usia");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 100, 40, 14);

        jLabel9.setText("Dokter Spesialis");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 280, 100, 14);

        jLabel10.setText("Status");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 190, 60, 14);

        jLabel11.setText("Waktu Praktek");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 250, 100, 14);

        jtxtspesial.setEnabled(false);
        jPanel1.add(jtxtspesial);
        jtxtspesial.setBounds(120, 270, 150, 30);

        jtxtnama.setEnabled(false);
        jtxtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtnama);
        jtxtnama.setBounds(120, 30, 150, 30);

        jtxtalamat.setEnabled(false);
        jPanel1.add(jtxtalamat);
        jtxtalamat.setBounds(120, 60, 150, 30);

        jtxtusia.setEnabled(false);
        jPanel1.add(jtxtusia);
        jtxtusia.setBounds(120, 90, 150, 30);

        jtxtjenis.setEnabled(false);
        jPanel1.add(jtxtjenis);
        jtxtjenis.setBounds(120, 120, 150, 30);

        jtxtgol.setEnabled(false);
        jPanel1.add(jtxtgol);
        jtxtgol.setBounds(120, 150, 150, 30);

        jtxtstatus.setEnabled(false);
        jPanel1.add(jtxtstatus);
        jtxtstatus.setBounds(120, 180, 150, 30);

        jtxtkewar.setEnabled(false);
        jPanel1.add(jtxtkewar);
        jtxtkewar.setBounds(120, 210, 150, 30);

        jtxtwaktu.setEnabled(false);
        jPanel1.add(jtxtwaktu);
        jtxtwaktu.setBounds(120, 240, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 120, 300, 320);

        setBounds(0, 0, 429, 485);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnamaActionPerformed

    private void jconadocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconadocActionPerformed
        // TODO add your handling code here:
        if(jconadoc.getSelectedItem().equals("DR. Farras Yassar")){
jtxtnama.setText("DR. Farras Yassar ");
jtxtalamat.setText("Jl. Surabaya 16, Malang");
jtxtusia.setText("20 Tahun");
jtxtjenis.setText("Laki-Laki");
jtxtgol.setText("A");
jtxtstatus.setText("Belum Menikah ");
jtxtkewar.setText("Indonesia");
jtxtspesial.setText("Dokter Umum");
jtxtwaktu.setText(" Pagi (07.00-15.00)");
}
else
if(jconadoc.getSelectedItem().equals("DR. Anisa Putri")){
jtxtnama.setText("DR. Anisa Putri");
jtxtalamat.setText("Jl. Veteran 3, Malang");
jtxtusia.setText("20 Tahun");
jtxtjenis.setText("Perempuan");
jtxtgol.setText("O");
jtxtstatus.setText("Belum Menikah");
jtxtkewar.setText("Indonesia");
jtxtspesial.setText("Dokter Gigi");
jtxtwaktu.setText(" Sore (16.00-22.00)");
}
else
if(jconadoc.getSelectedItem().equals("DR. Harun Fajar")){
jtxtnama.setText("DR. Harun Fajar ");
jtxtalamat.setText("Jl. Bandung 9, Malang");
jtxtusia.setText("20 Tahun");
jtxtjenis.setText("Laki-Laki");
jtxtgol.setText("B");
jtxtstatus.setText("Belum Menikah");
jtxtkewar.setText("Indonesia");
jtxtspesial.setText("Dokter Gizi");
jtxtwaktu.setText(" Malam (22.00-06.00)");
}
    }//GEN-LAST:event_jconadocActionPerformed

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
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jconadoc;
    private javax.swing.JTextField jtxtalamat;
    private javax.swing.JTextField jtxtgol;
    private javax.swing.JTextField jtxtjenis;
    private javax.swing.JTextField jtxtkewar;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtspesial;
    private javax.swing.JTextField jtxtstatus;
    private javax.swing.JTextField jtxtusia;
    private javax.swing.JTextField jtxtwaktu;
    // End of variables declaration//GEN-END:variables
}
