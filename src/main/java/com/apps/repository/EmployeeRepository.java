/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.repository;

import com.apps.entity.Employee;
import com.apps.projection.InlineLocation;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author machine
 */
@RepositoryRestResource(excerptProjection = InlineLocation.class)
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    
    public List<Employee> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(@Param("firstName") String firstName,@Param("lastName")String lastName);
}
