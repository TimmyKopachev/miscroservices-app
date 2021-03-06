package org.dzmitry.lessons.core;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class LessonsApplicationRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(LessonsApplicationRunner.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
