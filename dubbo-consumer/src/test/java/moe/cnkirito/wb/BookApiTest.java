package moe.cnkirito.wb;

import org.apache.dubbo.config.annotation.Reference;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookApiTest {

    @Reference
    BookApi bookApi;

    @Test
    public void test(){
        System.out.println(bookApi.sale());
    }

}
