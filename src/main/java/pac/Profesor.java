package pac;

import java.io.Serializable;
/*
 * Clase Profesor, donde indicaremos todo lo necesario para poder implementar
 * lo relacionado a los Profesores del curso.
 */

public class Profesor implements Serializable {
    private Long id;
    private String nombre;
    private String sexo;

    //Constructor vacio
    public Profesor(){

    }
    //Constructor con todos los parametros
    public Profesor(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    //Metodo toString para poder indicar todos los parametros
    @Override
    public String toString() {
        return "Insert into Profesor{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    //Metodos getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
