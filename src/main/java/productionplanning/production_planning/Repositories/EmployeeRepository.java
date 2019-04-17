package productionplanning.production_planning.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import productionplanning.production_planning.Models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
}
