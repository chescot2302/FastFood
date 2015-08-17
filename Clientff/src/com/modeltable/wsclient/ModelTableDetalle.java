/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeltable.wsclient;

import Clientff.BeanDetallePedido;
import Clientff.BeanPedido;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.event.EventListenerList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrador
 */
public class ModelTableDetalle extends AbstractTableModel {

    private ArrayList<String> headerTable = new ArrayList();
    private ArrayList<BeanDetallePedido> data = new ArrayList();
    private ArrayList<TableModelListener> listeners = new ArrayList();        
    
    public ModelTableDetalle() {        
        createHeaders();          
    }

    public ModelTableDetalle(ArrayList<BeanDetallePedido> lista) {
        data = lista;
        createHeaders();        
    }

    private void createHeaders() {
        headerTable.add("CODIGO");        
        headerTable.add("PRODUCTO");
        headerTable.add("PRECIO");
        headerTable.add("CANTIDAD");                     
    }

    public void borrar(int fila) {
        try {
            data.remove(fila);
            TableModelEvent evento;
            evento = new TableModelEvent(this, fila, fila, TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);
            avisaSuscriptores(evento);
            fireTableDataChanged();
        } catch (Exception ex) {
        }
    }

    public void insertar(BeanDetallePedido i) {
        data.add(i);
        TableModelEvent evento;
        evento = new TableModelEvent(this, this.getRowCount() - 1, this.getRowCount() - 1, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        avisaSuscriptores(evento);
        fireTableDataChanged();
    }

    public void update(BeanDetallePedido i, int fila) {
        data.remove(fila);
        data.add(fila, i);
        TableModelEvent evento;
        evento = new TableModelEvent(this, fila, fila, TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE);
        avisaSuscriptores(evento);
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return headerTable.get(column);
    }

    @Override
    public int getRowCount() {
        try {
            return data.size();
        } catch (Exception ex) {
            return 0;
        }
    }

    @Override
    public int getColumnCount() {
        return headerTable.size();
    }

    public BeanDetallePedido getValue(int rowIndex) {
        try {
            return data.get(rowIndex);
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {        
        switch (columnIndex) {
            case 0:                                    
                return data.get(rowIndex).getObjProducto().getCodigo();
            case 1:                
                 return data.get(rowIndex).getObjProducto().getNombre();
            case 2:
                return data.get(rowIndex).getPrecio();
            case 3:
                return data.get(rowIndex).getCantidad();                    
            default:
                return null;
        }
    }
        

    private void avisaSuscriptores(TableModelEvent evento) {
        Iterator i = listeners.iterator();
        while (i.hasNext()) {
            ((TableModelListener) i.next()).tableChanged(evento);
        }        
    }

    @Override
    public int findColumn(String columnName) {
        for (int i = 0; i < headerTable.size(); i++) {
            if (columnName.equals(headerTable.get(i))) {
                return i;
            }
        }
        return -1;
    }

    

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {        
            switch (columnIndex) {
            default:
                return false;
            }                
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        listenerList.add(TableModelListener.class, l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        listenerList.remove(TableModelListener.class, l);
    }

    public ArrayList<BeanDetallePedido> getData() {
        return data;
    }

    /*public void setData(ArrayList<BeanProducto> data) {
        this.data = data;        
        //tablaDatos.getColumnModel().getColumn(3).setCellEditor(new CellEditorCbFacultad());                
        //tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(30);
        //tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(200);          
    }*/

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }
    

    public ArrayList<String> getHeaderTable() {
        return headerTable;
    }

    public void setHeaderTable(ArrayList<String> headerTable) {
        this.headerTable = headerTable;
    }
    

    public void setListeners(ArrayList<TableModelListener> listeners) {
        this.listeners = listeners;
    }

    public void setData(List<BeanDetallePedido> listaProducto) {
        this.data = (ArrayList<BeanDetallePedido>) listaProducto;        
    }
                
}