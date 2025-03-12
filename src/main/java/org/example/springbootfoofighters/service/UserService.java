package org.example.springbootfoofighters.service;

import lombok.RequiredArgsConstructor;
import org.example.springbootfoofighters.DTO.UserDTO;
import org.example.springbootfoofighters.Entity.UserEntity;
import org.example.springbootfoofighters.mapping.HumanMapper;
import org.example.springbootfoofighters.mapping.UserMapper;
import org.example.springbootfoofighters.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

 public List<UserDTO> findAll() {
     return userMapper.toUserDTOs(userRepository.findAll());
 }

 public UserDTO findById(Long id) {
     return userMapper.toUserDTO(userRepository.findById(id).get());
 }

 public  UserEntity  save(UserDTO userDTO) {
      return userRepository.save(userMapper.toUserEntity(userDTO));
 }

public void deleteById(Long id) {
     userRepository.deleteById(id);

}
public List<UserDTO> findByName(String name) {
     return userMapper.toUserDTOs(userRepository.findByName(name));
}

public void update(UserDTO userDTO, Long id) {
     UserEntity userEntity = userRepository.getById(id);
     userEntity.setName(userDTO.getName());
     userEntity.setAge(userDTO.getAge());
     userEntity.setIsActive(userDTO.getIsActive());
     userEntity.setPhoneNumber(userDTO.getPhoneNumber());
      userRepository.save(userEntity);
}
}
