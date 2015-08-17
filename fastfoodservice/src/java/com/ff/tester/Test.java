/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.tester;

import com.ff.entity.*;
import com.ff.logic.LogicDetallePedido;
import com.ff.logic.LogicPedido;
import com.ff.logic.LogicProducto;
import com.ff.logic.LogicSucursal;
import com.ff.logic.LogicUsuario;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Test {
    public static void main(String arg[]){
        System.out.println(LogicPedido.updateEstado(51,"G"));
    }
}
