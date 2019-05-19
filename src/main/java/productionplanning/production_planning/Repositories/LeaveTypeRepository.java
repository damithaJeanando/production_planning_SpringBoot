package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.LeaveType;

public interface LeaveTypeRepository extends CrudRepository<LeaveType, String> {
}
