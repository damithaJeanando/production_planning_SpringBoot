package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.BIStatus;
import productionplanning.production_planning.Repositories.BIStatusRepository;

@RestController
@RequestMapping(value = "/BillItemStatus")
public class BIStatusController {

    @Autowired
    private BIStatusRepository biStatusRepository;

    @GetMapping(path = "/all_bi_status")
    public @ResponseBody Iterable<BIStatus> getAllBiStatus(){
        System.out.println("get all bi status");
        return biStatusRepository.findAll();
    }

    @GetMapping(path = "/{bi_status_id}")
    public BIStatus getBiStatus(@PathVariable String bi_status_id){

        return biStatusRepository.findById(bi_status_id).get();
    }

    @PostMapping(path = "/new_bi_status")
    public BIStatus newBillItem(@RequestBody BIStatus biStatus){


        return  biStatusRepository.save(biStatus);
    }

    @PutMapping
    public void updateBillItem(@RequestBody BIStatus biStatus){

        biStatusRepository.save(biStatus);

    }

    @DeleteMapping(path = "/{bi_status_id}")
    public void deleteBillItem(@PathVariable String bi_status_id) {

        biStatusRepository.deleteById(bi_status_id);
    }
}
