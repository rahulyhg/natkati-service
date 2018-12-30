package com.smart.droid.natkati.festive;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class FestiveRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private FestiveRepository festiveRepository;

    @Test
    public void findByYear() {

        List<Festive> festiveList = createFestiveInstanses();
        for (Festive festive : festiveList) {
            entityManager.persist(festive);
            entityManager.flush();
        }
        List<Festive> queriedFestiveList = festiveRepository.findByYear(2018);
        assertThat(queriedFestiveList.size()).isEqualTo(2);
    }

    private List<Festive> createFestiveInstanses() {
        List<Festive> festiveList = new ArrayList<>();

        Festive festive = new Festive();
        festive.setFestiveId(1);
        festive.setYear(2018);

        Festive festive1 = new Festive();
        festive1.setFestiveId(2);
        festive1.setYear(2018);

        Festive festive2 = new Festive();
        festive2.setFestiveId(3);
        festive2.setYear(2019);

        festiveList.add(festive);
        festiveList.add(festive1);
        festiveList.add(festive2);

        return festiveList;
    }
}