package com.lantonium.ventas;

import java.sql*;

public class Conexion {
    public Connection conectar() {
        
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost/Facturacion";
        String user="root";
        String password="";
        
        Connection conexion=DriverManager.getConnection(url, user, password);
        
        return conexion;
    }catch(ClassNotFoundException e){
                System.err.println("Error ->" + e.getMessage());
        }catch(SQLException e){
                System.err.println("Error ->" + e.getMessage());
        }
        return null;
    }

    public static void main (String[] args) throws SQLException{
    Conexion conexion = new Conexion();
    Connection cnx=conexion.conectar();
    try{
        cnx.close();
        System.out.printl(cnx.isClosed());
        }catch(SQLException ex){
                System.err.println("Error ->" + ex.getMessage());
        }
    }
}