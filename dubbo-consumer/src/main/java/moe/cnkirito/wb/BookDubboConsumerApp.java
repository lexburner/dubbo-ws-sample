package moe.cnkirito.wb;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-23
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "moe.cnkirito.wb")
public class BookDubboConsumerApp {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(BookDubboConsumerApp.class, args);
    }
}
