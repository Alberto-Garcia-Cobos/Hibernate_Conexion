package pac;

import java.io.Serializable;
/*
* Clase Modulo, donde indicaremos todo lo necesario para poder implementar
* lo relacionado a los modulos del curso.
*/
public class Modulo implements Serializable {

    private Long id;
    private String nombre;
    private String codigo;

    //Constructor vacio
    public Modulo(){

    }

    //Constructor con todos los parametros
    public Modulo(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    //Metodo toString para poder indicar todos los parametros
    @Override
    public String toString() {
        return "Insert into modulo{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
