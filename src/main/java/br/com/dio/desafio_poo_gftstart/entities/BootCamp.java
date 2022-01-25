package br.com.dio.desafio_poo_gftstart.entities;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author Evandro
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BootCamp {

    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);

    private Set<Developer> registradeDevelopers = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

}
