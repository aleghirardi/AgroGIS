/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Transporte;

import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Carolina
 */
public class frmRegistrarCargaComb extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmRegistrarCargaComb
     */
    public frmRegistrarCargaComb() {
        initComponents();
        labelUnidades.setVisible(true);
        labelPrecioU.setVisible(true);
        labelLitros.setVisible(false);
        labelPrecioLitro.setVisible(false);
        
        txtFecha.setEditable(false);
        txtFecha.setEnabled(false);
        txtHora.setEditable(false);
        txtHora.setEnabled(false);
        //setear el campo de fecha con la del sistema
        GregorianCalendar gc=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        gc.get(Calendar.DAY_OF_WEEK);
        gc.get(Calendar.MONTH);
        gc.get(Calendar.YEAR);
        SimpleDateFormat formateador= new SimpleDateFormat("dd-MM-yyyy");
        txtFecha.setText(formateador.format(gc.getTime()));
        //setear el campo de hora con la del sistema
        GregorianCalendar calendario=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        calendario.get(Calendar.HOUR);
        calendario.get(Calendar.MINUTE);
        SimpleDateFormat formateadorHora=new SimpleDateFormat("hh:mm");
        txtHora.setText(formateadorHora.format(calendario.getTime()));
        
        
        //redimensionar columnas de la tabla
        tblDetalleCarga.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblDetalleCarga.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblDetalleCarga.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblDetalleCarga.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblDetalleCarga.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblDetalleCarga.getColumnModel().getColumn(5).setPreferredWidth(50);
        
        //borrar el icono del InternalFrame
        this.setFrameIcon(new ImageIcon("Imagenes/Aceptar.png"));
    
        //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 810;
        int alto = 540;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 30);
        
        
        
        
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
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmbOrden = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtFechaEmision = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbEstacion = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        calendarioFU = new datechooser.beans.DateChooserCombo();
        jLabel16 = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox();
        labelLitros = new javax.swing.JLabel();
        txtLitrosCargados = new javax.swing.JTextField();
        labelPrecioLitro = new javax.swing.JLabel();
        txtPrecioLitro = new javax.swing.JTextField();
        labelmporte = new javax.swing.JLabel();
        txtImporteTotal = new javax.swing.JTextField();
        labelUnidades = new javax.swing.JLabel();
        labelPrecioU = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNumComprobante = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleCarga = new javax.swing.JTable();
        btnEliminarDetalle = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnDetalle = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Carga de Combustible");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Fecha");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 50, 20);

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha);
        txtFecha.setBounds(70, 20, 80, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Hora");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 20, 58, 20);
        jPanel1.add(txtHora);
        txtHora.setBounds(230, 20, 80, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Carolina");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(640, 20, 50, 15);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(690, 10, 30, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Orden", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Orden Nº");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 20, 60, 20);

        jPanel2.add(cmbOrden);
        cmbOrden.setBounds(130, 20, 120, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Fecha  Emision");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(420, 20, 100, 20);
        jPanel2.add(txtFechaEmision);
        txtFechaEmision.setBounds(510, 20, 100, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Estacion de Servicio");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 50, 140, 20);

        jPanel2.add(cmbEstacion);
        cmbEstacion.setBounds(130, 50, 230, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Operacion");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(450, 50, 60, 20);
        jPanel2.add(txtOperacion);
        txtOperacion.setBounds(510, 50, 150, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 50, 690, 90);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Carga", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel3.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Fecha Utilizacion");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(30, 30, 130, 20);
        jPanel3.add(calendarioFU);
        calendarioFU.setBounds(130, 30, 100, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Producto");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(330, 30, 110, 20);

        jPanel3.add(cmbProducto);
        cmbProducto.setBounds(390, 30, 260, 20);

        labelLitros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelLitros.setText("Litros cargados");
        jPanel3.add(labelLitros);
        labelLitros.setBounds(40, 60, 110, 20);
        jPanel3.add(txtLitrosCargados);
        txtLitrosCargados.setBounds(130, 60, 100, 20);

        labelPrecioLitro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPrecioLitro.setText("Precio por litro:  $");
        jPanel3.add(labelPrecioLitro);
        labelPrecioLitro.setBounds(250, 60, 120, 20);

        txtPrecioLitro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioLitroKeyTyped(evt);
            }
        });
        jPanel3.add(txtPrecioLitro);
        txtPrecioLitro.setBounds(350, 60, 100, 20);

        labelmporte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelmporte.setText("Importe Total: $ ");
        jPanel3.add(labelmporte);
        labelmporte.setBounds(490, 60, 110, 20);

        txtImporteTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImporteTotalKeyTyped(evt);
            }
        });
        jPanel3.add(txtImporteTotal);
        txtImporteTotal.setBounds(580, 60, 100, 20);

        labelUnidades.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelUnidades.setText("Unidades");
        jPanel3.add(labelUnidades);
        labelUnidades.setBounds(60, 60, 80, 20);

        labelPrecioU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPrecioU.setText("Precio Unitario:  $");
        jPanel3.add(labelPrecioU);
        labelPrecioU.setBounds(250, 60, 120, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("N° de Comprobante de Venta");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(20, 100, 190, 20);

        txtNumComprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumComprobanteKeyTyped(evt);
            }
        });
        jPanel3.add(txtNumComprobante);
        txtNumComprobante.setBounds(190, 100, 100, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Responsable de Venta");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(350, 100, 160, 20);

        txtResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResponsableKeyTyped(evt);
            }
        });
        jPanel3.add(txtResponsable);
        txtResponsable.setBounds(480, 100, 200, 20);

        btnAgregar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        jPanel3.add(btnAgregar);
        btnAgregar.setBounds(300, 140, 110, 30);

        tblDetalleCarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha ", "Orden N°", "Comprobante N°", "Operación", "Producto", "Importe Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetalleCarga.getTableHeader().setResizingAllowed(false);
        tblDetalleCarga.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDetalleCarga);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 180, 660, 110);

        btnEliminarDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnEliminarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDetalleActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarDetalle);
        btnEliminarDetalle.setBounds(700, 220, 49, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 140, 760, 310);

        btnNuevo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icononuevo.PNG"))); // NOI18N
        btnNuevo.setText("Nuevo");

        btnDetalle.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IrDetalle.png"))); // NOI18N
        btnDetalle.setText("Detalle");

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar1.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtPrecioLitroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioLitroKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*
                 * corresponde a BACK_SPACE
                 */)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txtPrecioLitroKeyTyped

    private void txtImporteTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteTotalKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*
                 * corresponde a BACK_SPACE
                 */)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txtImporteTotalKeyTyped

    private void txtNumComprobanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumComprobanteKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*
                 * corresponde a BACK_SPACE
                 */)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txtNumComprobanteKeyTyped

    private void txtResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsableKeyTyped

        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtResponsableKeyTyped

    private void btnEliminarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDetalleActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarDetalleActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnEliminarDetalle;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnNuevo;
    private datechooser.beans.DateChooserCombo calendarioFU;
    private javax.swing.JComboBox cmbEstacion;
    private javax.swing.JComboBox cmbOrden;
    private javax.swing.JComboBox cmbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLitros;
    private javax.swing.JLabel labelPrecioLitro;
    private javax.swing.JLabel labelPrecioU;
    private javax.swing.JLabel labelUnidades;
    private javax.swing.JLabel labelmporte;
    private javax.swing.JTable tblDetalleCarga;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaEmision;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtImporteTotal;
    private javax.swing.JTextField txtLitrosCargados;
    private javax.swing.JTextField txtNumComprobante;
    private javax.swing.JTextField txtOperacion;
    private javax.swing.JTextField txtPrecioLitro;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}