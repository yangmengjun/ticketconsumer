package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

/**
 * @author: yangmengjun
 * @date: 2019\3\26 0026 17:21
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.yang"})
public class TicketConsumerApplication {

    public static void main(String[] args) {
        Environment env = SpringApplication.run(TicketConsumerApplication.class, args).getEnvironment();
        System.out.println("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running!" +
                        "\n----------------------------------------------------------"+
                env.getProperty("spring.application.name"));
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
