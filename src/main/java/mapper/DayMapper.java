package mapper;

import dto.CreateDayDto;
import model.Day;

public class DayMapper {
    public Day toEntity(CreateDayDto createDayDto) {
        return Day
                .builder()
//                .id(createDayDto.getId())
                .dayOfWeek(createDayDto.getDayOfWeek())
                .classList(createDayDto.getClassList())
                .build();
    }
    public CreateDayDto toDto(Day day) {
        return CreateDayDto
                .builder()
                .id(day.getId())
                .dayOfWeek(day.getDayOfWeek())
                .classList(day.getClassList())
                .build();
    }
}
