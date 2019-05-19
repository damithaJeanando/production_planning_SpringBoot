package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.RejectionNotice;

public interface RejectionNoticeRepository extends CrudRepository<RejectionNotice, String> {
}
