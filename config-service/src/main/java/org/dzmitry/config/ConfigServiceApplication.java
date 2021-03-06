package org.dzmitry.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
@PropertySource(value = "classpath:config.properties", ignoreResourceNotFound = true)
public class ConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApplication.class, args);
    }
}
