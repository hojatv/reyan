package com.islamversity.reyan.repository;

import com.islamversity.reyan.domain.Surah;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurahRepository extends CrudRepository<Surah, Integer> {
}
