/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.wsclient;

import Clientff.*;
import com.datasource.client.DsVoucher;
import com.modeltable.wsclient.ModelTablePedido;
import com.modeltable.wsclient.ModelTableProducto;
import java.io.File;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.ws.soap.SOAPFaultException;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRParameter;
/**
 *
 * @author zorrito
 */
public class RPedido extends javax.swing.JFrame {
    private static BeanUsuario obj;    
    /**
     * Creates new form RPedido
     */
    public RPedido(BeanUsuario objUsuario) {
        obj=objUsuario;    
        estadoPedidos();
        initComponents();
        tableConfirmar.getColumnModel().getColumn(0).setCellRenderer(new CellRendererModalidad());
        tableDespacho.getColumnModel().getColumn(0).setCellRenderer(new CellRendererModalidad());
    }
    
    private void estadoPedidos(){
        Wsfastfood_Service servicio = new Wsfastfood_Service();
        Wsfastfood port = servicio.getWsfastfoodPort() ;
        List<BeanPedido> array;
        array=port.getListarPedido(obj.getCodigo(),obj.getObjSucursal().getCodigo());        
        if(array.size()>0){
            List<BeanPedido> pendientes=new ArrayList();
            List<BeanPedido> confirmados=new ArrayList();
            Iterator i=array.iterator();
            BeanPedido objPedido;
            while(i.hasNext()){
                objPedido=(BeanPedido)i.next();
                if(objPedido.getEstado().equalsIgnoreCase("P")){
                    pendientes.add(objPedido);
                }else if(objPedido.getEstado().equalsIgnoreCase("C")){
                    confirmados.add(objPedido);
                }
            }
         modelconfirmado.setData(pendientes); 
         modeldespachado.setData(confirmados);
         modelconfirmado.fireTableDataChanged();
         modeldespachado.fireTableDataChanged();
        }        
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
        lbUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txttel = new javax.swing.JTextField();
        txtpag = new javax.swing.JTextField();
        txtcli = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableProducto = new javax.swing.JTable();
        btnregistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConfirmar = new javax.swing.JTable();
        btndetalle = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnnoconfirmar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnimprimir = new javax.swing.JButton();
        btndespachado = new javax.swing.JButton();
        btnanulado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDespacho = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sucursal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(lbUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(lbSucursal)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbUsuario)
                    .addComponent(jLabel3)
                    .addComponent(lbSucursal))
                .addContainerGap())
        );

        jLabel6.setText("Pago");

        jLabel2.setText("Cliente");

        jLabel5.setText("Teléfono");

        jLabel4.setText("Dirección");

        Wsfastfood_Service servicio = new Wsfastfood_Service();
        Wsfastfood port = servicio.getWsfastfoodPort() ;
        model.setData(port.getListaProducto());
        jtableProducto.setModel(model);
        jScrollPane3.setViewportView(jtableProducto);

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcli)
                                    .addComponent(txtdir)
                                    .addComponent(txttel)
                                    .addComponent(txtpag, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnregistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrar)
                    .addComponent(btnCancelar))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TomarPedido", jPanel2);

        tableConfirmar.setModel(modelconfirmado);
        jScrollPane1.setViewportView(tableConfirmar);

        btndetalle.setText("Ver Detalle");
        btndetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndetalleActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnnoconfirmar.setText("No Confirmar");
        btnnoconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnoconfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btndetalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnnoconfirmar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndetalle)
                    .addComponent(btnConfirmar)
                    .addComponent(btnnoconfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Confirmar Pedido", jPanel3);

        btnimprimir.setText("Imprimir Voucher");
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        btndespachado.setText("Despachado");
        btndespachado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndespachadoActionPerformed(evt);
            }
        });

        btnanulado.setText("Anulado");
        btnanulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanuladoActionPerformed(evt);
            }
        });

        tableDespacho.setModel(modeldespachado);
        jScrollPane2.setViewportView(tableDespacho);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnimprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btndespachado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnanulado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnimprimir)
                    .addComponent(btndespachado)
                    .addComponent(btnanulado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Despacho", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
            // TODO add your handling code here:
        try{
        Wsfastfood_Service servicio = new Wsfastfood_Service();
        Wsfastfood port = servicio.getWsfastfoodPort() ;
        int idPedido=port.getSeqPedido();
        System.out.println(idPedido);
        String cli=txtcli.getText();
        String dir=txtdir.getText();
        String telf=txttel.getText();
        double pag=Double.valueOf(String.valueOf(txtpag.getText()));
        BeanPedido objPedido=new BeanPedido();
        objPedido.setCliente(cli);
        objPedido.setDireccion(dir);
        objPedido.setEstado("P");
        objPedido.setModalidad("T");
        objPedido.setImporte(0);
        objPedido.setTelefono(telf);
        objPedido.setId(idPedido);
        objPedido.setPago(pag);        
        objPedido.setObjUsuario(obj);
        objPedido.setObjSucursal(obj.getObjSucursal());
        objPedido.setVuelto(0);
        List<BeanDetallePedido> detalle=new ArrayList();
        Iterator i=model.getData().iterator();
        BeanProducto bean;    
        double importe=0;
        while(i.hasNext()){
            bean=(BeanProducto)i.next();
            if(bean.getCantidad()>0){
                BeanDetallePedido bdp=new BeanDetallePedido();
                bdp.setCantidad(bean.getCantidad());
                bdp.setPrecio(bean.getPrecio());
                bdp.setObjProducto(bean);
                bdp.setObjPedido(objPedido);
                importe=importe+bean.getCantidad()*bean.getPrecio();
                detalle.add(bdp);
            }
        }
        if(importe<=objPedido.getPago()){
            int val=port.getRegistrarPedido(detalle);
            if(val==idPedido){
                JOptionPane.showMessageDialog(null,"Registrado correctamente", "Informacion",JOptionPane.INFORMATION_MESSAGE);
                model.setData(port.getListaProducto());
                model.fireTableDataChanged();
                estadoPedidos();
                txtcli.setText(null);
                txtdir.setText(null);
                txttel.setText(null);
                txtpag.setText(null);
            }else{
                JOptionPane.showMessageDialog(null,"Por favor complete todos los datos. Gracias!!!", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Importe excede al pago", "Alerta", JOptionPane.WARNING_MESSAGE);
        }   
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Ingrese el Pago", "Alerta", JOptionPane.WARNING_MESSAGE);
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Los campos son obligatorios", "Alerta", JOptionPane.WARNING_MESSAGE);
        }catch(SOAPFaultException ex){
            JOptionPane.showMessageDialog(null,"No hay pedidos", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
       int fila = this.tableConfirmar.getSelectedRow();        
        if (fila > -1) {
            int modelrow = tableConfirmar.convertRowIndexToModel(fila);
            BeanPedido obj = ((ModelTablePedido) tableConfirmar.getModel()).getValue(modelrow);                       
            Wsfastfood_Service servicio = new Wsfastfood_Service();
            Wsfastfood port = servicio.getWsfastfoodPort() ;
            int id=port.getUpdateEstado(obj.getId(), "C");
            if(obj.getId()==id){
                JOptionPane.showMessageDialog(null, "Pedido Confirmado correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                estadoPedidos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al confirmar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la lista", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }                
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnnoconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnoconfirmarActionPerformed
        int fila = this.tableConfirmar.getSelectedRow();        
        if (fila > -1) {
            int modelrow = tableConfirmar.convertRowIndexToModel(fila);
            BeanPedido obj = ((ModelTablePedido) tableConfirmar.getModel()).getValue(modelrow);                       
            Wsfastfood_Service servicio = new Wsfastfood_Service();
            Wsfastfood port = servicio.getWsfastfoodPort() ;
            int opcion=JOptionPane.showConfirmDialog(null, "¿Desea anular el pedido?", "Aviso", JOptionPane.YES_NO_OPTION);
            if(opcion==JOptionPane.YES_OPTION){
                int id=port.getUpdateEstado(obj.getId(), "A");
                if(id==obj.getId()){
                    JOptionPane.showMessageDialog(null, "El pedido fue anulado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    estadoPedidos();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error al anular", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }            
            }else{
                JOptionPane.showMessageDialog(null, "Error al confirmar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }        
    }//GEN-LAST:event_btnnoconfirmarActionPerformed

    private void btndespachadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndespachadoActionPerformed
        int fila = this.tableDespacho.getSelectedRow();        
        if (fila > -1) {
            int modelrow = tableDespacho.convertRowIndexToModel(fila);
            BeanPedido obj = ((ModelTablePedido) tableDespacho.getModel()).getValue(modelrow);                       
            Wsfastfood_Service servicio = new Wsfastfood_Service();
            Wsfastfood port = servicio.getWsfastfoodPort() ;
            int id=port.getUpdateEstado(obj.getId(), "D");
            if(obj.getId()==id){
                JOptionPane.showMessageDialog(null, "Pedido Despachado correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                estadoPedidos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al despachar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la lista", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btndespachadoActionPerformed

    private void btnanuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanuladoActionPerformed
        int fila = this.tableDespacho.getSelectedRow();        
        if (fila > -1) {
            int modelrow = tableDespacho.convertRowIndexToModel(fila);
            BeanPedido obj = ((ModelTablePedido) tableDespacho.getModel()).getValue(modelrow);                       
            Wsfastfood_Service servicio = new Wsfastfood_Service();
            Wsfastfood port = servicio.getWsfastfoodPort() ;
            int opcion=JOptionPane.showConfirmDialog(null, "¿Desea anular el pedido?", "Aviso", JOptionPane.YES_NO_OPTION);
            if(opcion==JOptionPane.YES_OPTION){
                int id=port.getUpdateEstado(obj.getId(), "A");
                if(id==obj.getId()){
                    JOptionPane.showMessageDialog(null, "El pedido fue anulado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    estadoPedidos();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error al anular", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }            
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un registro de la Lista", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }        
    }//GEN-LAST:event_btnanuladoActionPerformed

    private void btndetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndetalleActionPerformed
        int fila = this.tableConfirmar.getSelectedRow();        
        if (fila > -1) {
            int modelrow = tableConfirmar.convertRowIndexToModel(fila);
            BeanPedido obj = ((ModelTablePedido) tableConfirmar.getModel()).getValue(modelrow);                       
            Wsfastfood_Service servicio = new Wsfastfood_Service();
            Wsfastfood port = servicio.getWsfastfoodPort() ;            
            Detalle viewDetalle=new Detalle(port.getListaDetallePedido(obj.getId()));
            viewDetalle.pack();
            viewDetalle.setVisible(true);
            viewDetalle.setLocationRelativeTo(null);
            viewDetalle.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }else{           
                JOptionPane.showMessageDialog(null, "Seleccione un registro de la Lista", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } 
    }//GEN-LAST:event_btndetalleActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        int fila = this.tableDespacho.getSelectedRow();        
        if (fila > -1) {
            try {
                int modelrow = tableDespacho.convertRowIndexToModel(fila);
                BeanPedido obj = ((ModelTablePedido) tableDespacho.getModel()).getValue(modelrow);                       
                Wsfastfood_Service servicio = new Wsfastfood_Service();
                Wsfastfood port = servicio.getWsfastfoodPort() ;
                exportarLibroBICuenta14APDF(port.getListaDetallePedido(obj.getId()));
            } catch (SQLException ex) {
                Logger.getLogger(RPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un registro de la Lista", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } 
    }//GEN-LAST:event_btnimprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new RPedido().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnanulado;
    private javax.swing.JButton btndespachado;
    private javax.swing.JButton btndetalle;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnnoconfirmar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtableProducto;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTable tableConfirmar;
    private javax.swing.JTable tableDespacho;
    private javax.swing.JTextField txtcli;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtpag;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
    private ModelTableProducto model=new  ModelTableProducto();
    private ModelTablePedido modelconfirmado=new  ModelTablePedido();
    private ModelTablePedido modeldespachado=new  ModelTablePedido();
    private JFileChooserModel fileChooser = new JFileChooserModel();
    FileNameExtensionFilter filterPDF = new FileNameExtensionFilter("pdf", "pdf");
    public JLabel getLbSucursal() {
        return lbSucursal;
    }

    public JLabel getLbUsuario() {
        return lbUsuario;
}
    private void generarReporteDS(File archivo, String tipoExportacion, Map parameters, JRDataSource cnx, String rutaJasper) {
        Exportar ex = new Exportar(archivo, parameters, tipoExportacion, cnx, rutaJasper);
        ex.show();
        JOptionPane.showMessageDialog(null, "Voucher generado", "ALERT", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private File seleccionarArchivo(FileNameExtensionFilter tipoFiltro, String nombreLibro, String tipoExportacion) {
        fileChooser.setFileFilter(tipoFiltro);
        Date hoy = new Date();
        File archivo = new File(nombreLibro + hoy.getTime() + "." + tipoExportacion);
        fileChooser.setSelectedFile(archivo);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        } else {
            JOptionPane.showMessageDialog(null, "No seleccionó ningún fichero", "Diálogo cerrado o cancelado", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }

    }
    
    private void exportarLibroBICuenta14APDF(List<BeanDetallePedido> lista) throws SQLException {
        File archivo = seleccionarArchivo(filterPDF, "Voucher", "pdf");
        if (archivo != null) {                        
                DsVoucher ds =new  DsVoucher();               
                ds.setListacuenta14(lista);
                Map parameters = new HashMap();                                             
                String rutaJasper = "/com/report/client/voucher.jasper";
                generarReporteDS(archivo, "pdf", parameters, ds, rutaJasper);                
            }
        }

    }

