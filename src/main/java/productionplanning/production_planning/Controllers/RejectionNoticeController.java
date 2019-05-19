package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.RejectionNotice;
import productionplanning.production_planning.Repositories.RejectionNoticeRepository;

@RestController
@RequestMapping(value = "/RejectionNotice")
public class RejectionNoticeController {

    @Autowired
    private RejectionNoticeRepository rejectionNoticeRepository;

    @GetMapping(path = "/rejectionNotices")
    public @ResponseBody Iterable<RejectionNotice> getRejectionNotices(){
        System.out.println("get rejectionNotices");
        return rejectionNoticeRepository.findAll();
    }

    @GetMapping(path = "/{rn_id}")
    public RejectionNotice getProduct(@PathVariable String rn_id){

        return rejectionNoticeRepository.findById(rn_id).get();
    }

    @PostMapping(path = "/new_rn")
    public RejectionNotice newRejectionNotice(@RequestBody RejectionNotice rejectionNotice){


        return rejectionNoticeRepository.save(rejectionNotice);
    }

    @PutMapping
    public void updateRejectionNotice(@RequestBody RejectionNotice rejectionNotice){

        rejectionNoticeRepository.save(rejectionNotice);

    }

    @DeleteMapping(path = "/{rn_id}")
    public void deleteRejectionNotice(@PathVariable String rn_id) {

        rejectionNoticeRepository.deleteById(rn_id);
    }
}
