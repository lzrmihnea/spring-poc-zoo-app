package poc.spring.zoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import poc.spring.zoo.entity.Animal;
import poc.spring.zoo.mapper.EntityMapper;

@Service
public class AnimalService {

    @Autowired
    private EntityMapper entityMapper;

    @Transactional
    public void saveOrUpdateAnimal(Animal animalToSave) {
        this.entityMapper.saveOrUpdateAnimal(animalToSave);
    }

    public Animal findAnimal(long animalId) {
        return this.entityMapper.findAnimalById(animalId);
    }
}
