package org.example.springbootfoofighters.mapping;

import lombok.RequiredArgsConstructor;
import org.example.springbootfoofighters.DTO.HumanDTO;
import org.example.springbootfoofighters.DTO.UserDTO;
import org.example.springbootfoofighters.Entity.HumanEntity;
import org.example.springbootfoofighters.Entity.UserEntity;
import org.example.springbootfoofighters.repository.UserRepository;

import org.mapstruct.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
         unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

     //@Mapping(target = "name", source = "firstname") она поможет если условно в Entity у нас поле называется name а в DTO firstname то мы укажем что к чему относится

     UserDTO toUserDTO(UserEntity userEntity);
     List<UserDTO> toUserDTOs(List<UserEntity> userEntity);
     @Mapping(target = "phoneNumber", expression = "java(deletePlus(userDTO.getPhoneNumber()))")
     UserEntity toUserEntity(UserDTO userDTO);

     default String deletePlus(String phoneNumber) {
          if(phoneNumber.startsWith("+")) {
               return phoneNumber.replace("+", "");
          }
        else return phoneNumber;
     }
}



//@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
//         unmappedSourcePolicy = ReportingPolicy.IGNORE)
//public interface UserMapper {
//
//    default UserDTO toUserDTO(UserEntity userEntity){
//
//        UserDTO userDTO = new UserDTO();
//        userDTO.setName(userEntity.getName());
//        userDTO.setAge(userEntity.getAge());
//userDTO.setIsActive(userEntity.getIsActive());
//        return userDTO;
//    }
//
//    default List<UserDTO> toUserDTOs(List<UserEntity> userEntity){
//        return userEntity.stream()
//                .map(source -> new UserDTO(source.getName(), source.getAge(), source.getIsActive()))
//                .collect(Collectors.toList());
//    }
//
//    default UserEntity toUserEntity(UserDTO userDTO){
//        UserEntity userEntity = new UserEntity();
//        userEntity.setName(userDTO.getName());
//        userEntity.setAge(userDTO.getAge());
//        userEntity.setIsActive(userDTO.getIsActive());
//        return userEntity;
//    }
//}
