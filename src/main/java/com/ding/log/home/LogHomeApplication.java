package com.ding.log.home;

 import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@EnableScheduling
@SpringBootApplication
public class LogHomeApplication {


    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(LogHomeApplication.class, args);
        log.info("LogHomeApplication success");


    }
}
