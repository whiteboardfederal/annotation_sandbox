package demoApp.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demoApp.domain.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}