/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
import model.Usuario;

/**
 *
 * @author chen
 */
public class PepitaDAO {

    static Connection connection = null;

    public void conectToBBDD() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:Pepita.db");
    }

    public void insertUser(String name, String lastname, String username, String password, String dni, String email, Integer type) throws SQLException {
        Statement st = connection.createStatement();
        st.executeUpdate("insert into user values(null, '" + name + "', '" + lastname + "','" + username + "','" + password + "', '" + dni + "', '" + email + "', '" + type + "')");
    }

    public void insertCurso(String name, String year) throws SQLException {
        Statement st = connection.createStatement();
        st.executeUpdate("insert into course values(null, '" + name + "', '" + year + "')");
    }

    public void insertClase(String name) throws SQLException {
        Statement st = connection.createStatement();
        st.executeUpdate("insert into classroom values(null, '" + name + "')");
    }

    public void insertAsignatura(String name) throws SQLException {
        Statement st = connection.createStatement();
        // st.executeUpdate("drop table if exists user");
        st.executeUpdate("insert into subject values(null, '" + name + "')");
    }

    public int getTypeUser(String username) throws SQLException {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select type from user where username = '" + username + "'");
        return rs.getInt("type");
    }

    public boolean existUser(String username) throws SQLException {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from user where username = '" + username + "'");
        boolean exist = false;
        if (rs.next()) {
            exist = true;
        }
        return exist;
    }

    public boolean validateUser(String username, String password) throws SQLException {
        boolean login = false;
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from user where name = '" + username + "' and password = '" + password + "'");
        if (rs.next()) {
            login = true;
        }
        rs.close();
        st.close();
        return login;
    }

    public void closeConection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public List<Asignatura> listAsignaturaByProfesor(String email) throws SQLException {
        String select = "select * from asignatura where profesor = '" + email + "';";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(select);
        List<Asignatura> listAux = new ArrayList<>();
        while (rs.next()) {
            Asignatura u = new Asignatura();
            u.setNombre(rs.getString("nombre"));
            listAux.add(u);
        }
        rs.close();
        st.close();
        return listAux;
    }

    public void crearTable() throws SQLException {
        Statement st = connection.createStatement();
        st.executeUpdate("CREATE TABLE `users` (\n"
                + "  `mail` varchar(45) NOT NULL,\n"
                + "  `name` varchar(45) NOT NULL,\n"
                + "  `lastname` varchar(45) NOT NULL,\n"
                + "  `password` varchar(45) NOT NULL,\n"
                + "  `dni` varchar(45) NOT NULL,\n"
                + "  `type` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`mail`)\n"
                + ")");
        st.executeUpdate("CREATE TABLE `profesor` (\n"
                + "  `email` varchar(45) NOT NULL,\n"
                + "  PRIMARY KEY (`email`)\n"
                + ")");
        st.executeUpdate("CREATE TABLE `curso` (\n"
                + "  `nombre` varchar(45) NOT NULL,\n"
                + "  `ano` int(11) DEFAULT NULL,\n"
                + "  PRIMARY KEY (`nombre`)\n"
                + ")");
        st.executeUpdate("CREATE TABLE `asignatura` (\n"
                + "  `nombre` varchar(45) NOT NULL,\n"
                + "  `curso` varchar(45) DEFAULT NULL,\n"
                + "  PRIMARY KEY (`nombre`),\n"
                + "  CONSTRAINT `asignatura-curso` FOREIGN KEY (`curso`) REFERENCES `curso` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE\n"
                + ")");
        st.executeUpdate("CREATE TABLE `clase` (\n"
                + "  `nombre` varchar(45) NOT NULL,\n"
                + "  `curso` varchar(45) DEFAULT NULL,\n"
                + "  `tutor` varchar(45) DEFAULT NULL,\n"
                + "  PRIMARY KEY (`nombre`),\n"
                + "  CONSTRAINT `curso-clase` FOREIGN KEY (`curso`) REFERENCES `curso` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE,\n"
                + "  CONSTRAINT `tutor-clase` FOREIGN KEY (`tutor`) REFERENCES `users` (`mail`) ON DELETE CASCADE ON UPDATE CASCADE\n"
                + ")");
        st.executeUpdate("CREATE TABLE `alumno` (\n"
                + "  `email` varchar(45) NOT NULL,\n"
                + "  `clase` varchar(45) DEFAULT NULL,\n"
                + "  PRIMARY KEY (`email`),\n"
                + "  CONSTRAINT `alumno-clase` FOREIGN KEY (`clase`) REFERENCES `clase` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE,\n"
                + "  CONSTRAINT `alumno-user` FOREIGN KEY (`email`) REFERENCES `users` (`mail`) ON DELETE CASCADE ON UPDATE CASCADE\n"
                + ")");
        st.executeUpdate("CREATE TABLE `expediente` (\n"
                + "  `email` varchar(45) NOT NULL,\n"
                + "  `estado` varchar(45) DEFAULT NULL,\n"
                + "  PRIMARY KEY (`email`),\n"
                + "  CONSTRAINT `alumno_expediente` FOREIGN KEY (`email`) REFERENCES `alumno` (`email`) ON DELETE CASCADE ON UPDATE CASCADE\n"
                + ")");
        st.executeUpdate("CREATE TABLE `clase_evento` (\n"
                + "  `asignatura` varchar(45) NOT NULL,\n"
                + "  `profesor` varchar(45) NOT NULL,\n"
                + "  `dia_semana` varchar(45) NOT NULL,\n"
                + "  `hora_inicial` int(11) NOT NULL,\n"
                + "  `clase` varchar(45) DEFAULT NULL,\n"
                + "  CONSTRAINT `clase_evento_asignatura` FOREIGN KEY (`asignatura`) REFERENCES `asignatura` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE,\n"
                + "  CONSTRAINT `clase_evento_clase` FOREIGN KEY (`clase`) REFERENCES `clase` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE,\n"
                + "  CONSTRAINT `clase_evento_profesor` FOREIGN KEY (`profesor`) REFERENCES `profesor` (`email`) ON DELETE CASCADE ON UPDATE CASCADE\n"
                + ")");
        st.executeUpdate("CREATE TABLE `evento_calendario` (\n"
                + "  `id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n"
                + "  `nombre` varchar(45) DEFAULT NULL,\n"
                + "  `descripcion` varchar(90) DEFAULT NULL,\n"
                + "  `fecha` date DEFAULT NULL,\n"
                + "  `clase` varchar(45) DEFAULT NULL,\n"
                + "  `anyo` varchar(45) DEFAULT NULL,\n"
                + "  CONSTRAINT `calendario_clase` FOREIGN KEY (`clase`) REFERENCES `clase` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE\n"
                + ")");
        st.executeUpdate("CREATE TABLE `asignatura_matricular` (\n"
                + "  `asignatura` varchar(45) NOT NULL,\n"
                + "  `profesor` varchar(45) NOT NULL,\n"
                + "  `trimestre` varchar(45) DEFAULT NULL,\n"
                + "  `expediente` varchar(45) NOT NULL,\n"
                + "  PRIMARY KEY (`asignatura`,`profesor`,`expediente`),\n"
                + "  CONSTRAINT `matricular-assignatura` FOREIGN KEY (`asignatura`) REFERENCES `asignatura` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE,\n"
                + "  CONSTRAINT `matricular-assignatura-expediente` FOREIGN KEY (`expediente`) REFERENCES `expediente` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,\n"
                + "  CONSTRAINT `matricular-assignatura-profesor` FOREIGN KEY (`profesor`) REFERENCES `profesor` (`email`) ON DELETE CASCADE ON UPDATE CASCADE\n"
                + ")");
        st.executeUpdate("CREATE TABLE `nota` (\n"
                + "  `id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n"
                + "  `asignatura_matricular` varchar(45) DEFAULT NULL,\n"
                + "  `estado` varchar(45) DEFAULT NULL,\n"
                + "  `comentario` varchar(90) DEFAULT NULL,\n"
                + "  `alumno` varchar(45) DEFAULT NULL,\n"
                + "  `nota` float(50) DEFAULT NULL,\n"
                + "  CONSTRAINT `nota-alumno` FOREIGN KEY (`alumno`) REFERENCES `alumno` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,\n"
                + "  CONSTRAINT `nota-assignatura` FOREIGN KEY (`asignatura_matricular`) REFERENCES `asignatura_matricular` (`asignatura`) ON DELETE CASCADE ON UPDATE CASCADE\n"
                + ")");

    }

    public void deleteTable() throws SQLException {
        Statement st = connection.createStatement();
        st.executeUpdate("DELETE FROM users");
        st.executeUpdate("DELETE FROM profesor");
        st.executeUpdate("DELETE FROM curso");
        st.executeUpdate("DELETE FROM asignatura");
        st.executeUpdate("DELETE FROM clase");
        st.executeUpdate("DELETE FROM alumno");
        st.executeUpdate("DELETE FROM expediente");
        st.executeUpdate("DELETE FROM clase_evento");
        st.executeUpdate("DELETE FROM evento_calendario");
        st.executeUpdate("DELETE FROM nota");
        st.executeUpdate("DELETE FROM asignatura_matricular");
    }

    public void insertUserToSqlite(List<Usuario> data) throws SQLException {
        Statement st = connection.createStatement();
        for (Usuario u : data) {
            st.executeUpdate("insert into users values('" + u.getEmail() + "', '" + u.getNombre() + "','" + u.getApellido() + "','" + u.getPassword() + "', '" + u.getDni() + "', '" + u.getType() + "')");
        }
    }

    public void insertCursoToSqlite(List<Curso> data) throws SQLException {
        Statement st = connection.createStatement();
        for (Curso c : data) {
            st.executeUpdate("insert into curso values('" + c.getNombre() + "', '" + c.getAnyo() + "')");
        }
    }

    public void insertAsignaturaToSqlite(List<Asignatura> data) throws SQLException {
        Statement st = connection.createStatement();
        for (Asignatura a : data) {
            st.executeUpdate("insert into asignatura values('" + a.getNombre() + "', '" + a.getCurso().getNombre() + "')");
        } 
    }

    public void insertClaseToSqlite(List<Clase> data) throws SQLException {
        Statement st = connection.createStatement();
        for (Clase c : data) {
            st.executeUpdate("insert into clase values('" + c.getNombre() + "', '" + c.getCurso().getNombre() + "','" + c.getTutor().getEmail() + "')");
        }
    }

    public void insertAlumnoToSqlite(List<Alumno> data) throws SQLException {
        Statement st = connection.createStatement();
        for (Alumno a : data) {
            st.executeUpdate("insert into alumno values('" + a.getEmail() + "', '" + a.getClase().getNombre() + "')");
        }
    }

    public void insertExpedienteToSqlite(List<Expediente> data) throws SQLException {
        Statement st = connection.createStatement();
        for (Expediente e : data) {
            st.executeUpdate("insert into expediente values('" + e.getAlumno().getEmail() + "', '" + e.getEstado() + "')");
        }
    }

    public void insertClaseEventoToSqlite(List<ClaseEvento> data) throws SQLException {
        Statement st = connection.createStatement();
        for (ClaseEvento c : data) {
            st.executeUpdate("insert into clase_evento values('" + c.getAsignatura().getNombre() + "', '" + c.getProfesor().getEmail() + "','" + c.getDiaSemana() + "','" + c.getHoraInicial() + "','" + c.getClase().getNombre() + "')");
        }
    }

    public void insertEventoCalendarioToSqlite(List<EventoCalendario> data) throws SQLException {
        Statement st = connection.createStatement();
        for (EventoCalendario e : data) {
            st.executeUpdate("insert into evento_calendario values('" + e.getId() + "', '" + e.getNombre() + "','" + e.getDescripcion() + "','" + e.getFecha() + "','" + e.getClase().getNombre() + "','" + e.getAno() + "')");
        }
    }

    public void insertAsignaturaMatricularToSqlite(List<AsignaturaMatricula> data) throws SQLException {
        Statement st = connection.createStatement();
        for (AsignaturaMatricula e : data) {
            st.executeUpdate("insert into asignatura_matricular values('" + e.getAsignatura().getNombre() + "', '" + e.getProfesor().getEmail() + "','" + e.getTrimestre() + "','" + e.getExpediente().getAlumno().getEmail() + "')");
        }
    }

    public void insertNotaToSqlite(List<Nota> data) throws SQLException {
        Statement st = connection.createStatement();
        for (Nota n : data) {
            st.executeUpdate("insert into nota values('" + n.getId() + "', '" + n.getAsignaturaMarticula().getAsignatura().getNombre() + "','" + n.getEstado() + "','" + n.getComentario() + "','" + n.getAlumno().getEmail() + "','" + n.getNotas() + "')");
        }
    }

}
