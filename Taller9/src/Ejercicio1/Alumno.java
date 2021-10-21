package Ejercicio1;


public class Alumno {
    
    private String nombre;
    private String apellido;
    private String padron;
    private String sexo;
    private String condicion;
    private double notafinal;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String padron, String sexo, String condicion, double notafinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.padron = padron;
        this.sexo = sexo;
        this.condicion = condicion;
        this.notafinal = notafinal;
    }

    public String getNombre() { return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() {return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getPadron() {return padron;}
    public void setPadron(String padron) {this.padron = padron;}
    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    public String getCondicion() {return condicion;}
    public void setCondicion(String condicion) {this.condicion = condicion;}
    public double getNotafinal() {return notafinal;}
    public void setNotafinal(double notafinal) {this.notafinal = notafinal;}
    
    
    
    
    
    
    
}
