package org.example.springbootfoofighters.mapping;

import lombok.RequiredArgsConstructor;
import org.example.springbootfoofighters.DTO.HumanDTO;
import org.example.springbootfoofighters.Entity.HumanEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
//@RequiredArgsConstructor
public class HumanMapper {


    public  HumanDTO toHumanDTO(HumanEntity humanEntity){

        HumanDTO humanDTO = new HumanDTO();
        humanDTO.setName(humanEntity.getName());
        humanDTO.setAge(humanEntity.getAge());

        return humanDTO;
    }

    public  List<HumanDTO> toHumanDTOList(List<HumanEntity> humanEntity){
        return    humanEntity.stream()
                .map(source -> new HumanDTO(source.getName(), source.getAge()))
                .collect(Collectors.toList());


    }

    public  HumanEntity toHumanEntity(HumanDTO humanDTO){
        HumanEntity humanEntity = new HumanEntity();

        humanEntity.setName(humanDTO.getName());
        humanEntity.setAge(humanDTO.getAge());

        return humanEntity;
    }

}
