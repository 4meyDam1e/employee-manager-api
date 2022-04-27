package tech.ameydamle.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ameydamle.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
