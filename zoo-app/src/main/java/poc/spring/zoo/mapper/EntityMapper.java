package poc.spring.zoo.mapper;

import org.apache.ibatis.annotations.*;
import poc.spring.zoo.entity.Animal;

/**
 * Created by lazar on 20/06/2017.
 */
public interface EntityMapper {

    @Insert("INSERT INTO Animal " +
            "(name, species, globe_area, sqm_needed) " +
            "VALUES " +
            "(anml.name, anml.species, anml.globeArea, anml.sqmNeeded) " +
            "ON CONFLICT ON CONSTRAINT entity_pkey DO UPDATE SET " +
            "name=anml.name, species=anml.species, globe_area=anml.globeArea, sqm_needed=anml.sqmNeeded")
    @Options(useGeneratedKeys = true, keyProperty = "anml.id")
    void saveOrUpdateAnimal(@Param("anml") Animal toSave);


    @Select("SELECT * FROM Animal WHERE id=#{animalId}")
    @ResultType(Animal.class)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "species", column = "species"),
            @Result(property = "globeArea", column = "globe_area"),
            @Result(property = "sqmNeeded", column = "sqm_needed")
    })
    Animal findAnimalById(@Param("animalId") long id);
}
