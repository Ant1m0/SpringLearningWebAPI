package ru.ant1m0.springlearningwebapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Slf4j
@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class SpringLearningWebApiApplication {

    public SpringLearningWebApiApplication(){
        log.info("HELLO!");
    }

}
