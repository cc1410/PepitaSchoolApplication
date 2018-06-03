package model;

public class ClaseEvento {

    private Asignatura asignatura;
    private Usuario profesor;
    private String diaSemana;
    private Integer horaInicial;
    private Clase clase;

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Usuario getProfesor() {
        return profesor;
    }

    public void setProfesor(Usuario profesor) {
        this.profesor = profesor;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Integer getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Integer horaInicial) {
        this.horaInicial = horaInicial;
    }

}
