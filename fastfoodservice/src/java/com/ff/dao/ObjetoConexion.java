package com.ff.dao;


/**
 *
 * @author JONATHAN
 */
public class ObjetoConexion {    
    private  Conexion oracle;                   
    
    public  Conexion conectarORACLE() {
        try {
            //oracle = new Conexion("localhost", "1521", "XE", "fastfood", "admin", "ORACLE");
            oracle = new Conexion("localhost", "1521", "orcl", "prueba", "prueba", "ORACLE");
            boolean estado=oracle.conectarBD();
            if(estado){
            System.out.println("CONECTADO CORRECTAMENTE");
            return oracle;
            }else{
            System.out.println("ERROR AL CONECTAR");
                return null;
            }
        } catch (Exception ex) {
            System.out.println("ERROR AL CONECTAR: "+ex.getCause());            
            return null;
        }
    }    

    public Conexion getOracle() {
        return oracle;
    }
    
}
