package com.smart.droid.natkati.naal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface NaalRepository extends JpaRepository<Naal, Integer> {

    Naal findByCalDate(LocalDate calDate);
}
