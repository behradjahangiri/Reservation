package service;

import dto.CreateClassInfoDto;
import mapper.ClassInfoMapper;
import model.ClassInfo;
import repository.ClassInfoRepository;
import java.util.List;

public class ClassInfoService {
    private final ClassInfoMapper classInfoMapper = new ClassInfoMapper();
    private final ClassInfoRepository classInfoRepository = new ClassInfoRepository();

    public void save(CreateClassInfoDto createClassInfoDto) {
        ClassInfo classInfo = classInfoMapper.classInfoToEntity(createClassInfoDto);
        classInfoRepository.save(classInfo);
    }
    public void update(CreateClassInfoDto createClassInfoDto) {}
    public void delete(CreateClassInfoDto createClassInfoDto) {}
    public void findById(int createClassInfoDtoId) {}
    public List<CreateClassInfoDto> findAll() {
        return classInfoMapper.toDtoList(classInfoRepository.findAll());
    }
}
