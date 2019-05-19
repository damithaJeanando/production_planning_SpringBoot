package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.RNStatus;
import productionplanning.production_planning.Repositories.RNStatusRepository;

@RestController
@RequestMapping(value = "/RejectionNoticeStatus")
public class RNStatusController {

    @Autowired
    private RNStatusRepository rnStatusRepository;

    @GetMapping(path = "/allRNS")
    public @ResponseBody Iterable<RNStatus> getAllRNStatus(){
        System.out.println("get all rejection notice status");
        return rnStatusRepository.findAll();
    }

    @GetMapping(path = "/{rnStatus_id}")
    public RNStatus getRNStatus(@PathVariable String rnStatus_id){

        return rnStatusRepository.findById(rnStatus_id).get();
    }

    @PostMapping(path = "/new_rnStatus")
    public RNStatus newRejectionNotice(@RequestBody RNStatus rnStatus){


        return rnStatusRepository.save(rnStatus);
    }

    @PutMapping
    public void updateRejectionNotice(@RequestBody RNStatus rnStatus){

        rnStatusRepository.save(rnStatus);

    }

    @DeleteMapping(path = "/{rnStatus_id}")
    public void deleteRejectionNotice(@PathVariable String rnStatus_id) {

        rnStatusRepository.deleteById(rnStatus_id);
    }
}
