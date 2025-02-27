package org.example.springbootfoofighters.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbootfoofighters.DTO.HumanDTO;
import org.example.springbootfoofighters.Entity.HumanEntity;
import org.example.springbootfoofighters.Entity.TestRecord;
import org.example.springbootfoofighters.repository.HumanRepository;
import org.example.springbootfoofighters.service.HumanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/human")
public class HumanController {

    private final HumanService humanService;

    public HumanController(HumanService humanService) {
        this.humanService = humanService;
    }

//    @GetMapping("/getAll")
//    public List<HumanDTO> getAllHumans() {
//        return humanService.getHumans();
//    }

    @GetMapping("/getAll")
    public List<HumanDTO> getAllHumans() {
        return humanService.getHumans();
    }


    @GetMapping("/getById/{id}")
    public HumanDTO getHumansById(@PathVariable  Long id) {

        return humanService.getHumanById(id);
    }

    @PostMapping()
    public void saveHuman(@RequestBody  HumanDTO humanDTO) {
        humanService.saveHuman(humanDTO);
    }

    @GetMapping("/byName/{name}")
    public HumanEntity getHumansByName(@PathVariable String name) {
        return humanService.findHumanByName(name);
    }
@DeleteMapping("/{id}")
    public void deleteHumanById(@PathVariable Long id) {
        humanService.deleteHumanById(id);
    }

    @GetMapping("/AgelessThan/{age}")
    public List<HumanEntity> getHumansByAge(@PathVariable int age) {
        return humanService.getHumansByAge(age);
    }

    @PutMapping("/update/{id}")
    public void updateHuman(@PathVariable Long id, @RequestBody HumanDTO humanDTO) {
        humanService.updateHuman(humanDTO, id);
    }
}
