/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Alumno;
import model.Asignatura;
import model.AsignaturaMatricula;
import model.Clase;
import model.ClaseEvento;
import model.Curso;
import model.EventoCalendario;
import model.Expediente;
import model.Nota;
import model.Profesor;
import model.Trimestre;
import model.Usuario;

/**
 *
 * @author chen
 */
public class ConectMySQL {

    Connection conexion;

    public void conectar() throws SQLException {
        String url = "jdbc:mysql://mysql377.srv-hostalia.com:3306/db4944383_pepita";
        String user = "u4944383_pepita";
        String pass = "of1G3X2I";
        conexion = DriverManager.getConnection(url, user, pass);
    }

    public void desconectar() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }

    public void exportarDatos() throws SQLException {
        String select = "(SELECT 'mail', 'name', 'lastname', 'password', 'dni', 'type')\n"
                + "UNION \n"
                + "(SELECT mail, name, lastname, password, dni, type\n"
                + "FROM users\n"
                + "INTO OUTFILE 'users.csv'\n"
                + "FIELDS ENCLOSED BY '' TERMINATED BY ';' ESCAPED BY ''\n"
                + "LINES TERMINATED BY '\\r\\n');";
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        rs.close();
        st.close();
    }

    public List<Usuario> getAllDataUser() throws SQLException {
        String select = "select * from users";
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        List<Usuario> data = new ArrayList<>();
        while (rs.next()) {
            Usuario u = new Usuario();
            u.setEmail(rs.getString("mail"));
            u.setNombre(rs.getString("name"));
            u.setApellido(rs.getString("lastname"));
            u.setPassword(rs.getString("password"));
            u.setDni(rs.getString("dni"));
            u.setType(rs.getInt("type"));
            data.add(u);
        }
        return data;
    }

    public List<Curso> getAllDataCurso() throws SQLException {
        String select = "select * from curso";
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        List<Curso> data = new ArrayList<>();
        while (rs.next()) {
            Curso c = new Curso();
            c.setNombre(rs.getString("nombre"));
            c.setAnyo(rs.getInt("ano"));
            data.add(c);
        }
        return data;
    }

    public List<Asignatura> getAllDataAsignatura() throws SQLException {
        String select = "select * from asignatura";
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        List<Asignatura> data = new ArrayList<>();
        while (rs.next()) {
            Asignatura a = new Asignatura();
            a.setNombre(rs.getString("nombre"));
            a.setCurso(new Curso(rs.getString("curso")));
            data.add(a);
        }
        return data;
    }

    public List<Clase> getAllDataClase() throws SQLException {
        String select = "select * from clase";
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        List<Clase> data = new ArrayList<>();
        while (rs.next()) {
            Clase c = new Clase();
            c.setNombre(rs.getString("nombre"));
            c.setCurso(new Curso(rs.getString("curso")));
            c.setTutor(new Usuario(rs.getString("tutor")));
            data.add(c);
        }
        return data;
    }

    public List<Alumno> getAllDataAlumno() throws SQLException {
        String select = "select * from alumno";
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        List<Alumno> data = new ArrayList<>();
        while (rs.next()) {
            Alumno a = new Alumno();
            a.setEmail(rs.getString("email"));
            a.setClase(new Clase(rs.getString("clase")));
            data.add(a);
        }
        return data;
    }

    public List<Expediente> getAllDataExepediente() throws SQLException {
        String select = "select * from expediente";
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        List<Expediente> data = new ArrayList<>();
        while (rs.next()) {
            Expediente e = new Expediente();
            e.setAlumno(new Usuario(rs.getString("email")));
            e.setEstado(rs.getString("estado"));
            data.add(e);
        }
        return data;
    }

    public List<ClaseEvento> getAllDataClaseEvento() throws SQLException {
        String select = "select * from clase_evento";
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        List<ClaseEvento> data = new ArrayList<>();
        while (rs.next()) {
            ClaseEvento c = new ClaseEvento();
            c.setAsignatura(new Asignatura(rs.getString("asignatura")));
            c.setProfesor(new Usuario(rs.getString("profesor")));
            c.setDiaSemana(rs.getString("dia_semana"));
            c.setHoraInicial(rs.getInt("hora_inicial"));
            c.setClase(new Clase(rs.getString("clase")));
            data.add(c);
        }
        return data;
    }

    public List<EventoCalendario> getAllDataEventoCalendario() throws SQLException {
        String select = "select * from evento_calendario";
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        List<EventoCalendario> data = new ArrayList<>();
        while (rs.next()) {
            EventoCalendario e = new EventoCalendario();
            e.setId(rs.getInt("id"));
            e.setNombre(rs.getString("nombre"));
            e.setDescripcion(rs.getString("descripcion"));
            e.setFecha(rs.getDate("fecha"));
            e.setClase(new Clase(rs.getString("clase")));
            e.setAno(rs.getInt("anyo"));
            data.add(e);
        }
        return data;
    }

    public List<AsignaturaMatricula> getAllDataAsignaturaMatriculas() throws SQLException {
        String select = "select * from asignatura_matricular";
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        List<AsignaturaMatricula> data = new ArrayList<>();
        while (rs.next()) {
            AsignaturaMatricula a = new AsignaturaMatricula();
            a.setAsignatura(new Asignatura(rs.getString("asignatura")));
            a.setProfesor(new Usuario(rs.getString("profesor")));
            a.setTrimestre(new Trimestre(rs.getString("trimestre")));
            a.setExpediente(new Expediente(new Usuario(rs.getString("alumno"))));
            data.add(a);
        }
        return data;
    }

    public List<Nota> getAllDataNota() throws SQLException {
        String select = "select * from nota";
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        List<Nota> data = new ArrayList<>();
        while (rs.next()) {
            Nota n = new Nota();
            n.setId(rs.getInt("id"));
            n.setAsignaturaMarticula(new AsignaturaMatricula(new Asignatura(rs.getString("asignatura_matricular"))));
            n.setEstado(rs.getString("estado"));
            n.setComentario(rs.getString("comentario"));
            n.setAlumno(new Usuario(rs.getString("alumno")));
            n.setNotas(rs.getFloat("nota"));
            data.add(n);
        }
        return data;
    }

}
