package application.pkgfor.secure.communications;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author NikosDls
 */
public class fourthFormAES extends javax.swing.JFrame {

    /**
     * String to hold the plain text path.
     */
    private String plainTextPath;

    /**
     * String to hold the key.
     */
    private String key;

    /**
     * String to hold the initialization vector.
     */
    private String initVector;

    /**
     * String to hold the text.
     */
    private String originalText;

    /**
     * Creates new form fourthFormAES
     *
     * @param width
     * @param height
     * @param plainTextPath
     * @param originalText
     */
    public fourthFormAES(int width, int height, String plainTextPath, String originalText) {
        initComponents();
        this.setLocation(width, height);
        this.plainTextPath = plainTextPath;
        this.originalText = originalText;
        KeyErrorField.setText("");
        IVErrorField.setText("");
    }

    public fourthFormAES() {
        this(0, 0, null, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        KeyField = new javax.swing.JTextField();
        IVField = new javax.swing.JTextField();
        KeyErrorLabel = new javax.swing.JLabel();
        IVErrorLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Encrypt = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        KeyErrorField = new javax.swing.JLabel();
        IVErrorField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Application For Secure Communications");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Step 4: Encyption with AES-128!");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Key phrase:");
        jLabel1.setPreferredSize(new java.awt.Dimension(114, 23));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Initialization Vector phrase:");
        jLabel3.setPreferredSize(new java.awt.Dimension(114, 23));

        KeyErrorLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        KeyErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        IVErrorLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        IVErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Key and Initialization Vector must be 16 bytes (128 bits)");

        Back.setText("< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Encrypt.setText("Encrypt");
        Encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        KeyErrorField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        KeyErrorField.setForeground(new java.awt.Color(255, 0, 0));
        KeyErrorField.setText("Error");

        IVErrorField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        IVErrorField.setForeground(new java.awt.Color(255, 0, 0));
        IVErrorField.setText("Error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(KeyErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IVErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IVField)
                                    .addComponent(KeyField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IVErrorField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(KeyErrorField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Encrypt)
                .addGap(41, 41, 41)
                .addComponent(Cancel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(IVErrorLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(KeyErrorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KeyField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KeyErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IVField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IVErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Encrypt)
                    .addComponent(Cancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        thirdForm third = new thirdForm(this.getX(), this.getY(), plainTextPath, originalText);
        this.dispose();
        third.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void EncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptActionPerformed
        key = KeyField.getText();
        initVector = IVField.getText();

        // We are using UTF-8 encoding so 1 character is 1 byte
        if (key.length() != 16 && initVector.length() != 16) {
            KeyErrorField.setText("Your key is " + key.length() + " bytes!");
            IVErrorField.setText("Your IV is " + initVector.length() + " bytes!");
            return;
        } else if (key.length() != 16 && initVector.length() == 16) {
            KeyErrorField.setText("Your key is " + key.length() + " bytes!");
            IVErrorField.setText("");
            return;
        } else if (key.length() == 16 && initVector.length() != 16) {
            KeyErrorField.setText("");
            IVErrorField.setText("Your IV is " + initVector.length() + " bytes!");
            return;
        } else {
            KeyErrorField.setText("");
            IVErrorField.setText("");
        }

        AESalgorithm aes = new AESalgorithm();
        String cipherText = aes.encrypt(key, initVector, originalText);
        ArrayList<String> cipherList = new ArrayList<String>();

        int index = 0;
        int charactersPerLine = 64;
        while (index < cipherText.length()) {
            cipherList.add(cipherText.substring(index, Math.min(index + charactersPerLine, cipherText.length())));
            index += charactersPerLine;
        }

        this.dispose();
        
        fifthForm fifth = new fifthForm(this.getX(), this.getY(), cipherList);
        fifth.setVisible(true);
    }//GEN-LAST:event_EncryptActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(fourthFormAES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fourthFormAES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fourthFormAES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fourthFormAES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fourthFormAES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Encrypt;
    private javax.swing.JLabel IVErrorField;
    private javax.swing.JLabel IVErrorLabel;
    private javax.swing.JTextField IVField;
    private javax.swing.JLabel KeyErrorField;
    private javax.swing.JLabel KeyErrorLabel;
    private javax.swing.JTextField KeyField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the plainTextPath
     */
    public String getPlainTextPath() {
        return plainTextPath;
    }

    /**
     * @param plainTextPath the plainTextPath to set
     */
    public void setPlainTextPath(String plainTextPath) {
        this.plainTextPath = plainTextPath;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the initVector
     */
    public String getInitVector() {
        return initVector;
    }

    /**
     * @param initVector the initVector to set
     */
    public void setInitVector(String initVector) {
        this.initVector = initVector;
    }

    /**
     * @return the originalText
     */
    public String getOriginalText() {
        return originalText;
    }

    /**
     * @param originalText the originalText to set
     */
    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }
}