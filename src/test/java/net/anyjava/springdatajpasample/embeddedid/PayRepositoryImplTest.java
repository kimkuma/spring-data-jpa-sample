package net.anyjava.springdatajpasample.embeddedid;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PayRepositoryImplTest {

    @Autowired
    private PayRepository payRepository;

    @Test
    public void testFindAllByShopName() {
        payRepository.findAllByShopName("가게");
    }
}