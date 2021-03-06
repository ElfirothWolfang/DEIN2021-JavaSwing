/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package componentes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alumno Tarde
 */
public class Tarjeta extends javax.swing.JPanel {

    /**
     * Creates new form Tarjeta
     */
    public Tarjeta() {
        initComponents();
    }
    
    public String getLabelCVV () {
        return m_jLab_CVV.getText();
    }
    
    public void setLabelCVV (String text) {
        m_jLab_CVV.setText(text);
    }
    
    public String getCVV () {
        return m_jTxtF_CVV.getText();
    }
    
    public void setCVV (String text) {
        m_jTxtF_CVV.setText(text);
    }
    
    public String getMessageCVV () {
        return m_jLab_ErrCVV.getText();
    }
      
    public void setMessageCVV (String text) {
        m_jLab_ErrCVV.setText(text);
    }
    
    public String getNumTarjeta () {
        return m_jTxtF_NumTarjeta.getText();
    }
      
    public void setNumTarjeta (String text) {
        m_jTxtF_NumTarjeta.setText(text);
    }
    
    public String getMessageNumTarjeta () {
        return m_jLab_ErrNumTarjeta.getText();
    }
      
    public void setMessageNumTarjeta (String text) {
        m_jLab_ErrNumTarjeta.setText(text);
    }
    
    public String getFechaValided () {
        return m_jTxtF_FechaValidez.getText();
    }
    
    public void setFechaValided (String text) {
        m_jTxtF_FechaValidez.setText(text);
    }
    
    public String getMessageFechaValided () {
        return m_jLab_ErrNumTarjeta.getText();
    }
      
    public void setMessageFechaValided (String text) {
        m_jLab_ErrNumTarjeta.setText(text);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m_jLab_CVV = new javax.swing.JLabel();
        m_jTxtF_CVV = new javax.swing.JTextField();
        m_jLab_ErrCVV = new javax.swing.JLabel();
        m_jTxtF_NumTarjeta = new javax.swing.JTextField();
        m_jLab_ErrNumTarjeta = new javax.swing.JLabel();
        m_jTxtF_FechaValidez = new javax.swing.JTextField();
        m_jLab_ErrFechaValidez = new javax.swing.JLabel();
        m_jTxtF_Nombre = new javax.swing.JTextField();
        m_jLab_Imagen = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        m_jLab_CVV.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        m_jLab_CVV.setForeground(new java.awt.Color(255, 255, 255));
        m_jLab_CVV.setText("CVV");
        add(m_jLab_CVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        m_jTxtF_CVV.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        m_jTxtF_CVV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                m_jTxtF_CVVFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                m_jTxtF_CVVFocusLost(evt);
            }
        });
        add(m_jTxtF_CVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 110, 40));

        m_jLab_ErrCVV.setForeground(new java.awt.Color(255, 0, 0));
        add(m_jLab_ErrCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 420, 10));

        m_jTxtF_NumTarjeta.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        m_jTxtF_NumTarjeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                m_jTxtF_NumTarjetaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                m_jTxtF_NumTarjetaFocusLost(evt);
            }
        });
        add(m_jTxtF_NumTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 470, 50));

        m_jLab_ErrNumTarjeta.setForeground(new java.awt.Color(255, 0, 0));
        add(m_jLab_ErrNumTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 300, 10));

        m_jTxtF_FechaValidez.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        m_jTxtF_FechaValidez.setToolTipText("");
        m_jTxtF_FechaValidez.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                m_jTxtF_FechaValidezFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                m_jTxtF_FechaValidezFocusLost(evt);
            }
        });
        add(m_jTxtF_FechaValidez, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 100, 40));

        m_jLab_ErrFechaValidez.setForeground(new java.awt.Color(255, 0, 0));
        add(m_jLab_ErrFechaValidez, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 420, 10));

        m_jTxtF_Nombre.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        add(m_jTxtF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 370, 50));

        m_jLab_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tarjeta_1.png"))); // NOI18N
        add(m_jLab_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        m_jLab_Imagen.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void m_jTxtF_CVVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_jTxtF_CVVFocusLost
        var lv_CVV_Introducido = m_jTxtF_CVV.getText();
        Pattern patronCVV = Pattern.compile("([0-9]{3,4})");
        Matcher matchCVV = patronCVV.matcher(lv_CVV_Introducido);
        if(!matchCVV.matches()) {
            setMessageCVV("Introduce los 3 o 4 d??gitos correspondientes al CVV");
        }
    }//GEN-LAST:event_m_jTxtF_CVVFocusLost

    private void m_jTxtF_CVVFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_jTxtF_CVVFocusGained
        setMessageCVV("");
    }//GEN-LAST:event_m_jTxtF_CVVFocusGained

    private void m_jTxtF_NumTarjetaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_jTxtF_NumTarjetaFocusGained
        setMessageNumTarjeta("");      
    }//GEN-LAST:event_m_jTxtF_NumTarjetaFocusGained

    private void m_jTxtF_NumTarjetaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_jTxtF_NumTarjetaFocusLost
        var lv_NumTajerta_Introducido = m_jTxtF_NumTarjeta.getText();
        Pattern patronNumTarjeta = Pattern.compile("([0-9]{13,24})");
        Matcher matchNumTarjeta = patronNumTarjeta.matcher(lv_NumTajerta_Introducido);
        if(!matchNumTarjeta.matches()) {
            setMessageNumTarjeta("Introduce los 13 o 24 d??gitos correspondientes N??mero de la tarjeta");
        }
    }//GEN-LAST:event_m_jTxtF_NumTarjetaFocusLost

    private void m_jTxtF_FechaValidezFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_jTxtF_FechaValidezFocusGained
        m_jLab_ErrFechaValidez.setText("");
    }//GEN-LAST:event_m_jTxtF_FechaValidezFocusGained

    private void m_jTxtF_FechaValidezFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_jTxtF_FechaValidezFocusLost
        var lv_FechaValidez_Introducida = m_jTxtF_FechaValidez.getText();
        Pattern patronFechaValidez= Pattern.compile("");
        Matcher matchFechaValided = patronFechaValidez.matcher(lv_FechaValidez_Introducida);
        if(!matchFechaValided.matches()) {
            setMessageNumTarjeta("Introduce una fecha correcta en el formato MM/AA");
        }
    }//GEN-LAST:event_m_jTxtF_FechaValidezFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel m_jLab_CVV;
    private javax.swing.JLabel m_jLab_ErrCVV;
    private javax.swing.JLabel m_jLab_ErrFechaValidez;
    private javax.swing.JLabel m_jLab_ErrNumTarjeta;
    private javax.swing.JLabel m_jLab_Imagen;
    private javax.swing.JTextField m_jTxtF_CVV;
    private javax.swing.JTextField m_jTxtF_FechaValidez;
    private javax.swing.JTextField m_jTxtF_Nombre;
    private javax.swing.JTextField m_jTxtF_NumTarjeta;
    // End of variables declaration//GEN-END:variables
}
