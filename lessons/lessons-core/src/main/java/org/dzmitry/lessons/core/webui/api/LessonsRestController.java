package org.dzmitry.lessons.core.webui.api;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dzmitry.lessons.webui.api.LessonsApi;
import org.dzmitry.lessons.webui.dto.LessonDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
public class LessonsRestController implements LessonsApi {

    List<LessonDto> lessons = Collections.emptyList();


    @PostConstruct
    private void setUp() {
        lessons.add(new LessonDto("topic: Exceptions"));
        lessons.add(new LessonDto("topic: Generic"));
        lessons.add(new LessonDto("topic: Collections"));
    }


    @Override
    public List<LessonDto> getLessons() {
        return lessons;
    }
}
