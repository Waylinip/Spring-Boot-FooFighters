package org.example.springbootfoofighters.repository;

import org.example.springbootfoofighters.Entity.HumanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends JpaRepository<HumanEntity, Long> {

//    @Query("SELECT h FROM HumanEntity h")
//    List<HumanEntity> getAllHumans();
//
//    @Query("SELECT h FROM HumanEntity h where h.id = :id")
//    HumanEntity getHumanById(Long id);
//
HumanEntity findByName(String name);

List<HumanEntity> findHumanEntitiesByAgeLessThan(int age);
}
