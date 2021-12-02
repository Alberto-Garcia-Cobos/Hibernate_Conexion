package pac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import java.util.HashSet;
/*
 * Clase Main, donde le daremos funcionalidad al proyecto, añadiendo y introduciendo
 * todos los datos sobre el curso.
 */
public class Main {


    public static void main(String[] args) {

        System.out.println("<---INICIAMOS EL PROGRAMA--->");

        //Realizamos la configuración de Hibernate
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        System.out.println("Configuracion realizada correctamente");

        //Creamos los modulos
        Modulo modulo1 = new Modulo("Programacion B", "M03B");
        Modulo modulo2 = new Modulo("Acceso a datos", "M06");
        Modulo modulo3 = new Modulo("Desarrollo de aplicaciones moviles", "M08");
        Modulo modulo4 = new Modulo("Servicios y procesos", "M09");

        //Insertamos los modulos
        insetarModulos(modulo1,session);
        insetarModulos(modulo2,session);
        insetarModulos(modulo3,session);
        insetarModulos(modulo4,session);

        //Creamos los set para los modulos
        HashSet<Modulo> set1 = new HashSet<Modulo>();
        set1.add(modulo1);
        set1.add(modulo2);
        set1.add(modulo4);
        set1.add(modulo3);
        HashSet<Modulo> set2 = new HashSet<Modulo>();
        set2.add(modulo1);
        set2.add(modulo2);
        set2.add(modulo4);
        HashSet<Modulo> set3 = new HashSet<Modulo>();
        set3.add(modulo3);
        set3.add(modulo4);
        HashSet<Modulo> set4 = new HashSet<Modulo>();
        set4.add(modulo2);
        set4.add(modulo3);
        set4.add(modulo4);

        System.out.println("Modulos insertados correctamente");

        //Creamos el profesor
        Profesor profesor = new Profesor("Alvaro", "Hombre");

        //Insertamos los profesores
        insetarProfesores(profesor,session);
        System.out.println("Profesores insertados correctamente");

        //Creamos los alumnos
        Alumno alumno1 = new Alumno("Juan", "Espaniola", 26, "Hombre", set1);
        Alumno alumno2 = new Alumno("Pedro", "Andorrana", 21, "Hombre", set2);
        Alumno alumno3 = new Alumno("Marta", "Espanionla", 19,"Mujer", set3);
        Alumno alumno4 = new Alumno("Carla", "Francesa", 35, "Mujer", set4);

        //Insertarmos los alumnos
        insertarAlumnos(alumno1,session);
        insertarAlumnos(alumno2,session);
        insertarAlumnos(alumno3,session);
        insertarAlumnos(alumno4,session);
        System.out.println("Alumnos insertados correctamente");

        //Cerramos la session y hacemos commit para guardarlo.
        tx.commit();
        session.close();
        sessionFactory.close();
        System.out.println("<---CERRAMOS EL PROGRAMA--->");

    }

    //Creamos la funcion para insertar los alumnos.
    static void insertarAlumnos(Alumno a, Session session){
        session.save(a);
        System.out.println(a);
    }
    //Creamos la funcion para insertar los Modulos.
    static void insetarModulos(Modulo m, Session session){
        session.save(m);
        System.out.println(m);
    }
    //Creamos la funcion para insertar los Profesores.
    static void insetarProfesores(Profesor p, Session session){
        session.save(p);
        System.out.println(p);
    }

}
