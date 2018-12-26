package com.smart.droid.natkati.festive;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FestiveRepository extends JpaRepository<Festive, Integer> {

    List<Festive> findByYear(Integer year);
}
