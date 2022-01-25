package br.com.dio.desafio_poo_gftstart.entities;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Evandro
 */
@Data
@EqualsAndHashCode
public class Developer {

    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public void registerBootCamp(BootCamp bootCamp) {
        this.subscribedContent.addAll(bootCamp.getContents());
        bootCamp.getRegistradeDevelopers().add(this);
    }

    public void toProgress() {
        Optional<Content> contents = subscribedContent.stream().findFirst();
        if (contents.isPresent()) {
            this.completedContent.add(contents.get());
            this.subscribedContent.remove(contents.get());
            if (subscribedContent.isEmpty()) {
                System.out.println("------------- Congratualtion -------------");
                System.out.println("------- You have of Bootcamp finished ");
            }
        } else {
            System.out.println(" You aren't registred to any Content ! ");
        }
    }

    public double totalCalculateXP() {
        return this.completedContent.stream().mapToDouble(content -> content.calculateXP()).sum();
    }
}
