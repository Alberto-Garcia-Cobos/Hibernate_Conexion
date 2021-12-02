package pac;

import java.io.Serializable;
import java.util.Set;

/*
 * Clase Alumno, donde indicaremos todo lo necesario para poder implementar
 * lo relacionado a los Alumnos del curso.
 */
public class Alumno implements Serializable {
    private Long id;
    private String nombre;
    private String nacionalidad;
    private int edad;
    private String sexo;
    private Set<Modulo> modulos;

    //Constructor vacio
    public Alumno() {

    }

    //Constructor con todos los parametros
    public Alumno(String nombre, String nacionalidad, int edad, String sexo, Set<Modulo> modulos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.sexo = sexo;
        this.modulos = modulos;
    }

    //Metodo toString para poder indicar todos los parametros
    @Override
    public String toString() {
        return "Insert into Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", modulos=" + modulos.size() +
                '}';
    }

    //Metodos getter and setter
    public Set<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(Set<Modulo> modulos) {
        this.modulos = modulos;
    }

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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
