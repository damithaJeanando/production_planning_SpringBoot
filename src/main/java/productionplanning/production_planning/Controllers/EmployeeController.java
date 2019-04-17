package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.Employee;
import productionplanning.production_planning.Repositories.EmployeeRepository;

@RestController
@RequestMapping(value = "/Employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping(path = "/allemployees")
    public @ResponseBody Iterable<Employee> getAllEmployee(){
        System.out.println("Get all employees");
        return employeeRepository.findAll();
    }

    @GetMapping(path = "/{emp_id}")
    public Employee getEmployee(@PathVariable String emp_id){

        return employeeRepository.findById(emp_id).get();
    }

    @PostMapping(path = "/new_employee")
    public Employee newEmployee(@RequestBody Employee employee){


        return  employeeRepository.save(employee);
    }

    @PutMapping
    public void updateEmployee(@RequestBody Employee employee){

        employeeRepository.save(employee);

    }

    @DeleteMapping(path = "/{emp_id}")
    public void deleteEmployee(@PathVariable String emp_id) {

        employeeRepository.deleteById(emp_id);
    }
}
