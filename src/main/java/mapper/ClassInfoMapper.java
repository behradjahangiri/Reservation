package mapper;

import dto.CreateClassInfoDto;
import model.ClassInfo;

public class ClassInfoMapper {
    public ClassInfo classInfoToEntity(CreateClassInfoDto createClassInfoDto) {
        return ClassInfo
                .builder()
                .className(createClassInfoDto.getClassName())
                .classDuration(createClassInfoDto.getClassDuration())
                .startTime(createClassInfoDto.getStartTime())
                .endTime(createClassInfoDto.getEndTime())
                .build();
    }
    public CreateClassInfoDto entityToDto(ClassInfo classInfo) {
        return CreateClassInfoDto
                .builder()
                .className(classInfo.getClassName())
                .classDuration(classInfo.getClassDuration())
                .startTime(classInfo.getStartTime())
                .endTime(classInfo.getEndTime())
                .build();
    }
}
