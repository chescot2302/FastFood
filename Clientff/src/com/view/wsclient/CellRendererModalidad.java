/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.wsclient;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Administrador
 */
public class CellRendererModalidad implements TableCellRenderer {

    private JLabel lblimage = new JLabel();

    public CellRendererModalidad() {
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {        
        value=String.valueOf(value);
        if (value.equals("T")) {
            lblimage.setText("Telefono");
        } else if (value.equals("I")) {
            lblimage.setText("Internet");
        } 
        return lblimage;
    }
}

