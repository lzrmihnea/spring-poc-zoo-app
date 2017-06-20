package poc.spring.zoo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import poc.spring.zoo.util.Frequency;

@Data
@EqualsAndHashCode
@ToString
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
