package com.smart.droid.natkati.naal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
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

    private Naal createNaalInstanse() {
        Naal naal = new Naal();
        naal.setCalDate(LocalDate.of(2019, 1, 1));

        naal.setId(2019001);

        return naal;
    }


}