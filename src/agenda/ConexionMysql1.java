package agenda;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexionMysql1 {

    //VARIABLES DE INSTANCIA(ATRIBUTO)
    String nombreBaseDatos; //ENTRADA
    Connection conexion; //SALIDA

    //DATOD DE LA CONEXION
    String protocolo = "jdbc:mysql";
    String nombreServidor = "localhost";//127.0.0.1
    String puerto = "3307";

    String usuario = "root";
    String clave = "12345678";

    //CONSTRUCTORES
    public ConexionMysql1(String nombreBaseDatos) {
        this.nombreBaseDatos = nombreBaseDatos;
        setConexion();

    }

    //METODOS SET(crear la conexion-cambiar) Y GET
    public Connection getConexion() {
        return conexion;
    }

    public void setConexion() {//PONER CONEXION
        String url = protocolo + "://" + nombreServidor + ":"
                + puerto + "/" + nombreBaseDatos;
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            conexion = null;
        }
    }

}
