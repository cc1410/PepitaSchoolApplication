/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.PepitaDAO;
import java.awt.Color;
import java.io.File;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFileChooser;

/**
 *
 * @author chen
 */
public class HomeAdmin extends javax.swing.JFrame {

    PepitaDAO pepitaDAO = new PepitaDAO();

    /**
     * Creates new form Home
     */
    public HomeAdmin() throws SQLException {
        initComponents();
        pepitaDAO.conectToBBDD();
        selectButon(jbAltaProfesor);
        altaProfesor.setVisible(true);
        altaAlumno.setVisible(false);
        altaClases.setVisible(false);
        altaAsignaturas.setVisible(false);
        altaCursos.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jbAltaCurso = new javax.swing.JButton();
        jbAltaProfesor = new javax.swing.JButton();
        jbAltaAlumnos = new javax.swing.JButton();
        jbAltaClasses = new javax.swing.JButton();
        jlPerfil = new javax.swing.JLabel();
        jlClose = new javax.swing.JLabel();
        jbAltaAsignaturas = new javax.swing.JButton();
        altaProfesor = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfUsername = new javax.swing.JTextField();
        jtfPassword = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jtfApellidos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jbInsertVariosProfesor = new javax.swing.JButton();
        jbInsertProfesor = new javax.swing.JButton();
        altaAlumno = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtfUsernameAlumno = new javax.swing.JTextField();
        jtfPasswordAlumno = new javax.swing.JTextField();
        jtfNameAlumno = new javax.swing.JTextField();
        jtfApellidosAlumno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtfEmailAlumno = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtfDniAlumno = new javax.swing.JTextField();
        jbInsertAlumno = new javax.swing.JButton();
        jblInsertVariosAlumnos = new javax.swing.JButton();
        altaCursos = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtfNombreCurso = new javax.swing.JTextField();
        jtfAnoCurso = new javax.swing.JTextField();
        jbInsertCurso = new javax.swing.JButton();
        altaClases = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtfNombreClase = new javax.swing.JTextField();
        jbInsertClase = new javax.swing.JButton();
        altaAsignaturas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtfNombreAsignatura = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jbInsertAsignatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(12, 204, 144));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbAltaCurso.setBackground(new java.awt.Color(155, 236, 164));
        jbAltaCurso.setForeground(new java.awt.Color(102, 102, 102));
        jbAltaCurso.setText("Alta cursos");
        jbAltaCurso.setBorder(null);
        jbAltaCurso.setBorderPainted(false);
        jbAltaCurso.setFocusable(false);
        jbAltaCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaCursoActionPerformed(evt);
            }
        });
        menu.add(jbAltaCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 110, 30));

        jbAltaProfesor.setBackground(new java.awt.Color(155, 236, 164));
        jbAltaProfesor.setForeground(new java.awt.Color(102, 102, 102));
        jbAltaProfesor.setText("Alta profesor");
        jbAltaProfesor.setBorder(null);
        jbAltaProfesor.setBorderPainted(false);
        jbAltaProfesor.setFocusable(false);
        jbAltaProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaProfesorActionPerformed(evt);
            }
        });
        menu.add(jbAltaProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 110, 30));

        jbAltaAlumnos.setBackground(new java.awt.Color(155, 236, 164));
        jbAltaAlumnos.setForeground(new java.awt.Color(102, 102, 102));
        jbAltaAlumnos.setText("Alta alumnos");
        jbAltaAlumnos.setBorder(null);
        jbAltaAlumnos.setBorderPainted(false);
        jbAltaAlumnos.setFocusable(false);
        jbAltaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaAlumnosActionPerformed(evt);
            }
        });
        menu.add(jbAltaAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 110, 30));

        jbAltaClasses.setBackground(new java.awt.Color(155, 236, 164));
        jbAltaClasses.setForeground(new java.awt.Color(102, 102, 102));
        jbAltaClasses.setText("Alta clases");
        jbAltaClasses.setBorder(null);
        jbAltaClasses.setBorderPainted(false);
        jbAltaClasses.setFocusable(false);
        jbAltaClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaClassesActionPerformed(evt);
            }
        });
        menu.add(jbAltaClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 110, 30));

        jlPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_User_Male_48px_2.png"))); // NOI18N
        menu.add(jlPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, -1, -1));

        jlClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Close_Window_20px_1.png"))); // NOI18N
        jlClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCloseMouseClicked(evt);
            }
        });
        menu.add(jlClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 20));

        jbAltaAsignaturas.setBackground(new java.awt.Color(155, 236, 164));
        jbAltaAsignaturas.setForeground(new java.awt.Color(102, 102, 102));
        jbAltaAsignaturas.setText("Alta asignaturas");
        jbAltaAsignaturas.setBorder(null);
        jbAltaAsignaturas.setBorderPainted(false);
        jbAltaAsignaturas.setFocusable(false);
        jbAltaAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaAsignaturasActionPerformed(evt);
            }
        });
        menu.add(jbAltaAsignaturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 110, 30));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 100));

        altaProfesor.setBackground(new java.awt.Color(255, 255, 255));
        altaProfesor.setForeground(new java.awt.Color(204, 204, 204));
        altaProfesor.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(12, 112, 84));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(12, 112, 84));
        jLabel7.setText("Alta de Profesor");
        altaProfesor.add(jLabel7);
        jLabel7.setBounds(420, 20, 180, 24);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 222, 158));
        jLabel2.setText("Email");
        altaProfesor.add(jLabel2);
        jLabel2.setBounds(350, 270, 80, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 222, 158));
        jLabel4.setText("Nombre");
        altaProfesor.add(jLabel4);
        jLabel4.setBounds(350, 80, 60, 20);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 222, 158));
        jLabel5.setText("Password");
        altaProfesor.add(jLabel5);
        jLabel5.setBounds(350, 200, 80, 20);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 222, 158));
        jLabel6.setText("Apellidos");
        altaProfesor.add(jLabel6);
        jLabel6.setBounds(350, 120, 80, 20);

        jtfUsername.setBackground(new java.awt.Color(255, 255, 255));
        jtfUsername.setForeground(new java.awt.Color(0, 0, 0));
        jtfUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaProfesor.add(jtfUsername);
        jtfUsername.setBounds(430, 150, 170, 30);

        jtfPassword.setBackground(new java.awt.Color(255, 255, 255));
        jtfPassword.setForeground(new java.awt.Color(0, 0, 0));
        jtfPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaProfesor.add(jtfPassword);
        jtfPassword.setBounds(430, 190, 170, 30);

        jtfName.setBackground(new java.awt.Color(255, 255, 255));
        jtfName.setForeground(new java.awt.Color(0, 0, 0));
        jtfName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaProfesor.add(jtfName);
        jtfName.setBounds(430, 70, 170, 30);

        jtfApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jtfApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jtfApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaProfesor.add(jtfApellidos);
        jtfApellidos.setBounds(430, 110, 170, 30);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 222, 158));
        jLabel11.setText("Username");
        altaProfesor.add(jLabel11);
        jLabel11.setBounds(350, 160, 80, 20);

        jtfEmail.setBackground(new java.awt.Color(255, 255, 255));
        jtfEmail.setForeground(new java.awt.Color(0, 0, 0));
        jtfEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaProfesor.add(jtfEmail);
        jtfEmail.setBounds(430, 270, 170, 30);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 222, 158));
        jLabel12.setText("Dni");
        altaProfesor.add(jLabel12);
        jLabel12.setBounds(350, 230, 80, 30);

        jtfDni.setBackground(new java.awt.Color(255, 255, 255));
        jtfDni.setForeground(new java.awt.Color(0, 0, 0));
        jtfDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaProfesor.add(jtfDni);
        jtfDni.setBounds(430, 230, 170, 30);

        jbInsertVariosProfesor.setBackground(new java.awt.Color(12, 112, 84));
        jbInsertVariosProfesor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbInsertVariosProfesor.setForeground(new java.awt.Color(255, 255, 255));
        jbInsertVariosProfesor.setText("Insertar varios");
        jbInsertVariosProfesor.setBorder(null);
        jbInsertVariosProfesor.setBorderPainted(false);
        jbInsertVariosProfesor.setFocusable(false);
        jbInsertVariosProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbInsertVariosProfesorMouseClicked(evt);
            }
        });
        altaProfesor.add(jbInsertVariosProfesor);
        jbInsertVariosProfesor.setBounds(60, 50, 150, 30);

        jbInsertProfesor.setBackground(new java.awt.Color(12, 112, 84));
        jbInsertProfesor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbInsertProfesor.setForeground(new java.awt.Color(255, 255, 255));
        jbInsertProfesor.setText("Insertar");
        jbInsertProfesor.setBorder(null);
        jbInsertProfesor.setBorderPainted(false);
        jbInsertProfesor.setFocusable(false);
        jbInsertProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInsertProfesorActionPerformed(evt);
            }
        });
        altaProfesor.add(jbInsertProfesor);
        jbInsertProfesor.setBounds(400, 320, 150, 30);

        getContentPane().add(altaProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 400));

        altaAlumno.setBackground(new java.awt.Color(255, 255, 255));
        altaAlumno.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(12, 112, 84));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(12, 112, 84));
        jLabel8.setText("Alta de Alumno");
        altaAlumno.add(jLabel8);
        jLabel8.setBounds(420, 20, 180, 24);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 222, 158));
        jLabel13.setText("Email");
        altaAlumno.add(jLabel13);
        jLabel13.setBounds(350, 270, 80, 30);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 222, 158));
        jLabel14.setText("Nombre");
        altaAlumno.add(jLabel14);
        jLabel14.setBounds(360, 80, 60, 20);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 222, 158));
        jLabel15.setText("Password");
        altaAlumno.add(jLabel15);
        jLabel15.setBounds(350, 200, 80, 20);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 222, 158));
        jLabel16.setText("Apellidos");
        altaAlumno.add(jLabel16);
        jLabel16.setBounds(350, 120, 80, 20);

        jtfUsernameAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jtfUsernameAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jtfUsernameAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaAlumno.add(jtfUsernameAlumno);
        jtfUsernameAlumno.setBounds(430, 150, 170, 30);

        jtfPasswordAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jtfPasswordAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jtfPasswordAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaAlumno.add(jtfPasswordAlumno);
        jtfPasswordAlumno.setBounds(430, 190, 170, 30);

        jtfNameAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jtfNameAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jtfNameAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaAlumno.add(jtfNameAlumno);
        jtfNameAlumno.setBounds(430, 70, 170, 30);

        jtfApellidosAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jtfApellidosAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jtfApellidosAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaAlumno.add(jtfApellidosAlumno);
        jtfApellidosAlumno.setBounds(430, 110, 170, 30);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 222, 158));
        jLabel17.setText("Username");
        altaAlumno.add(jLabel17);
        jLabel17.setBounds(350, 160, 80, 20);

        jtfEmailAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jtfEmailAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jtfEmailAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaAlumno.add(jtfEmailAlumno);
        jtfEmailAlumno.setBounds(430, 270, 170, 30);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 222, 158));
        jLabel18.setText("Dni");
        altaAlumno.add(jLabel18);
        jLabel18.setBounds(350, 230, 80, 30);

        jtfDniAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jtfDniAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jtfDniAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaAlumno.add(jtfDniAlumno);
        jtfDniAlumno.setBounds(430, 230, 170, 30);

        jbInsertAlumno.setBackground(new java.awt.Color(12, 112, 84));
        jbInsertAlumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbInsertAlumno.setForeground(new java.awt.Color(255, 255, 255));
        jbInsertAlumno.setText("Insertar");
        jbInsertAlumno.setBorder(null);
        jbInsertAlumno.setBorderPainted(false);
        jbInsertAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInsertAlumnoActionPerformed(evt);
            }
        });
        altaAlumno.add(jbInsertAlumno);
        jbInsertAlumno.setBounds(400, 320, 150, 30);

        jblInsertVariosAlumnos.setBackground(new java.awt.Color(12, 112, 84));
        jblInsertVariosAlumnos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jblInsertVariosAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        jblInsertVariosAlumnos.setText("Insertar varios");
        jblInsertVariosAlumnos.setBorder(null);
        jblInsertVariosAlumnos.setBorderPainted(false);
        jblInsertVariosAlumnos.setFocusable(false);
        jblInsertVariosAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblInsertVariosAlumnosMouseClicked(evt);
            }
        });
        altaAlumno.add(jblInsertVariosAlumnos);
        jblInsertVariosAlumnos.setBounds(60, 50, 150, 30);

        getContentPane().add(altaAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 400));

        altaCursos.setBackground(new java.awt.Color(255, 255, 255));
        altaCursos.setLayout(null);

        jLabel19.setBackground(new java.awt.Color(12, 112, 84));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(12, 112, 84));
        jLabel19.setText("Alta de Curso");
        altaCursos.add(jLabel19);
        jLabel19.setBounds(430, 20, 130, 24);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 222, 158));
        jLabel20.setText("Año");
        altaCursos.add(jLabel20);
        jLabel20.setBounds(350, 180, 70, 19);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 222, 158));
        jLabel21.setText("Nombre");
        altaCursos.add(jLabel21);
        jLabel21.setBounds(350, 130, 80, 20);

        jtfNombreCurso.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombreCurso.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombreCurso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaCursos.add(jtfNombreCurso);
        jtfNombreCurso.setBounds(430, 120, 170, 30);

        jtfAnoCurso.setBackground(new java.awt.Color(255, 255, 255));
        jtfAnoCurso.setForeground(new java.awt.Color(0, 0, 0));
        jtfAnoCurso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaCursos.add(jtfAnoCurso);
        jtfAnoCurso.setBounds(430, 170, 170, 30);

        jbInsertCurso.setBackground(new java.awt.Color(12, 112, 84));
        jbInsertCurso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbInsertCurso.setForeground(new java.awt.Color(255, 255, 255));
        jbInsertCurso.setText("Insertar");
        jbInsertCurso.setBorder(null);
        jbInsertCurso.setBorderPainted(false);
        jbInsertCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInsertCursoActionPerformed(evt);
            }
        });
        altaCursos.add(jbInsertCurso);
        jbInsertCurso.setBounds(420, 240, 150, 30);

        getContentPane().add(altaCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 400));

        altaClases.setBackground(new java.awt.Color(255, 255, 255));
        altaClases.setLayout(null);

        jLabel9.setBackground(new java.awt.Color(12, 112, 84));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(12, 112, 84));
        jLabel9.setText("Alta de Clases");
        altaClases.add(jLabel9);
        jLabel9.setBounds(430, 20, 140, 30);

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 222, 158));
        jLabel23.setText("Nombre");
        altaClases.add(jLabel23);
        jLabel23.setBounds(350, 130, 80, 20);

        jtfNombreClase.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombreClase.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombreClase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaClases.add(jtfNombreClase);
        jtfNombreClase.setBounds(430, 120, 170, 30);

        jbInsertClase.setBackground(new java.awt.Color(12, 112, 84));
        jbInsertClase.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbInsertClase.setForeground(new java.awt.Color(255, 255, 255));
        jbInsertClase.setText("Insertar");
        jbInsertClase.setBorder(null);
        jbInsertClase.setBorderPainted(false);
        jbInsertClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInsertClaseActionPerformed(evt);
            }
        });
        altaClases.add(jbInsertClase);
        jbInsertClase.setBounds(420, 200, 150, 30);

        getContentPane().add(altaClases, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 400));

        altaAsignaturas.setBackground(new java.awt.Color(255, 255, 255));
        altaAsignaturas.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(12, 112, 84));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(12, 112, 84));
        jLabel10.setText("Alta de Asignaturas");
        altaAsignaturas.add(jLabel10);
        jLabel10.setBounds(420, 20, 180, 24);

        jtfNombreAsignatura.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombreAsignatura.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombreAsignatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 112, 84), 2));
        altaAsignaturas.add(jtfNombreAsignatura);
        jtfNombreAsignatura.setBounds(430, 120, 170, 30);

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 222, 158));
        jLabel24.setText("Nombre");
        altaAsignaturas.add(jLabel24);
        jLabel24.setBounds(350, 130, 80, 20);

        jbInsertAsignatura.setBackground(new java.awt.Color(12, 112, 84));
        jbInsertAsignatura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbInsertAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        jbInsertAsignatura.setText("Insertar");
        jbInsertAsignatura.setBorder(null);
        jbInsertAsignatura.setBorderPainted(false);
        jbInsertAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInsertAsignaturaActionPerformed(evt);
            }
        });
        altaAsignaturas.add(jbInsertAsignatura);
        jbInsertAsignatura.setBounds(420, 200, 150, 30);

        getContentPane().add(altaAsignaturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAltaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaCursoActionPerformed
        selectButon(jbAltaCurso);
        noSelectButon(jbAltaAlumnos, jbAltaClasses, jbAltaProfesor, jbAltaAsignaturas);
        altaProfesor.setVisible(false);
        altaAlumno.setVisible(false);
        altaClases.setVisible(false);
        altaAsignaturas.setVisible(false);
        altaCursos.setVisible(true);
    }//GEN-LAST:event_jbAltaCursoActionPerformed

    private void jbAltaProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaProfesorActionPerformed
        selectButon(jbAltaProfesor);
        noSelectButon(jbAltaAlumnos, jbAltaClasses, jbAltaCurso, jbAltaAsignaturas);
        altaProfesor.setVisible(true);
        altaAlumno.setVisible(false);
        altaClases.setVisible(false);
        altaAsignaturas.setVisible(false);
        altaCursos.setVisible(false);
    }//GEN-LAST:event_jbAltaProfesorActionPerformed

    private void jbAltaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaAlumnosActionPerformed
        selectButon(jbAltaAlumnos);
        noSelectButon(jbAltaCurso, jbAltaClasses, jbAltaProfesor, jbAltaAsignaturas);
        altaProfesor.setVisible(false);
        altaAlumno.setVisible(true);
        altaClases.setVisible(false);
        altaAsignaturas.setVisible(false);
        altaCursos.setVisible(false);
    }//GEN-LAST:event_jbAltaAlumnosActionPerformed

    private void jbAltaClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaClassesActionPerformed
        selectButon(jbAltaClasses);
        noSelectButon(jbAltaAlumnos, jbAltaCurso, jbAltaProfesor, jbAltaAsignaturas);
        altaProfesor.setVisible(false);
        altaAlumno.setVisible(false);
        altaClases.setVisible(true);
        altaAsignaturas.setVisible(false);
        altaCursos.setVisible(false);
    }//GEN-LAST:event_jbAltaClassesActionPerformed

    private void jlCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlCloseMouseClicked

    private void jbInsertAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertAlumnoActionPerformed
        try {
            pepitaDAO.conectToBBDD();
            String nameAlumno = jtfNameAlumno.getText();
            String lastnameAlumno = jtfApellidosAlumno.getText();
            String usernameAlumno = jtfUsernameAlumno.getText();
            String passwordAlumno = jtfPasswordAlumno.getText();
            String dniAlumno = jtfDniAlumno.getText();
            String emailAlumno = jtfEmailAlumno.getText();

            try {
                System.out.println(nameAlumno);
                pepitaDAO.insertUser(nameAlumno, lastnameAlumno, usernameAlumno, passwordAlumno, dniAlumno, emailAlumno, 2);
                pepitaDAO.closeConection();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jbInsertAlumnoActionPerformed

    private void jbAltaAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaAsignaturasActionPerformed
        selectButon(jbAltaAsignaturas);
        noSelectButon(jbAltaAlumnos, jbAltaClasses, jbAltaProfesor, jbAltaCurso);
        altaProfesor.setVisible(false);
        altaAlumno.setVisible(false);
        altaClases.setVisible(false);
        altaAsignaturas.setVisible(true);
        altaCursos.setVisible(false);
    }//GEN-LAST:event_jbAltaAsignaturasActionPerformed

    private void jbInsertCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertCursoActionPerformed
        try {
            pepitaDAO.conectToBBDD();
            String nameCurso = jtfNombreCurso.getText();
            String ano = jtfAnoCurso.getText();
            try {
                System.out.println(nameCurso);
                pepitaDAO.insertCurso(nameCurso, ano);
                pepitaDAO.closeConection();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_jbInsertCursoActionPerformed

    private void jbInsertClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertClaseActionPerformed
        try {
            pepitaDAO.conectToBBDD();
            String nameClase = jtfNombreClase.getText();
            try {
                System.out.println(nameClase);
                pepitaDAO.insertClase(nameClase);
                pepitaDAO.closeConection();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jbInsertClaseActionPerformed

    private void jbInsertAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertAsignaturaActionPerformed
        try {
            pepitaDAO.conectToBBDD();
            String nameAsignatura = jtfNombreAsignatura.getText();
            try {
                System.out.println(nameAsignatura);
                pepitaDAO.insertAsignatura(nameAsignatura);
                pepitaDAO.closeConection();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jbInsertAsignaturaActionPerformed

    private void jbInsertProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertProfesorActionPerformed
        try {
            pepitaDAO.conectToBBDD();
            String nameProfe = jtfNameAlumno.getText();
            String lastnameProfe = jtfApellidosAlumno.getText();
            String usernameProfe = jtfUsernameAlumno.getText();
            String passwordProfe = jtfPasswordAlumno.getText();
            String dniProfe = jtfDniAlumno.getText();
            String emailProfe = jtfEmailAlumno.getText();

            try {
                System.out.println(nameProfe);
                pepitaDAO.insertUser(nameProfe, lastnameProfe, usernameProfe, passwordProfe, dniProfe, emailProfe, 2);
                pepitaDAO.closeConection();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jbInsertProfesorActionPerformed

    private void jbInsertVariosProfesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbInsertVariosProfesorMouseClicked
//        ChooseFile c = new ChooseFile(this, rootPaneCheckingEnabled);
//        c.setLocationRelativeTo(null);
//        c.setVisible(true);

        JFileChooser c = new JFileChooser();
        c.showOpenDialog(null);
        File f = c.getSelectedFile();
       // System.out.println(f.getAbsolutePath());
    }//GEN-LAST:event_jbInsertVariosProfesorMouseClicked

    private void jblInsertVariosAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblInsertVariosAlumnosMouseClicked
        ChooseFile c = new ChooseFile(this, rootPaneCheckingEnabled);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_jblInsertVariosAlumnosMouseClicked

    public static void selectButon(JButton jbuton) {
        jbuton.setBackground(new Color(12, 112, 84));
        jbuton.setForeground(Color.WHITE);
    }

    public static void noSelectButon(JButton jbuton, JButton jbuton2, JButton jbuton3, JButton jbuton4) {
        jbuton.setBackground(new Color(155, 236, 164));
        jbuton2.setBackground(new Color(155, 236, 164));
        jbuton3.setBackground(new Color(155, 236, 164));
        jbuton4.setBackground(new Color(155, 236, 164));

        jbuton.setForeground(new Color(102, 102, 102));
        jbuton2.setForeground(new Color(102, 102, 102));
        jbuton3.setForeground(new Color(102, 102, 102));
        jbuton4.setForeground(new Color(102, 102, 102));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomeAdmin().setVisible(true);
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel altaAlumno;
    private javax.swing.JPanel altaAsignaturas;
    private javax.swing.JPanel altaClases;
    private javax.swing.JPanel altaCursos;
    private javax.swing.JPanel altaProfesor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbAltaAlumnos;
    private javax.swing.JButton jbAltaAsignaturas;
    private javax.swing.JButton jbAltaClasses;
    private javax.swing.JButton jbAltaCurso;
    private javax.swing.JButton jbAltaProfesor;
    private javax.swing.JButton jbInsertAlumno;
    private javax.swing.JButton jbInsertAsignatura;
    private javax.swing.JButton jbInsertClase;
    private javax.swing.JButton jbInsertCurso;
    private javax.swing.JButton jbInsertProfesor;
    private javax.swing.JButton jbInsertVariosProfesor;
    private javax.swing.JButton jblInsertVariosAlumnos;
    private javax.swing.JLabel jlClose;
    private javax.swing.JLabel jlPerfil;
    private javax.swing.JTextField jtfAnoCurso;
    private javax.swing.JTextField jtfApellidos;
    private javax.swing.JTextField jtfApellidosAlumno;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfDniAlumno;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEmailAlumno;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfNameAlumno;
    private javax.swing.JTextField jtfNombreAsignatura;
    private javax.swing.JTextField jtfNombreClase;
    private javax.swing.JTextField jtfNombreCurso;
    private javax.swing.JTextField jtfPassword;
    private javax.swing.JTextField jtfPasswordAlumno;
    private javax.swing.JTextField jtfUsername;
    private javax.swing.JTextField jtfUsernameAlumno;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
