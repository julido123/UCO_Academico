package proyectoDoo.dominio;

public class Materia {
    private int codigo;
    private String nombre;
    private int hora;
    private String dia;
    private int creditos;

    public Materia(int codigo, String nombre, int hora, int creditos,String dia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.hora = hora;
        this.creditos = creditos;
        this.dia=dia;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }


    public int getHora() {
        return hora;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getDia() {
        return dia;
    }
}
