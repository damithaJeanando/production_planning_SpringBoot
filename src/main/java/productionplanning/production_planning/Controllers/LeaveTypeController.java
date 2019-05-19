package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.LeaveType;
import productionplanning.production_planning.Repositories.LeaveTypeRepository;

@RestController
@RequestMapping(value = "/LeaveType")
public class LeaveTypeController {

    @Autowired
    private LeaveTypeRepository leaveTypeRepository;


    @GetMapping(path = "/allleavetypes")
    public @ResponseBody Iterable<LeaveType> getAllLeaveTypes(){
        System.out.println("Get all leave types");
        return leaveTypeRepository.findAll();
    }

    @GetMapping(path = "/{leaveType_id}")
    public LeaveType getLeaveType(@PathVariable String leaveType_id){

        return leaveTypeRepository.findById(leaveType_id).get();
    }

    @PostMapping(path = "/new_leaveType")
    public LeaveType newLeaveType(@RequestBody LeaveType leaveType){


        return  leaveTypeRepository.save(leaveType);
    }

    @PutMapping
    public void updateLeaveType(@RequestBody LeaveType leaveType){

        leaveTypeRepository.save(leaveType);

    }

    @DeleteMapping(path = "/{leaveType_id}")
    public void deleteLeaveType(@PathVariable String leaveType_id) {

        leaveTypeRepository.deleteById(leaveType_id);
    }
}
