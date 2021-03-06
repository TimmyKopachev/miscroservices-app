package org.dzmitry.training;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients(basePackages = {"org.dzmitry"})
@SpringBootApplication
public class TrainingApplicationRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(TrainingApplicationRunner.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
