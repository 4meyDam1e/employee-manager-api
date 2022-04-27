package tech.ameydamle.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.ameydamle.employeemanager.exception.EmployeeNotFoundException;
import tech.ameydamle.employeemanager.model.Employee;
import tech.ameydamle.employeemanager.repo.EmployeeRepo;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployee(Long id) {
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("No employee with id: " + id));
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }
}
