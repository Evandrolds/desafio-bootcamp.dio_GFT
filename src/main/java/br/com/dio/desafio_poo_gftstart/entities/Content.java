
package br.com.dio.desafio_poo_gftstart.entities;

import lombok.Data;

/**
 *
 * @author Evandro
 */
@Data
public abstract class Content {
    protected static final double XP_STANDARD = 10d;
    private String title;
    private String description;
    
    public abstract double calculateXP();
        
    
    
}
