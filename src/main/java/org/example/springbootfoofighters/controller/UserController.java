package org.example.springbootfoofighters.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbootfoofighters.DTO.UserDTO;
import org.example.springbootfoofighters.Entity.UserEntity;
import org.example.springbootfoofighters.mapping.UserMapper;
import org.example.springbootfoofighters.service.HumanService;
import org.example.springbootfoofighters.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/findById/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping()
    public UserEntity save(@RequestBody UserDTO userDTO) {
        System.out.println("Пришел объект: " + userDTO);
          return userService.save(userDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteById(id);
    }

    @GetMapping("/findByName/{name}")
    public List<UserDTO> findByName(@PathVariable String name) {
        return userService.findByName(name);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody UserDTO userDTO, @PathVariable Long id) {
        userService.update(userDTO, id);
    }

    @GetMapping("/findAll")
    public List<UserDTO> findAll() {
        return userService.findAll();
    }
}
