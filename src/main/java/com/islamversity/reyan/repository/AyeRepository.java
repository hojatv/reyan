package com.islamversity.reyan.repository;

import com.islamversity.reyan.domain.Aye;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AyeRepository extends CrudRepository<Aye, Integer> {
}
