package com.ab.resource.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ab.resource.persistence.model.Foo;

public interface IFooRepository extends PagingAndSortingRepository<Foo, Long> {
}
