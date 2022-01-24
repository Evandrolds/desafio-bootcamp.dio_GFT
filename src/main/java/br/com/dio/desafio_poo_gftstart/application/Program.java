package br.com.dio.desafio_poo_gftstart.application;

import br.com.dio.desafio_poo_gftstart.entities.Course;
import br.com.dio.desafio_poo_gftstart.entities.Mentorship;
import java.time.LocalDate;

/**
 *
 * @author Evandro
 */
public class Program {
    public static void main(String[] args) {
       
        // Criando um Coursos (Course)
        Course course1 = new Course("Java"," Do basico ao avançado ",60);
        Course course2 = new Course("Java"," Do basico ao avançado ",60);
        
        System.out.println(course1);
        System.out.println("==============");
        System.out.println(course2);
        
        // Criando um Mentoria (Mentorship)
        Mentorship m = new Mentorship();
        m.setTitle("Sandro");
        m.setDescription("Ensinando tudo sobre java");
        m.setData(LocalDate.now());
    }
}
