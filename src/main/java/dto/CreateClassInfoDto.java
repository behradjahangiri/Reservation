package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.time.LocalTime;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CreateClassInfoDto {
    private Integer classID;
    private String className;
    private Integer classDuration;
    private LocalTime startTime;
    private LocalTime endTime;
    private DayOfWeek dayOfWeek;
//    private LocalDateTime dateClassStart;
//    private LocalDateTime dateClassEnd;
}
