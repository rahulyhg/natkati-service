package com.smart.droid.natkati.naal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class NaalRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private NaalRepository naalRepository;


    @Test
    public void findById() {
        Naal naalTest = createNaalInstanse();
        entityManager.persist(naalTest);
        entityManager.flush();

        Optional<Naal> found = naalRepository.findById(2019001);
        assertThat(found.get().getCalDate()).isEqualTo(LocalDate.of(2019, 1, 1));
    }

    @Test
    public void findByNaal() {
        Naal naalTest = createNaalInstanse();
        entityManager.persist(naalTest);
        entityManager.flush();

        Optional<Naal> found = naalRepository.findByCalDate(LocalDate.of(2019, 1, 1));
        assertThat(found.get().getCalDate()).isEqualTo(LocalDate.of(2019, 1, 1));
    }

    @Test
    public void retriveAllRecords() {
        Naal naalTest = createNaalInstanse();
        entityManager.persist(naalTest);
        entityManager.flush();
        List<Naal> all = naalRepository.findAll();
        assertThat(all.size()).isEqualTo(1);
    }

    @Test
    public void retriveNatkalForMonth() {
        List<Naal> naalList = createMonthInstanse();
        for (Naal naal : naalList) {
            entityManager.persist(naal);
            entityManager.flush();
        }
        List<Naal> monthNatkal = naalRepository.findByCalDateBetween(LocalDate.of(2018, 11, 1), LocalDate.of(2018, 11, 30));
        assertThat(monthNatkal.size()).isEqualTo(3);
    }

    private List<Naal> createMonthInstanse() {

        List<Naal> naalList = new ArrayList<Naal>();

        Naal naal = new Naal();
        naal.setCalDate(LocalDate.of(2018, 11, 1));
        naal.setId(2018360);

        Naal naal1 = new Naal();
        naal1.setCalDate(LocalDate.of(2018, 11, 2));
        naal1.setId(2018361);

        Naal naal2 = new Naal();
        naal2.setCalDate(LocalDate.of(2018, 11, 30));
        naal2.setId(2018380);

        Naal naal3 = new Naal();
        naal3.setCalDate(LocalDate.of(2018, 10, 3));
        naal3.setId(2018301);

        naalList.add(naal);
        naalList.add(naal1);
        naalList.add(naal2);
        naalList.add(naal3);

        return naalList;

    }

    private Naal createNaalInstanse() {
        Naal naal = new Naal();
        naal.setCalDate(LocalDate.of(2019, 1, 1));

        naal.setId(2019001);

        return naal;
    }


}