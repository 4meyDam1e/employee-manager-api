package tech.ameydamle.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ameydamle.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    //Spring understands what this method wants to do by its name,
    //and generates appropriate SQL query.
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
