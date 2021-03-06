package org.dzmitry.training.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.dzmitry.lessons.dto.LessonDto;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Training {

    private String name;
    private String description;
    private List<LessonDto> lessons;
}
