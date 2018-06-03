package model;


public class Nota {

    private int id;
    private AsignaturaMatricula asignaturaMarticula;
    private String comentario;
    private String estado;
    private Usuario alumno;
    
    private float notas;

    public float getNotas() {
        return notas;
    }

    public void setNotas(float notas) {
        this.notas = notas;
    }

    
    public Usuario getAlumno() {
        return alumno;
    }

    public void setAlumno(Usuario alumno) {
        this.alumno = alumno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AsignaturaMatricula getAsignaturaMarticula() {
        return asignaturaMarticula;
    }

    public void setAsignaturaMarticula(AsignaturaMatricula asignaturaMarticula) {
        this.asignaturaMarticula = asignaturaMarticula;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
