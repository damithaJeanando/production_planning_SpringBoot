package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.BOM;

public interface BomRepository extends CrudRepository<BOM, String> {
}
