/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmRegistrarCarga.java
 *
 * Created on 25/09/2011, 14:13:33
 */
package Ventanas_Transporte;

import Clases_Modulo_Transporte.CargaCombustible;
import Clases_Modulo_Transporte.DetalleCarga;
import Clases_Modulo_Transporte.DetalleConsumo;
import Clases_Modulo_Transporte.OrdenServicio;
import Clases_Modulo_Transporte.TipoCombustible;
import Hibernate.GestorHibernate;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;
import javax.swing.ImageIcon;

/**
 *
 * @author Charito
 */
public class frmRegistrarCarga extends javax.swing.JInternalFrame {

    /** Creates new form frmRegistrarCarga */
    public frmRegistrarCarga() {
        initComponents();
    
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
        int ancho = 850;
        int alto = 570;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 30);
        

    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleCarga = new javax.swing.JTable();
        btnEliminarTel = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnDetalle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmbEstacion = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLitrosCargados = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        labelLitro = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtImporteTotal = new javax.swing.JTextField();
        txtPrecioLitro = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmbTipoCombustible = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        txtNumComprobante = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        calendarioFCarga = new datechooser.beans.DateChooserCombo();
        jLabel14 = new javax.swing.JLabel();
        cmbTipoOperacion = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbOrden = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtFechaEmision = new javax.swing.JTextField();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("Carga de Combustible");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de Carga", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

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

        btnEliminarTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnEliminarTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarTel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(257, 257, 257))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnEliminarTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSalir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnSalir.setText("Cancelar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnDetalle.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IrDetalle.png"))); // NOI18N
        btnDetalle.setText("Detalle");
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Fecha");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Hora");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Carolina");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Carga", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel3.setLayout(null);

        jPanel3.add(cmbEstacion);
        cmbEstacion.setBounds(130, 70, 180, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Estacion de Servicio");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 70, 120, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Importe Total: $ ");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(470, 130, 100, 20);
        jPanel3.add(txtLitrosCargados);
        txtLitrosCargados.setBounds(130, 130, 70, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Fecha de Carga");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(30, 100, 90, 20);

        labelLitro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelLitro.setText("Litros cargados");
        jPanel3.add(labelLitro);
        labelLitro.setBounds(30, 130, 110, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Precio por litro:  $");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(250, 130, 120, 20);

        txtImporteTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImporteTotalKeyTyped(evt);
            }
        });
        jPanel3.add(txtImporteTotal);
        txtImporteTotal.setBounds(560, 130, 90, 20);

        txtPrecioLitro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioLitroKeyTyped(evt);
            }
        });
        jPanel3.add(txtPrecioLitro);
        txtPrecioLitro.setBounds(360, 130, 60, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Producto");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(410, 100, 110, 20);

        jPanel3.add(cmbTipoCombustible);
        cmbTipoCombustible.setBounds(470, 100, 180, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("N° de Comprobante de Venta");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(10, 160, 180, 20);

        txtNumComprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumComprobanteKeyTyped(evt);
            }
        });
        jPanel3.add(txtNumComprobante);
        txtNumComprobante.setBounds(180, 160, 70, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Responsable de Venta");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(330, 160, 160, 20);

        txtResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResponsableKeyTyped(evt);
            }
        });
        jPanel3.add(txtResponsable);
        txtResponsable.setBounds(470, 160, 170, 20);
        jPanel3.add(calendarioFCarga);
        calendarioFCarga.setBounds(130, 100, 100, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Operación");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(400, 70, 90, 20);

        jPanel3.add(cmbTipoOperacion);
        cmbTipoOperacion.setBounds(470, 70, 180, 20);

        btnAgregar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregar);
        btnAgregar.setBounds(310, 200, 110, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Orden N°");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(70, 40, 60, 20);

        jPanel3.add(cmbOrden);
        cmbOrden.setBounds(130, 40, 120, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Fecha Emisión");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(370, 40, 110, 20);
        jPanel3.add(txtFechaEmision);
        txtFechaEmision.setBounds(470, 40, 100, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    dispose();
}//GEN-LAST:event_btnSalirActionPerformed

private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btnGuardarActionPerformed

private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btnDetalleActionPerformed

private void btnEliminarTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTelActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btnEliminarTelActionPerformed

private void txtLitrosCargadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLitrosCargadosKeyTyped
    char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
}//GEN-LAST:event_txtLitrosCargadosKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        GestorHibernate gestorH = new GestorHibernate();
        Object fila[] = {calendarioFCarga.getText(), cmbOrden.getSelectedItem(), txtNumComprobante.getText(), cmbTipoOperacion.getSelectedItem(), cmbTipoCombustible.getSelectedItem(), txtImporteTotal.getText()};
        CargaCombustible carga = new CargaCombustible();
        DetalleCarga detalle = new DetalleCarga();
        TipoCombustible tipoCombustible = new TipoCombustible();
        carga.setFecha(calendarioFCarga.getText());
        carga.setHora(txtHora.getText());
        carga.setImporteTotal(Double.parseDouble(txtImporteTotal.getText()));
        carga.setResponsableVenta(txtResponsable.getText());
        carga.setTipoOperacion((String) cmbTipoOperacion.getSelectedItem());
        carga.setProducto((String) cmbTipoCombustible.getSelectedItem());
        Iterator ite = gestorH.listarClase(OrdenServicio.class).iterator();
        while (ite.hasNext()) {
            OrdenServicio orden = (OrdenServicio) ite.next();
            if (orden.getNumeroOrden() == (cmbOrden.getSelectedItem())) {
                carga.setOrdenServicio(orden);
                break;
            }
        }
        detalle.setLitrosCargados(Integer.parseInt(txtLitrosCargados.getText()));
        detalle.setPrecioPorLitro(Double.parseDouble(txtPrecioLitro.getText()));
        detalle.setCargaCombustible(carga);
        gestorH.guardarObjeto(carga);
        gestorH.guardarObjeto(detalle);
        DetalleConsumo detalleConsumo = new DetalleConsumo();
        detalleConsumo.setCargaCombustible(carga);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsableKeyTyped

        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtResponsableKeyTyped

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnEliminarTel;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private datechooser.beans.DateChooserCombo calendarioFCarga;
    private javax.swing.JComboBox cmbEstacion;
    private javax.swing.JComboBox cmbOrden;
    private javax.swing.JComboBox cmbTipoCombustible;
    private javax.swing.JComboBox cmbTipoOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLitro;
    private javax.swing.JTable tblDetalleCarga;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaEmision;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtImporteTotal;
    private javax.swing.JTextField txtLitrosCargados;
    private javax.swing.JTextField txtNumComprobante;
    private javax.swing.JTextField txtPrecioLitro;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}