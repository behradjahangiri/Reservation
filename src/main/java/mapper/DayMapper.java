//package mapper;
//
//import dto.CreateDayDto;
//import model.Day;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class DayMapper {
//    public Day toEntity(CreateDayDto createDayDto) {
//        return Day
//                .builder()
////                .id(createDayDto.getId())
//                .dayOfWeek(createDayDto.getDayOfWeek())
//                .classList(createDayDto.getClassList())
//                .build();
//    }
//    public CreateDayDto toDto(Day day) {
//        return CreateDayDto
//                .builder()
//                .id(day.getId())
//                .dayOfWeek(day.getDayOfWeek())
//                .classList(day.getClassList())
//                .build();
//    }
//    public List<CreateDayDto> toDtoList(List<Day> dayList) {
//        return dayList
//                .stream()
//                .map(this::toDto)
//                .collect(Collectors.toList());
//    }
//}
