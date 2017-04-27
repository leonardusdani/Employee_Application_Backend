/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.repository;

import com.apps.entity.Employee;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author machine
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    
    public List<Employee> findByFirstNameContainingIgnoreCase(@Param("firstName") String firstName);
}
