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
public class DNIField extends javax.swing.JPanel {
    
    public String getLabel () {
        return nombreCampo.getText();
    }
    
    public void setLabel (String text) {
        nombreCampo.setText(text);
    }
    
    public String getDNI () {
        return campoDNI.getText();
    }
    
    public void setDNI (String text) {
        campoDNI.setText(text);
    }
    
    public String getMessage () {
        return mensaje.getText();
    }
    
    public void setMessage (String text) {
        mensaje.setText(text);
    }
    /**
     * Creates new form LabelledTextFieldWithMessage
     */
    public DNIField() {
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

        nombreCampo = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        mensaje = new javax.swing.JLabel();

        nombreCampo.setText("DNI");

        campoDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoDNIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoDNIFocusLost(evt);
            }
        });
        campoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDNIActionPerformed(evt);
            }
        });

        mensaje.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDNI)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(nombreCampo))
                        .addGap(346, 346, 346)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nombreCampo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(mensaje)
                .addGap(0, 24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDNIActionPerformed

    private void campoDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDNIFocusLost
        String DNI_LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
        String dniIntroducido = getDNI();
        
        Pattern patronDNI = Pattern.compile("([0-9]{8})-?([a-zA-Z])");
        Matcher matchDNI = patronDNI.matcher(dniIntroducido);
        
        if(!matchDNI.matches()) {
            setMessage("Formato de DNI erróneo");
            return;
        }
        
        String cadenaNumeros = matchDNI.group(1);
        String letraDNI = matchDNI.group(2);
        
        Integer numeroDNI = Integer.parseInt(cadenaNumeros);
        int posicionLetra = numeroDNI % 23;
        String letraEsperada = DNI_LETRAS.substring(posicionLetra, posicionLetra + 1);
        
        if(!letraEsperada.equalsIgnoreCase(letraDNI)) {
            setMessage("DNI erróneo");
        }
    }//GEN-LAST:event_campoDNIFocusLost

    private void campoDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDNIFocusGained
        setMessage("");
    }//GEN-LAST:event_campoDNIFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoDNI;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel nombreCampo;
    // End of variables declaration//GEN-END:variables
}