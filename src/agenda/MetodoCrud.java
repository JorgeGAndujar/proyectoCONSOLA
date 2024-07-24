package agenda;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

public class MetodoCrud { //CRUD: CREATE READ  UPDATE      DELETE
    //      CREAR  LEER  ACTUALIZAR  ELIMINAR

    //VARIABLES DE INSTANCIA (ATRIBUTOS)
    private Connection conexion;

    //CONSTRUCTORES
    public MetodoCrud(Connection conexion) {
        this.conexion = conexion;
    }

    //METODOS CRUD: CREATE READ UPDATE DELETE
    //READ (SELECT)
    public List<Persona> obtenerTodosLosRegistros() {
        List<Persona> personas_al = new ArrayList<>();
        String sql = "SELECT * FROM Persona";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String paterno = rs.getString("apellido");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String nacimiento = rs.getString("nacimiento");
                Persona alumno = new Persona(dni,nombre,paterno,direccion,telefono,nacimiento);
                personas_al.add(alumno);
            }
        } catch (SQLException e) {
            personas_al = null;
        }
        return personas_al;
    }

    //CREATE (INSERT)
  public boolean insertarPersona(Persona2 persona) {
        boolean correcto = true;
        String sql = "INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ( ?, ?, ?, ?, ?, ?)";//Quary Paramétrica
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, persona.getDni());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getPaterno());
            ps.setString(4, persona.getDireccion());
            ps.setString(5, persona.getTelefono());
            ps.setString(6, persona.getNacimiento());
            ps.executeUpdate();
        } catch (SQLException e) {
            correcto = false;
        }
        return correcto;
    }
    //UPDATE(UPDATE)
    public boolean actualizarPersona(Persona2 persona) {
        boolean correcto = true;
        String sql = "UPDATE Persona SET dni = ?, nombre = ?, paterno = ?, direccion = ?, telefono = ?,nacimiento = ?";
         try{       
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, persona.getDni());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getPaterno());
            ps.setString(4, persona.getDireccion());
            ps.setString(5, persona.getTelefono());
            ps.setString(6, persona.getNacimiento());
            ps.executeUpdate();
        } catch (SQLException e) {
            correcto = false;
        }
        return correcto;
    }


    public boolean existePersona(Persona2 persona) {
        boolean existe = true;
        String sql = "SELECT * FROM Persona WHERE DNI = ?";//Query paramétrica
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, persona.getDni());
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                existe = false;
            }
        } catch (SQLException e) {
            existe = false;
        }
        return existe;
    }

    public boolean eliminarPersona (Persona2 persona) {
        boolean correcto = false;
        String sql = "DELETE FROM Alumno WHERE DNI = ?";//Query Paramétrica
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, persona.getDni());
            ps.executeUpdate();
            correcto = true;
        } catch (SQLException e) {
            correcto = false;
        }
        return correcto;
    }
}
