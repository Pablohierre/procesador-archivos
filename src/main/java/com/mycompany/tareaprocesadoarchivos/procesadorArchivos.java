/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tareaprocesadoarchivos;

import static com.mycompany.tareaprocesadoarchivos.miMain.archivoExiste;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

/**
 *
 * @author hierr
 */
public class procesadorArchivos extends javax.swing.JFrame {

    /**
     * Creates new form procesadorArchivos
     */
    public procesadorArchivos() {
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

        modal = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botonmodal = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        nombrearchivo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrartxt = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        mostrarcsv = new javax.swing.JTextArea();
        botongenerar = new javax.swing.JButton();
        botonbusqueda = new javax.swing.JButton();

        modal.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        modal.setAlwaysOnTop(true);
        modal.setModal(true);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Este procesador de archivos leerá un \narchivo de texto (.txt) lo procesará para \nconvertirlo en un archivo CSV");
        jScrollPane1.setViewportView(jTextArea1);

        botonmodal.setText("OK");
        botonmodal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmodalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(botonmodal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(botonmodal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout modalLayout = new javax.swing.GroupLayout(modal.getContentPane());
        modal.getContentPane().setLayout(modalLayout);
        modalLayout.setHorizontalGroup(
            modalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        modalLayout.setVerticalGroup(
            modalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Procesador de Archivos");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        nombrearchivo.setText("jTextField1");

        mostrartxt.setColumns(20);
        mostrartxt.setRows(5);
        mostrartxt.setAutoscrolls(false);
        jScrollPane2.setViewportView(mostrartxt);

        mostrarcsv.setColumns(20);
        mostrarcsv.setRows(5);
        jScrollPane3.setViewportView(mostrarcsv);

        botongenerar.setText("Generar archivo CSV");
        botongenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botongenerarActionPerformed(evt);
            }
        });

        botonbusqueda.setText("Buscar archivo");
        botonbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombrearchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonbusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botongenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombrearchivo)
                    .addComponent(botonbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botongenerar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonmodalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmodalActionPerformed
        modal.setVisible(false);
    }//GEN-LAST:event_botonmodalActionPerformed

    private void botongenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botongenerarActionPerformed
    ArrayList<String> palabras = new ArrayList<>();
    HashMap<String, Integer> recuento = new HashMap<>();
    
/**
 * Siempre y cuando el archivo no haya terminado, paso la linea entera a minúsculas
 */
                   
                 var split=mostrartxt.getText().split(" ",0);
                 /**
                  * Luego divido la línea en un array de strings a través del split para obtener las plabras
                    Las palabras que me devuelve el split las voy metiendo en un arraylist llamado palabras
                  */
              
                for(String cosas:split){
                    /**
                     * Dejo el archivo limpio de carácteres especiales y comas y lo paso a minúsculas
                     */
                    cosas=cosas.replaceAll("[,|(|)|\"|.|«]", "").toLowerCase();
                    palabras.add(cosas);
                }

                for(String palabra:palabras){
                    FileWriter writer=null;
                try {
                    if(palabra.length()>2){
                        recuento.merge(palabra, 1, Integer::sum);
                    }
                                        
/**
 * Aquí Declaro los encabezados que va a tener mi archivo
 * le quito la extensión al archivo inicial, para que el nombre del archivo creado quede mejor
 * */
String[] HEADERS={"palabra","recuento"};       
    String nuevonombre=nombrearchivo.getText().replace(".txt", "_histograma.csv");
            writer = new FileWriter(nuevonombre);
            try (CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(HEADERS))) {
                recuento.forEach((String, Int) -> {
                    try {
/**
 * Imprimo las entradas que hay en el hashmap en un nuevo archivo CSV
 * 
 */                        
                    printer.printRecord(String, Int);
                    mostrarcsv.setText(recuento.toString());
                    } catch (IOException ex) {
                        Logger.getLogger(miMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });       
                                
                            }   catch (IOException ex) {
                                Logger.getLogger(procesadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
                            }
        
    }   catch (IOException ex) {
            Logger.getLogger(procesadorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        
                }
                }
    }//GEN-LAST:event_botongenerarActionPerformed
  
    /**
    * Siempre y cuando el archivo no haya terminado añado la línea a un String que contiene todo el texto
    * Luego divido la línea en un array de strings a través del split para obtener las plabras
    * Dejo el archivo limpio de carácteres especiales y comas y lo paso a minúsculas
    * Las palabras que me devuelve el split las voy metiendo en un arraylist llamado palabras
    * 
    * @param evt 
    */
    private void botonbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbusquedaActionPerformed
        File f = new File(nombrearchivo.getText());
        String linea="";
        String textoentero="";
        ArrayList<String> palabras = new ArrayList<>();
            try(BufferedReader lector = new BufferedReader(new FileReader(f))){
             
        while((linea=lector.readLine())!=null){
            textoentero+= linea;
            mostrartxt.setText(textoentero);
            var split=textoentero.split(" ",0);

                for(String cosas:split){                
                    
                    cosas=cosas.replaceAll("[^a-zA-Z0-9á-úÁ-ÚñÑ ]", "").toLowerCase();
                    palabras.add(cosas);
                    }
                }

            } catch (FileNotFoundException ex) {        
                mostrartxt.setText("El archivo no introducido no existe");
                Logger.getLogger(miMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(miMain.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }//GEN-LAST:event_botonbusquedaActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and  feel */
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
            java.util.logging.Logger.getLogger(procesadorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(procesadorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(procesadorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(procesadorArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new procesadorArchivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbusqueda;
    private javax.swing.JButton botongenerar;
    private javax.swing.JButton botonmodal;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JDialog modal;
    private javax.swing.JTextArea mostrarcsv;
    private javax.swing.JTextArea mostrartxt;
    private javax.swing.JTextField nombrearchivo;
    // End of variables declaration//GEN-END:variables
}
