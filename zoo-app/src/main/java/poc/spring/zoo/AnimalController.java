package poc.spring.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import poc.spring.zoo.entity.Animal;
import poc.spring.zoo.service.AnimalService;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @RequestMapping(value = "/api/animal", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Animal findAnimal(@RequestParam(value = "animalId") long id) {
        return this.animalService.findAnimal(id);
    }

    @RequestMapping(value = "/api/animal", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveOrUpdateAnimal(@RequestBody Animal animalToSave) {
        this.animalService.saveOrUpdateAnimal(animalToSave);
    }
}
