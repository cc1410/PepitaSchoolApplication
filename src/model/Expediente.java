package model;

import java.util.List;

public class Expediente {

    private Usuario alumno;
    private List<Trimestre> trimestre;
    private String estado;

    public Expediente() {
    }

    public Expediente(Usuario alumno) {
        this.alumno = alumno;
    }

    public Usuario getAlumno() {
        return alumno;
    }

    public void setAlumno(Usuario alumno) {
        this.alumno = alumno;
    }

    public List<Trimestre> getNotas() {
        return trimestre;
    }

    public void setNotas(List<Trimestre> trimestre) {
        this.trimestre = trimestre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
