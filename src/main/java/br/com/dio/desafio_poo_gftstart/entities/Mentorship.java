package br.com.dio.desafio_poo_gftstart.entities;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Evandro
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true,includeFieldNames = true)
public class Mentorship extends Content{
    private LocalDate data;

    @Override
    public double calculateXP() {
        return XP_STANDARD + 20d;
    }
   
}
