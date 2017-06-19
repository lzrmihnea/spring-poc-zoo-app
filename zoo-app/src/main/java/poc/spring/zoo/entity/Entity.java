package poc.spring.zoo.entity;

import lombok.Data;
import poc.spring.zoo.util.Frequency;

@Data
public abstract class Entity {
    private long id;

    private String name;
    private String species;
    private String globeArea;
    private int sqmNeeded;

    private Frequency waterFreqType;
    private int waterFreq;
    private int waterQuantity;
}
