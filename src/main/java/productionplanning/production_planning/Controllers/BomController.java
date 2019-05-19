package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.BOM;
import productionplanning.production_planning.Repositories.BomRepository;

@RestController
@RequestMapping(value = "/BOM")
public class BomController {

    @Autowired
    private BomRepository bomRepository;

    @GetMapping(path = "/bom")
    public @ResponseBody Iterable<BOM> getBOMs(){
        System.out.println("get Bills of Materials");
        return bomRepository.findAll();
    }

    @GetMapping(path = "/{bom_id}")
    public BOM getBOM(@PathVariable String bom_id){

        return bomRepository.findById(bom_id).get();
    }

    @PostMapping(path = "/new_bom")
    public BOM newBOM(@RequestBody BOM bom){


        return  bomRepository.save(bom);
    }

    @PutMapping
    public void updateBOM(@RequestBody BOM bom){

        bomRepository.save(bom);

    }

    @DeleteMapping(path = "/{bom_id}")
    public void deleteBOM(@PathVariable String bom_id) {

        bomRepository.deleteById(bom_id);
    }
}
