/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modeltable.wsclient;

import Clientff.BeanProducto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.event.EventListenerList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author zorrito
 */
public class ModelTableProducto extends AbstractTableModel {

    private ArrayList<String> headerTable = new ArrayList();
    private ArrayList<BeanProducto> data = new ArrayList();
    private ArrayList<TableModelListener> listeners = new ArrayList();        
    
    public ModelTableProducto() {        
        createHeaders();          
    }

    public ModelTableProducto(ArrayList<BeanProducto> lista) {
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

    public void insertar(BeanProducto i) {
        data.add(i);
        TableModelEvent evento;
        evento = new TableModelEvent(this, this.getRowCount() - 1, this.getRowCount() - 1, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        avisaSuscriptores(evento);
        fireTableDataChanged();
    }

    public void update(BeanProducto i, int fila) {
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

    public BeanProducto getValue(int rowIndex) {
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
                return data.get(rowIndex).getCodigo();
            case 1:                
                 return data.get(rowIndex).getNombre();                   
            case 2:
                return data.get(rowIndex).getPrecio();
            case 3:
                return data.get(rowIndex).getCantidad();        
            default:
                return null;
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {                                               
        int valor=0;
       switch (columnIndex) {
            case 0:                
                break;
            case 1: 
                break;
            case 2:                  
                break;                    
            case 3:                        
                valor=Integer.parseInt(String.valueOf(aValue));                                                
                data.get(rowIndex).setCantidad(valor);                                
                break;                            
            default:
                break;
        }                     
       TableModelEvent evento;
        evento = new TableModelEvent(this, rowIndex, rowIndex, TableModelEvent.ALL_COLUMNS, TableModelEvent.ALL_COLUMNS);
        avisaSuscriptores(evento);
        fireTableDataChanged();
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
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Double.class;
            case 3:
                return Integer.class;                       
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {        
            switch (columnIndex) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return true;                        
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

    public ArrayList<BeanProducto> getData() {
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

    public void setData(List<BeanProducto> listaProducto) {
        this.data = (ArrayList<BeanProducto>) listaProducto;        
    }
                
}
