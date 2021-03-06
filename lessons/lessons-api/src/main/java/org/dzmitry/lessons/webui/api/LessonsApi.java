package org.dzmitry.lessons.webui.api;

import org.dzmitry.lessons.webui.dto.LessonDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "lessons-service", path = "/lessons-service/api")
public interface LessonsApi {

    @GetMapping("/lessons")
    List<LessonDto> getLessons();

}
