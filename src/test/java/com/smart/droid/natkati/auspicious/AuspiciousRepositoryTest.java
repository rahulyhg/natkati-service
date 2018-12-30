package com.smart.droid.natkati.auspicious;

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
public class AuspiciousRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private AuspiciousRepository auspiciousRepository;

    @Test
    public void findByYear() {
        List<Auspicious> auspiciousList = createAuspiciousInstanses();
        for (Auspicious auspicious : auspiciousList) {
            entityManager.persist(auspicious);
            entityManager.flush();
        }
        List<Auspicious> queriedAuspList = auspiciousRepository.findByYear(2018);
        assertThat(queriedAuspList.size()).isEqualTo(2);
    }

    private List<Auspicious> createAuspiciousInstanses() {
        List<Auspicious> auspiciousList = new ArrayList<>();

        Auspicious auspicious = new Auspicious();
        auspicious.setAuspiciousID(1);
        auspicious.setYear(2018);

        Auspicious auspicious1 = new Auspicious();
        auspicious1.setAuspiciousID(2);
        auspicious1.setYear(2018);

        Auspicious auspicious2 = new Auspicious();
        auspicious2.setAuspiciousID(3);
        auspicious2.setYear(2019);

        auspiciousList.add(auspicious);
        auspiciousList.add(auspicious1);
        auspiciousList.add(auspicious2);

        return auspiciousList;
    }

}