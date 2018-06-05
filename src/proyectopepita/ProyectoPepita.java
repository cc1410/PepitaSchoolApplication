/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopepita;

import dao.ConectMySQL;
import dao.PepitaDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import utils.Lector;
import vista.Login;

/**
 *
 * @author chen
 */
public class ProyectoPepita {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static String usuarioLogeado;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Login l = new Login();
//        l.setLocationRelativeTo(null);
//        l.setVisible(true);
//        

//
//        String path = "alumnePepitaSchool.csv";
//        Lector lector = new Lector(path);
//        try {
//            lector.insertMasiveUsuario(2);
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
        Class.forName("org.sqlite.JDBC");
        System.out.println("das");
        PepitaDAO pepitaDAO = new PepitaDAO();
        pepitaDAO.conectToBBDD();
        //    pepitaDAO.crearTable();
//        pepitaDAO.deleteTable();

        Login l = new Login();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
//        
//        ConectMySQL conect = new ConectMySQL();
//        conect.conectar();
//        List<Usuario> data = conect.getAllDataUser();
//        List<Curso> dataCurso = conect.getAllDataCurso();
//        List<Asignatura> dataAsignatura = conect.getAllDataAsignatura();
//        List<Clase> dataClase = conect.getAllDataClase();
//        List<Alumno> dataAlumno = conect.getAllDataAlumno();
//        List<Expediente> dataExpedientes = conect.getAllDataExepediente();
//        List<ClaseEvento> dataClaseEventos = conect.getAllDataClaseEvento();
//        List<EventoCalendario> dataEventoCalendarios = conect.getAllDataEventoCalendario();
//        List<AsignaturaMatricula> dataAsignaturaMatriculas = conect.getAllDataAsignaturaMatriculas();
//        List<Nota> dataNotas = conect.getAllDataNota();
//
//         pepitaDAO.conectToBBDD();
//         pepitaDAO.insertUserToSqlite(data);
//        pepitaDAO.insertCursoToSqlite(dataCurso);
//        pepitaDAO.insertAsignaturaToSqlite(dataAsignatura);
//        pepitaDAO.insertClaseToSqlite(dataClase);
//        pepitaDAO.insertAlumnoToSqlite(dataAlumno);
//        pepitaDAO.insertExpedienteToSqlite(dataExpedientes);
//        pepitaDAO.insertClaseEventoToSqlite(dataClaseEventos);
//        pepitaDAO.insertEventoCalendarioToSqlite(dataEventoCalendarios);
//        pepitaDAO.insertAsignaturaMatricularToSqlite(dataAsignaturaMatriculas);
//        pepitaDAO.insertNotaToSqlite(dataNotas);
//        pepitaDAO.closeConection();
//        conect.exportarDatos();
//        
        /* Connection connection = null;

        try {

            //crate a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:Pepita.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30); // set timeout to 30 sec

            statement.executeUpdate("drop table if exists user");
            statement.executeUpdate("create table user (id integer, name varchar(50), password varchar(30))");
            statement.executeUpdate("insert into user values(1, 'fernanda', 'stucom')");
            statement.executeUpdate("insert into user values(2, 'yui', 'stucom')");

            ResultSet rs = statement.executeQuery("select * from user");
            while (rs.next()) {
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
                System.out.println("password = " + rs.getString("password"));
            }

        } catch (SQLException e) {

            //if the error message is "out of memory ",
            // it probably means no database file is found
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // connection  close failed
                System.out.println(e);
            }
        }*/
    }

}
