package mapper;

import dto.CreateClassInfoDto;
import model.ClassInfo;

import java.util.List;
import java.util.stream.Collectors;

public class ClassInfoMapper {
    public ClassInfo classInfoToEntity(CreateClassInfoDto createClassInfoDto) {
        return ClassInfo
                .builder()
                .className(createClassInfoDto.getClassName())
                .startTime(createClassInfoDto.getStartTime())
                .endTime(createClassInfoDto.getEndTime())
                .dayOfWeek(createClassInfoDto.getDayOfWeek())
                .build();
    }
    public CreateClassInfoDto entityToDto(ClassInfo classInfo) {
        return CreateClassInfoDto
                .builder()
                .className(classInfo.getClassName())
                .startTime(classInfo.getStartTime())
                .endTime(classInfo.getEndTime())
                .dayOfWeek(classInfo.getDayOfWeek())
                .build();
    }
    public List<CreateClassInfoDto> toDtoList(List<ClassInfo> classInfoList) {
        return classInfoList
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
}
