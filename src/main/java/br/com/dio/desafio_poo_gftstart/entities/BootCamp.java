package br.com.dio.desafio_poo_gftstart.entities;

import java.time.Instant;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Evandro
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BootCamp {

    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);

}
