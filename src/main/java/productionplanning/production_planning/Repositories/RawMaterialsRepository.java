package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.RawMaterials;

public interface RawMaterialsRepository extends CrudRepository<RawMaterials, String> {
}
