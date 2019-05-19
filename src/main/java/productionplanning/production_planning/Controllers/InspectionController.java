package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.Inspection;
import productionplanning.production_planning.Repositories.InspectionRepository;

@RestController
@RequestMapping(value = "/Inspection")
public class InspectionController {

    @Autowired
    private InspectionRepository inspectionRepository;

    @GetMapping(path = "/inspection")
    public @ResponseBody Iterable<Inspection> getInspections(){
        System.out.println("get Inspections");
        return inspectionRepository.findAll();
    }

    @GetMapping(path = "/{inspection_id}")
    public Inspection getInspection(@PathVariable String inspection_id){

        return inspectionRepository.findById(inspection_id).get();
    }

    @PostMapping(path = "/new_inspection")
    public Inspection newInspection(@RequestBody Inspection inspection){


        return  inspectionRepository.save(inspection);
    }

    @PutMapping
    public void updateInspection(@RequestBody Inspection inspection){

        inspectionRepository.save(inspection);

    }

    @DeleteMapping(path = "/{inspection_id}")
    public void deleteInspection(@PathVariable String inspection_id) {

        inspectionRepository.deleteById(inspection_id);
    }
}
