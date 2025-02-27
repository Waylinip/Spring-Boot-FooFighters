package org.example.springbootfoofighters.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "humans", schema = "fighters")
@Data
public class HumanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private Long id;

    @Column
    @JsonProperty
    private String name;

    @Column
    @JsonProperty
    private  int age;

    @Column
    @JsonProperty
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column
    @JsonProperty
    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
