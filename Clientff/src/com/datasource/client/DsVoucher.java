/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datasource.client;

import Clientff.BeanDetallePedido;
import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Administrador
 */
public class DsVoucher implements JRDataSource {
    private int cursor=-1;
    private List<BeanDetallePedido> listacuenta14= new ArrayList();

    @Override
    public boolean next() throws JRException {
        return ++cursor<listacuenta14.size();
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor=null;
        if("PRODUCTO".equals(jrf.getName())){
            valor=listacuenta14.get(cursor).getObjProducto().getNombre();
        }else if("PRECIO".equals(jrf.getName())){            
            valor=listacuenta14.get(cursor).getPrecio();
        }else if("CANTIDAD".equals(jrf.getName())){
            valor=listacuenta14.get(cursor).getCantidad();
        }else if("IMPORTE".equals(jrf.getName())){
            valor=listacuenta14.get(cursor).getObjPedido().getImporte();
        }else if("PAGO".equals(jrf.getName())){
            valor=listacuenta14.get(cursor).getObjPedido().getPago();
        }else if("VUELTO".equals(jrf.getName())){
            valor=listacuenta14.get(cursor).getObjPedido().getVuelto();
        }else if("FECHA".equals(jrf.getName())){
            valor=listacuenta14.get(cursor).getObjPedido().getFecha();
        }else if("NUMPEDIDO".equals(jrf.getName())){
            valor=listacuenta14.get(cursor).getObjPedido().getId();
        }        
        return valor;
    }
    
    public void add(BeanDetallePedido objCuenta14){
        this.listacuenta14.add(objCuenta14);
    }

    public List<BeanDetallePedido> getLibroDiario() {
        return listacuenta14;
    }

    public void setListacuenta14(List<BeanDetallePedido> listacuenta14) {
        this.listacuenta14 = listacuenta14;
    }
    
    
    
    
}

