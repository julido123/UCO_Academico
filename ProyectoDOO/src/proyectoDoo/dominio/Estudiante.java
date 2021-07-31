package proyectoDoo.dominio;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String programa;
    private int identificacion;

    public Estudiante(String nombre, String apellido, String programa, int identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.programa = programa;
        this.identificacion = identificacion;
    }
}
