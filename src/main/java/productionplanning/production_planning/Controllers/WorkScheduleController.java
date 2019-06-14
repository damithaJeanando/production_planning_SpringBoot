package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.WorkSchedule;
import productionplanning.production_planning.Repositories.CapacityPlanRepository;
import productionplanning.production_planning.Repositories.WorkScheduleRepository;

@RestController
@RequestMapping(value = "/WorkSchedule")
public class WorkScheduleController {

    @Autowired
    private WorkScheduleRepository workScheduleRepository;

    @Autowired
    private CapacityPlanRepository capacityPlanRepository;

    @GetMapping(path = "/allworkschedules")
    public @ResponseBody Iterable<WorkSchedule> getAllWorkSchedules() {
        System.out.println("Get all work schedules");
        return workScheduleRepository.findAll();
    }

    @GetMapping(path = "/{ws_id}")
    public WorkSchedule getWorkSchedule(@PathVariable String ws_id){

        return workScheduleRepository.findById(ws_id).get();
    }

    @GetMapping(path = "view-capacity-plan/{planId}")
    public Iterable<WorkSchedule> findByPlanId(@PathVariable String planId){

        Iterable<WorkSchedule> workSchedule = workScheduleRepository.findAllByPlanId(capacityPlanRepository.
                findById(planId).get());
        System.out.println("workshedule hit");
        return workSchedule;
    }

    @PostMapping(path = "/new_ws")
    public WorkSchedule newWorkSchedule(@RequestBody WorkSchedule workSchedule){


        return  workScheduleRepository.save(workSchedule);
    }

    @PutMapping
    public void updateWorkSchedule(@RequestBody WorkSchedule workSchedule){

        workScheduleRepository.save(workSchedule);

    }

    @DeleteMapping(path = "/{ws_id}")
    public void deleteWorkSchedule(@PathVariable String ws_id) {

        workScheduleRepository.deleteById(ws_id);
    }
}
