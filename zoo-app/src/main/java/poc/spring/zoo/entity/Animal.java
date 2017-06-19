package poc.spring.zoo.entity;

import lombok.Data;
import poc.spring.zoo.util.DietType;
import poc.spring.zoo.util.Frequency;
import poc.spring.zoo.util.Gender;

@Data
public class Animal extends Entity {
    private Gender gender;
    private DietType diet;

    private Frequency feedingFreqType;
    private int feedingFreq;
    private int feedingQuantity;
}
