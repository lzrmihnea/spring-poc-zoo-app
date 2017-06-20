package poc.spring.zoo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import poc.spring.zoo.util.DietType;
import poc.spring.zoo.util.Frequency;
import poc.spring.zoo.util.Gender;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Animal extends Entity {
    private Gender gender;
    private DietType diet;

    private Frequency feedingFreqType;
    private int feedingFreq;
    private int feedingQuantity;
}
