package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import productionplanning.production_planning.Models.CapacityPlan;
import productionplanning.production_planning.Models.WorkSchedule;

@Repository
public interface WorkScheduleRepository extends CrudRepository<WorkSchedule, String> {
    Iterable<WorkSchedule> findAllByPlanId(CapacityPlan capacityPlan);
}
