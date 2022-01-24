package br.com.dio.desafio_poo_gftstart.entities;

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
@ToString(callSuper = true, includeFieldNames = true)

public class Course extends Content {

    private String title;
    private String description;
    private Integer workLoad;

    @Override
    public double calculateXP() {
        return XP_STANDARD * workLoad;
    }

}
