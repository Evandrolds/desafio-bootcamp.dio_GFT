package br.com.dio.desafio_poo_gftstart.application;

import br.com.dio.desafio_poo_gftstart.entities.BootCamp;
import br.com.dio.desafio_poo_gftstart.entities.Course;
import br.com.dio.desafio_poo_gftstart.entities.Developer;
import br.com.dio.desafio_poo_gftstart.entities.Mentorship;
import java.time.LocalDate;

/**
 *
 * @author Evandro
 */
public class Program {

    public static void main(String[] args) {

        // Criando um Courso1 (Course)
        Course course1 = new Course(6);
        course1.setTitle("Java");
        course1.setDescription(" Aprendendo Java do Basico ao avancado ");

        // Criando um Courso2 (Course)
        Course course2 = new Course(3);
        course2.setTitle("Collections");
        course2.setDescription(" Avançado ");

        // Criando um Mentoria (Mentorship)
        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Camila");
        mentorship.setDescription("Ensinando tudo sobre java");
        mentorship.setData(LocalDate.now());

        // Exibindo os cursos (Course)
        System.out.println(course1);
        System.out.println("==============");
        System.out.println(course2);
        System.out.println("==============================================\n");

        // Criando um BootCamp (BootCamp) 
        BootCamp bootcamp = new BootCamp();
        bootcamp.setName("GFT-Starter");
        bootcamp.setDescription(" Abstraindo um BootCamp ");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        // Criando o Desenvolvedor 1 (Developer)
        System.out.println("--------------------- Sandro ---------------------");
        Developer dev1 = new Developer();
        dev1.setName("Sandro");
        // se escrevendo no bootCamp
        dev1.registerBootCamp(bootcamp);

        System.out.println(" Conteúdos incritos  " + dev1.getSubscribedContent());
        dev1.toProgress();
        dev1.toProgress();

        System.out.println(" Estudando: " + dev1.getSubscribedContent());
        System.out.println(" Conteúdos completado " + dev1.getCompletedContent());
        System.out.println(" Total XP: " + dev1.totalCalculateXP());
        System.out.println("\n");

        // Criando o Desenvolvedor 2 (Developer)
        System.out.println("--------------------- Pedro ---------------------");
        Developer dev2 = new Developer();
        dev2.setName("Pedro");
        // se escrevendo no bootCamp
        dev2.registerBootCamp(bootcamp);

        System.out.println(" Conteúdos  inscritos: " + dev2.getSubscribedContent());
        dev2.toProgress();
        dev2.toProgress();
        dev2.toProgress();

        System.out.println(" Estudando: " + dev2.getSubscribedContent());
        System.out.println(" Conteúdos completado : " + dev2.getCompletedContent());
        System.out.println(" Total XP: " + dev2.totalCalculateXP());

        System.out.println("\n");

        System.out.println("------------------------- BOOTCAMP GFT -----------------------");
        System.out.println(" Informações do bootcamp: " + bootcamp);
        System.out.println(" ===============================================\n");
    }
}
