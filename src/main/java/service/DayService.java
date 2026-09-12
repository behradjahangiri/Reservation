//package service;
//
//import dto.CreateDayDto;
//import mapper.DayMapper;
//import model.Day;
//import repository.DayRepository;
//
//import java.util.List;
//
//public class DayService {
//    private final DayMapper dayMapper = new DayMapper();
//    private final DayRepository dayRepository = new DayRepository();
//
//    public void save(CreateDayDto createDayDto) {
//        Day day = dayMapper.toEntity(createDayDto);
//        dayRepository.save(day);
//    }
//    public List<CreateDayDto> findAll() {
//        return dayMapper.toDtoList(dayRepository.findAll());
//    }
//}
