package com.smart.droid.natkati.auspicious;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuspiciousRepository extends JpaRepository<Auspicious, Integer> {

    List<Auspicious> findByYear(Integer year);

}
