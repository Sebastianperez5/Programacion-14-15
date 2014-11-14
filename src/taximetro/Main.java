/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taximetro;

import es.javiergarbedo.coordinateslib.CoordinatesConverter;
import java.text.DateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.validator.routines.CreditCardValidator;

/**
 *
 * @author Sebas
 */
public class Main extends javax.swing.JFrame {

    //Contador
    int contador = 00001;
    //Crear fecha/hora
    Calendar fechaInicio;
    Calendar fechaFin;
    DateFormat formatofechaCorta;
    //HoraInicio/Fin
    DateFormat formatoHoraInicio;
    DateFormat formatoHoraFin;
    //Convertir fecha a miliseg
    long fechaToMilisInicio;
    long fechaToMilisFin;
    //Latitud Longitud
    double latitud = 36.679619;
    double longitud = -5.444740;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        //Activar/Desactivar
        jButton1Iniciar.setEnabled(true);
        jButton2Stop.setEnabled(false);
        jTextField1Latitud.setText(String.valueOf(latitud));
        jTextField2Longitud.setText(String.valueOf(longitud));
        jLabel4LatitudGrados.setText(CoordinatesConverter.decimalToDMS(latitud));
        jLabel5LongitudGrados.setText(CoordinatesConverter.decimalToDMS(longitud));

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Latitud = new javax.swing.JTextField();
        jTextField2Longitud = new javax.swing.JTextField();
        jLabel4LatitudGrados = new javax.swing.JLabel();
        jLabel5LongitudGrados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1Ruta = new javax.swing.JTextField();
        jButton2Stop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel6MapaRuta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1NTarjeta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4ImagenTaxi = new javax.swing.JLabel();
        jButton1Iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Latitud:");

        jLabel3.setText("Longitud:");

        jTextField1Latitud.setEditable(false);
        jTextField1Latitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1LatitudActionPerformed(evt);
            }
        });

        jTextField2Longitud.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1Latitud, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2Longitud)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4LatitudGrados, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabel5LongitudGrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4LatitudGrados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1Latitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5LongitudGrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField2Longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel1.setText("Posición GPS");

        jLabel4.setText("Datos del Trayecto");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Destino:");

        jTextField1Ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1RutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1Ruta)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1Ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton2Stop.setIcon(new javax.swing.ImageIcon("D:\\Ciclo Superior\\1 Trimestre\\Programación\\Proyectos\\Taximetro\\src\\Imagenes\\Stop.jpg")); // NOI18N
        jButton2Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2StopActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6MapaRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6MapaRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel6.setText("Tarjeta de Crédito:");

        jButton1.setText("Comprobar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4ImagenTaxi.setIcon(new javax.swing.ImageIcon("D:\\Ciclo Superior\\1 Trimestre\\Programación\\Proyectos\\Taximetro\\src\\Imagenes\\Taxi.jpg")); // NOI18N

        jButton1Iniciar.setIcon(new javax.swing.ImageIcon("D:\\Ciclo Superior\\1 Trimestre\\Programación\\Proyectos\\Taximetro\\src\\Imagenes\\banderaverde.jpg")); // NOI18N
        jButton1Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1IniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel4))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(10, 10, 10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1Iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4ImagenTaxi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jTextField1NTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4ImagenTaxi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1Iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jButton2Stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1NTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1IniciarActionPerformed
        //Activar/Desactivar boton
        jButton1Iniciar.setEnabled(false);
        jButton2Stop.setEnabled(true);
        //Crear fecha/hora
        fechaInicio = Calendar.getInstance();
        formatofechaCorta = DateFormat.getDateInstance(DateFormat.SHORT);
        formatoHoraInicio = DateFormat.getTimeInstance(DateFormat.MEDIUM);
        //Convertir fecha en milis
        fechaToMilisInicio = fechaInicio.getTimeInMillis();
        //Imprimir ticket
        String tiquetIniciar = "TIKET \n===== \nNº de ticket: " + contador++ + "\nFecha: "
                + formatofechaCorta.format(fechaInicio.getTime()) + ""
                + "\n\n\nHora bajada de Bandera : "
                + formatoHoraInicio.format(fechaInicio.getTime());
        jTextArea1.setText(tiquetIniciar);
    }//GEN-LAST:event_jButton1IniciarActionPerformed

    private void jButton2StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2StopActionPerformed
        //Activar desactivar
        jButton1Iniciar.setEnabled(true);
        jButton2Stop.setEnabled(false);
        //crear hora
        fechaFin = Calendar.getInstance();
        formatoHoraFin = DateFormat.getTimeInstance(DateFormat.MEDIUM);
        //Convertir fecha en milis
        fechaToMilisFin = fechaFin.getTimeInMillis();
        //Duración trayecto
        long duracion = fechaToMilisFin - fechaToMilisInicio;
        String convertirDuracion = DurationFormatUtils.formatDurationHMS(duracion);
        //Importe
        double importe = ((duracion / 1000) / 60) * 0.50;
        //IVA
        double importeIVA = (importe * 0.18);
        //Importetotal
        double importeTotal = importeIVA + +importe + 0.50;
        //Imprimir ticket2
        String tiquestop = "\nHora fin trayecto: " + formatoHoraFin.format(fechaFin.getTime())
                + "\nDuración del trayecto: " + convertirDuracion
                + "\nTarifa por minuto = 0.50€"
                + "\n\n\nImporte : " + importe + "€"
                + "\nIVA: " + importeIVA + "€"
                + "\nImporte Total: " + importeTotal + "€";

        jTextArea1.append(tiquestop);
    }//GEN-LAST:event_jButton2StopActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Comprobar Tarjeta
        CreditCardValidator tarjeta = new CreditCardValidator();
        boolean comprobarTarjeta = tarjeta.isValid(jTextField1NTarjeta.getText());
        String verificartarjeta = comprobarTarjeta ? "El número de la tarjeta es correcto"
                : "El número de la tarjeta es incorrecto";
        JOptionPane.showMessageDialog(this, verificartarjeta, "Comprobar Tarjeta", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1RutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1RutaActionPerformed

        //Cambia los siguientes valores por las direciones de origen y destino deseadas
        String origen = jTextField1Latitud.getText() + "," + jTextField2Longitud.getText();
        String destino = jTextField1Ruta.getText();
        //Hay que sustituir los espacios por el carácter %20 para que se
        //  interprete bien la URL que se generará
        destino = destino.replaceAll(" ", "%20");
        //Cambia el nombre [etiqueta] por el nombre de un objeto JLabel (etiqueta) que
        //  has debido colocar antes en el formulario y que será donde se muestre el mapa.
        //  Deja la etiqueta del formulario sin ningún texto en el diseño.
        javax.swing.JLabel jLabelMapa = jLabel6MapaRuta;
        //Indica aquí el tamaño que desees para el mapa
        int tamHorizontal = 200;
        int tamVertical = 200;
        //Puedes encontrar más información sobre el uso de mapas estáticos de Google Maps aquí:
        //  http://code.google.com/intl/es-ES/apis/maps/documentation/staticmaps/

        //A partir de aquí no hace falta cambiar nada
        try {
            String txtDireccionImagenMapa = "http://maps.google.com/maps/api/staticmap?path="
                    + origen + "|" + destino + "&size=" + tamHorizontal + "x" + tamVertical
                    + "&language=ES&sensor=false";
            System.out.println(txtDireccionImagenMapa);
            java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
            java.awt.Image imagenMapa = toolkit.getImage(new java.net.URL(txtDireccionImagenMapa));
            jLabelMapa.setIcon(new javax.swing.ImageIcon(imagenMapa));
        } catch (java.net.MalformedURLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "La dirección de imagen indicada no es correcta");
        }
    }//GEN-LAST:event_jTextField1RutaActionPerformed

    private void jTextField1LatitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1LatitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1LatitudActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Iniciar;
    private javax.swing.JButton jButton2Stop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4ImagenTaxi;
    private javax.swing.JLabel jLabel4LatitudGrados;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel5LongitudGrados;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6MapaRuta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1Latitud;
    private javax.swing.JTextField jTextField1NTarjeta;
    private javax.swing.JTextField jTextField1Ruta;
    private javax.swing.JTextField jTextField2Longitud;
    // End of variables declaration//GEN-END:variables
}
