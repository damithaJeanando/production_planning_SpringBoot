package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.CapacityPlan;
import productionplanning.production_planning.Repositories.CapacityPlanRepository;

@RestController
@RequestMapping(value = "/CapacityPlan")
public class CapacityPlanController {

    @Autowired
    private CapacityPlanRepository capacityPlanRepository;

    @GetMapping(path = "/capacity_plans")
    public @ResponseBody Iterable<CapacityPlan> getCapacityPlans(){
        System.out.println("Get Capacity Plans");
        return capacityPlanRepository.findAll();
    }

    @GetMapping(path = "/{capacity_plan_id}")
    public CapacityPlan getCapacityPlan(@PathVariable String capacity_plan_id){

        return capacityPlanRepository.findById(capacity_plan_id).get();
    }


    @PostMapping(path = "/new_capacity_plan")
    public CapacityPlan newCapacityPlan(@RequestBody CapacityPlan capacityPlan){


        return  capacityPlanRepository.save(capacityPlan);
    }

    @PutMapping
    public void updateCapacityPlan(@RequestBody CapacityPlan capacityPlan){

        capacityPlanRepository.save(capacityPlan);

    }

    @DeleteMapping(path = "/{capacity_plan_id}")
    public void deleteCapacityPlan(@PathVariable String capacity_plan_id) {

        capacityPlanRepository.deleteById(capacity_plan_id);
    }


}
