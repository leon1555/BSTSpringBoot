package com.example.accessingdatarest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "tree", path = "tree")
public interface TreeRepository extends PagingAndSortingRepository<TreeInput, Long> {
    List<TreeInput> findById(@Param("id") long id);
    List<TreeInput> findByInput(@Param("input") String input);
}
