package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.InspectionStatus;
import productionplanning.production_planning.Repositories.InspectionStatusRepository;

@RestController
@RequestMapping(value = "/InspectionStatus")
public class InspectionStatusController {

    @Autowired
    private InspectionStatusRepository inspectionStatusRepository;

    @GetMapping(path = "/allinspectionStatus")
    public @ResponseBody Iterable<InspectionStatus> getAllInspectionsStatus(){
        System.out.println("get all inspection status");
        return inspectionStatusRepository.findAll();
    }

    @GetMapping(path = "/{is_id}")
    public InspectionStatus getInspectionStatus(@PathVariable String is_id){

        return inspectionStatusRepository.findById(is_id).get();
    }

    @PostMapping(path = "/new_inspection_status")
    public InspectionStatus newInspectionStatus(@RequestBody InspectionStatus inspectionStatus){


        return inspectionStatusRepository.save(inspectionStatus);
    }

    @PutMapping
    public void updateInspectionStatus(@RequestBody InspectionStatus inspectionStatus){

        inspectionStatusRepository.save(inspectionStatus);

    }

    @DeleteMapping(path = "/{is_id}")
    public void deleteInspectionStatus(@PathVariable String is_id) {

        inspectionStatusRepository.deleteById(is_id);
    }
}
