package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.RawMaterials;
import productionplanning.production_planning.Repositories.RawMaterialsRepository;

@RestController
@RequestMapping(value = "/RawMaterials")
public class RawMaterialsController {

    @Autowired
    private RawMaterialsRepository rawMaterialsRepository;

    @GetMapping(path = "/rawmaterials")
    public @ResponseBody Iterable<RawMaterials> getAllRawMaterials(){
        System.out.println("get raw materials");
        return rawMaterialsRepository.findAll();
    }

    @GetMapping(path = "/{rm_id}")
    public RawMaterials getRawMaterials(@PathVariable String rm_id){

        return rawMaterialsRepository.findById(rm_id).get();
    }

    @PostMapping(path = "/new_order")
    public RawMaterials newRawMaterials(@RequestBody RawMaterials rawMaterials){


        return rawMaterialsRepository.save(rawMaterials);
    }

    @PutMapping
    public void updateRawMaterials(@RequestBody RawMaterials rawMaterials){

        rawMaterialsRepository.save(rawMaterials);

    }

    @DeleteMapping(path = "/{rm_id}")
    public void deleteRawMaterials(@PathVariable String rm_id) {

        rawMaterialsRepository.deleteById(rm_id);
    }
}
