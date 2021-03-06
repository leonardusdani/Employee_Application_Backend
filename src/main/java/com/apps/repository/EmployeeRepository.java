package com.apps.repository;

import com.apps.entity.Employee;
import com.apps.projection.InlineLocation;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = InlineLocation.class)
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    
    public List<Employee> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(@Param("firstName") String firstName,@Param("lastName")String lastName);
}
