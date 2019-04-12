package com.example.bookpub.repositoryO;

import com.example.bookpub.entityO.ClientRef;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRefRepository extends PagingAndSortingRepository<ClientRef, Long> {

    List<ClientRef> findAll();

}
