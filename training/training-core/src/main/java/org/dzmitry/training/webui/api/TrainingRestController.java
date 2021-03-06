package org.dzmitry.training.webui.api;

import lombok.AllArgsConstructor;
import org.dzmitry.lessons.dto.LessonDto;
import org.dzmitry.lessons.webui.api.LessonsApi;
import org.dzmitry.training.dto.Training;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TrainingRestController {

    private final LessonsApi lessonsApi;

    @GetMapping(value = "/{uuid}")
    public Training getTraining(@PathVariable String uuid) {

        Training training = new Training();
        training.setName("Java");
        training.setDescription("java core (JSE)/J2EE");

        List<LessonDto> lessons = lessonsApi.getLessons();
        training.setLessons(lessons);

        return training;
    }

}
