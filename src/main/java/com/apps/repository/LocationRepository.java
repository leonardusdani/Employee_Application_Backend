package com.apps.repository;

import com.apps.entity.Location;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LocationRepository extends PagingAndSortingRepository<Location, Integer>{
    
}
