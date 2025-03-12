package org.example.springbootfoofighters;

import org.example.springbootfoofighters.DTO.UserDTO;
import org.example.springbootfoofighters.Entity.UserEntity;
import org.example.springbootfoofighters.mapping.UserMapper;
import org.example.springbootfoofighters.repository.UserRepository;
import org.example.springbootfoofighters.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {


    private static UserDTO userDTO;
    private static UserEntity userEntity;

    @Mock
    private UserRepository userRepository;
    @Mock
    private UserMapper userMapper;
    @InjectMocks
    private UserService userService;

    @BeforeEach
     void init() {
        userDTO = new UserDTO();
        userEntity = new UserEntity();
    }

    @Test
    public void testSaveUser() {

        userDTO.setName("test");

when(userMapper.toUserEntity(userDTO)).thenReturn(userEntity);

when(userRepository.save(userEntity)).thenReturn(userEntity);

UserEntity actual = userService.save(userDTO);

Assertions.assertEquals(userEntity, actual);

//        public void  save(UserDTO userDTO) {
//            userRepository.save(userMapper.toUserEntity(userDTO));
//        }
    }

}
