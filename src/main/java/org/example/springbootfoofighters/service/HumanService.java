package org.example.springbootfoofighters.service;

import jakarta.persistence.EntityNotFoundException;
import org.example.springbootfoofighters.DTO.HumanDTO;
import org.example.springbootfoofighters.Entity.HumanEntity;
import org.example.springbootfoofighters.mapping.HumanMapper;
import org.example.springbootfoofighters.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.springbootfoofighters.mapping.HumanMapper.*;

@Service
//@RequiredArgsConstructor//создает нужные конструкторы
public class HumanService {

    private final HumanRepository humanRepository;
    private final HumanMapper humanMapper;

    public HumanService(HumanRepository humanRepository, HumanMapper humanMapper) {
        this.humanRepository = humanRepository;
        this.humanMapper = humanMapper;
    }

    public List<HumanDTO> getHumans(){
        return humanMapper.toHumanDTOList(humanRepository.findAll());
    }
    public HumanDTO getHumanById(Long id){
       // humanRepository.existsById(id);

            HumanEntity humanEntity =  humanRepository.findById(id).orElseThrow(
                    () -> new EntityNotFoundException("Human with id " + id + " not found")
            );
            return humanMapper.toHumanDTO(humanEntity);

    }

    public void saveHuman(HumanDTO humanDTO) {
        humanRepository.save(humanMapper.toHumanEntity(humanDTO));
    }

    public HumanEntity findHumanByName(String name) {
        return humanRepository.findByName(name);
    }

public void deleteHumanById(Long id){
        humanRepository.deleteById(id);
}

public List<HumanEntity> getHumansByAge(int age){
        return humanRepository.findHumanEntitiesByAgeLessThan(age);
}
public void updateHuman(HumanDTO humanDTO,Long id) {
       HumanEntity humanEntity = humanMapper.toHumanEntity(getHumanById(id));
       humanEntity.setId(id);
       humanEntity.setCreatedAt(humanEntity.getCreatedAt());
       humanEntity.setAge(humanDTO.getAge());
       humanEntity.setName(humanDTO.getName());
       humanRepository.save(humanEntity);
}

}
